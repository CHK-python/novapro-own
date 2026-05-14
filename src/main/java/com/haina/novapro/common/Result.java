package com.haina.novapro.common;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T Data;

    public static <T> Result<T> success(T Data){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("success");
        result.setData(Data);
        return result;
    }

    public static Result<?> fail(String message){
        Result<?> result = new Result<>();
        result.setCode(400);
        result.setMessage(message);
        return result;
    }

}
