package org.wheatherForecast;

public class StatusNotFoundException extends  RuntimeException{

    public StatusNotFoundException(String message)
    {
        super(message);
    }
}
