package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.exception;

import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model.Error;

public class ApiException extends Exception{
    private Error.ErrorCode code;
    public ApiException (Error.ErrorCode code, String msg) {
        super(msg);
        this.code = code;
    }

    public Error.ErrorCode getErrorCode() {
        return code;
    }
}
