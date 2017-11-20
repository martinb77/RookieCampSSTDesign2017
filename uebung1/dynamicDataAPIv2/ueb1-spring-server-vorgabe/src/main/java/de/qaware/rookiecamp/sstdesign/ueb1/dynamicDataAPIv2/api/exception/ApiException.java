package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.exception;


import org.springframework.http.HttpStatus;

/**
 * Exception describing a service failure with the corresponding http status.
 *
 */
public class ApiException extends Exception{
    private HttpStatus code;
    public ApiException (HttpStatus code, String msg) {
        super(msg);
        this.code = code;
    }

    public HttpStatus getHttpCode() {
        return code;
    }
}
