package com.sup.result;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result<T> implements Serializable {

    private Integer code;//设置编码，1为成功，0为失败
    private String msg;//错误的信息
    private T data;//数据

    public static<T> Result<T> success(){
        Result result=new Result();
        result.code=1;
        return result;
    }

    public static<T> Result<T> success(T object){
        Result<T> result=new Result<T>();
        result.code=1;
        result.data=object;
        return result;
    }

    public static<T> Result<T> error(String msg){
        Result result=new Result();
        result.code=0;
        result.msg=msg;
        return result;
    }
}
