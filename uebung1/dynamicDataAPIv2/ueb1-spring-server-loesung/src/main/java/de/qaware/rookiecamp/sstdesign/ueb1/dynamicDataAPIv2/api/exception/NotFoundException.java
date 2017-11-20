package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.exception;

import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model.Error;

public class NotFoundException extends ApiException {

    public NotFoundException (Error.ErrorCode code, String msg) {
        super(code, msg);
    }
}
