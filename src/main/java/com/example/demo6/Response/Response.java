package com.example.demo6.Response;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Response {
    @JsonIgnore
    private String name;
    private String msg;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    
}
