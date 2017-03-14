package com.jin.result;

/**
 * http返回包装类
 * Created by jinyao on 2017/3/14.
 */
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMasg() {
        return msg;
    }

    public void setMasg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", masg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
