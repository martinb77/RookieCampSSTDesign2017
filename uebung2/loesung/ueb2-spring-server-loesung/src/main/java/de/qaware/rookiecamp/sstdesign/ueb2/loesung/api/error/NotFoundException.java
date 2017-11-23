package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.error;

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
