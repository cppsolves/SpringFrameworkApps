package org.JavaAPICustomLibrary.CustomExceptionCollection;

public class StatusNotFoundException extends RuntimeException
{
    public StatusNotFoundException(String message)
    {
        super(message);
    }
}
