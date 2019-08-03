package com.jmeter.boot.exceptions;

public class ServiceException extends RuntimeException {

    public ServiceException()
    {
        super();
    }

    public ServiceException(String exceptionKey)
    {
        super(exceptionKey);
    }

}
