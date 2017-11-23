package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.error;

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
