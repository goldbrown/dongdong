package com.chris.dongdong.dto;

public class CommonResponse<T> {
    private int code;
    private T data;
    private String msg;

    // 无参构造器
    public CommonResponse() {
    }

    // 全参构造器
    public CommonResponse(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public CommonResponse(int code, String msg) {
        this.code = code;
        this.data = null;
        this.msg = msg;
    }

    public static CommonResponse success() {
        return new CommonResponse(200, null, "success");
    }

    public static CommonResponse success(Object data) {
        return new CommonResponse(200, data, "success");
    }

    public static CommonResponse fail(int code, String msg) {
        return new CommonResponse(code, null, msg);
    }

    // Getter & Setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}