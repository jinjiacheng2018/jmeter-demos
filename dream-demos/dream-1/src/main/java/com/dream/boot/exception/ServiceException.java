package com.dream.boot.exception;

/**
 * Description: 自定义异常
 *
 *@author JinJiacheng
 *@date 2019/8/7 22:37
 */
public class ServiceException extends RuntimeException {

    public ServiceException()
    {
        super();
    }

    public ServiceException(String exceptionStr)
    {
        super(exceptionStr);
    }

}
