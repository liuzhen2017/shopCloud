package com.liuzhen.util.common.util;

import lombok.Data;

@Data
public class Result {
    private static int successCode=0;
    private static int errorCode=1;
    private int code;
    private String message;
    private Object data;

    public static Result success(Object data){
        return new Result(successCode,null,data);
    }
    public static Result error(int code,String message){
        return new Result(code,message,null);
    }
    public static Result error(String message){
        return new Result(errorCode,message,null);
    }

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
