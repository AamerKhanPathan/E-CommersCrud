package com.bikkadit.crud_operation.Response;

import org.springframework.stereotype.Component;


public class ApiResponse {
   private String msg;
   private  Long id;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ApiResponse(String msg, Long id) {
        this.msg = msg;
        this.id = id;
    }
}
