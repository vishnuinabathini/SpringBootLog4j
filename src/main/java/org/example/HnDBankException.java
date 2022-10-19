package org.example;

public class HnDBankException extends Exception{
    String message;
    public HnDBankException(String message)
    {
        this.message = message;
    }
    public String getMessage()
    {
        return this.message;

    }

}