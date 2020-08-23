package com.algaworks.osworks.exception;

public class DomainException extends RuntimeException {
    private static final long serialVersionID = 1L;

    public DomainException(String message){
        super(message);
    }
}
