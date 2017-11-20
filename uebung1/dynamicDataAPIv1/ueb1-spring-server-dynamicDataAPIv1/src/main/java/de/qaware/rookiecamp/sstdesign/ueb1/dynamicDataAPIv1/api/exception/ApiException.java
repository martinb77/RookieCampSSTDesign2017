package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.exception;

import org.springframework.http.HttpStatus;

public class ApiException extends Exception {
    public HttpStatus getCode() {
        return code;
    }

    private HttpStatus code;

    public ApiException(HttpStatus code, String msg) {
        super(msg);
        this.code = code;
    }


}
