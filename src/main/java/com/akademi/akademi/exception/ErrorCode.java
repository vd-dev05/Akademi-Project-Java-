package com.akademi.akademi.exception;

public enum ErrorCode {

    UNCATEGORIZED_EXCEPTION(9999,"Uncategorized error"),
    USER_EXISTED(1002,"User existed"),
    USERNAME_INVALID(1003,"User must be at 3 charaters")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private  int code ;
    private  String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
