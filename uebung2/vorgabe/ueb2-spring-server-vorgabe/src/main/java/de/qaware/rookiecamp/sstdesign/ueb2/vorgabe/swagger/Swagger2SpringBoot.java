package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.swagger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * This class enables Spring-Boot and Springfox with Swagger 2 syntax.
 * Take care of the component scan package.
 *
 * See @{@link de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.swagger.configuration.SwaggerDocumentationConfig} for
 * further Springfox Swagger configuration.
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "de.qaware.rookiecamp.sstdesign.ueb2.vorgabe" })
public class Swagger2SpringBoot implements CommandLineRunner {

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
}
