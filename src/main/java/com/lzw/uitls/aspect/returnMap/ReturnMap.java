package com.lzw.uitls.aspect.returnMap;

import java.io.Serializable;

/**
 * Created by LZW on 2017/12/12.
 */
public class ReturnMap implements Serializable{

    public ReturnMap(){
    }
    public ReturnMap(String status){
        setStatus(status);
    }
    public ReturnMap(String status,String message){
        setStatus(status);
        setMessage(message);
    }
    public ReturnMap(String status,Object data){
        setStatus(status);
        setData(data);
    }

    private String status;
    private String message;
    private Object data;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
