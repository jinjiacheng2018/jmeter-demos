package com.dream.boot.api;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Slf4j
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message<T>
{
    
    private String code;    //代码
    
    private T data;         //数据
    
    private String msg = "";    //信息
    
    private String exception;   //异常
    
    private Integer status = 1; //状态码：0异常，1正常，-1重新登录
    
    public String getCode()
    {
        return code;
    }
    
    public void setCode(String code)
    {
        this.code = code;
    }
    
    public T getData()
    {
        return data;
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
    
    public String getMsg()
    {
        return msg;
    }
    
    public void setMsg(String msg)
    {
        this.msg = msg;
    }
    
    public String getException()
    {
        return exception;
    }
    
    public void setException(String exception)
    {
        this.exception = exception;
    }
    
    public Integer getStatus()
    {
        return status;
    }
    
    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    public static Message message(String msg)
    {
        Message message = new Message();
        message.setMsg(msg);
        return message;
    }
    
    public static <T> Message<T> data(T data)
    {
        Message<T> message = new Message<T>();
        message.setData(data);
        return message;
    }
    
    public String toJson()
    {
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(this);
        }
        catch (JsonProcessingException e)
        {
            log.error(e.getMessage(), e);
            return "";
        }
    }
}
