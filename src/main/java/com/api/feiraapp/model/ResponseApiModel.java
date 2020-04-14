package com.api.feiraapp.model;

public class ResponseApiModel {

    private String msg;
    private long code;

    public ResponseApiModel(String msg, long code) {
        this.msg = msg;
        this.code = code;
    }

    public ResponseApiModel() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
}
