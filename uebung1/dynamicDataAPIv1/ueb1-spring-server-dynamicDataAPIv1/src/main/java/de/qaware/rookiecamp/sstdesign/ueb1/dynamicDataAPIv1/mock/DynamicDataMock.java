package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.mock;

import com.google.gson.Gson;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.exception.ApiException;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.DynamicDataDO;
import org.springframework.http.HttpStatus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Mock that returns dynamicDataDO objects for 1 TestVIN
 */
public class DynamicDataMock {

    private static final List<String> TESTVINS;

    static {
        TESTVINS = new ArrayList<>();
        TESTVINS.add("V1234567891234567"); // VIN ok
        TESTVINS.add("V1234567891234568"); // VIN Internal backend error
    }

    /**
     *
     * @param vin
     * @return dynamic vehicle data if vin exists
     * @throws ApiException 404 if vehicle not supported, 503 if file not found or unexpected error orccurd
     */
    public DynamicDataDO obtainDynamicDataDO(String vin) throws ApiException {
        DynamicDataDO dynamicDataDO = null;
        if (!TESTVINS.contains(vin)) {
            throw new ApiException(HttpStatus.NOT_FOUND, "vehicle not found");
        }

        try {
            Gson gson = new Gson();

            Scanner scanner = null;
            String text = getFileFromResources("testVIN/dynamicDataAPIv1-" + vin + ".json");

            dynamicDataDO = gson.fromJson(text, DynamicDataDO.class);
        }catch (RuntimeException e){
            throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Unexpected internal error");
        }
        return dynamicDataDO;
    }

    /**
     *
     * @param fileName in resources folder
     * @return the string content of the specified file
     * @throws ApiException 500 if file gould not be found
     */
    private String getFileFromResources(String fileName) throws ApiException {

        StringBuilder result = new StringBuilder("");

        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();

            return result.toString();

        } catch (FileNotFoundException e) {
            throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, "File not found");
        }
    }
}
