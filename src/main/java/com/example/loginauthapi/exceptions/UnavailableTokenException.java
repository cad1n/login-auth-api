package com.example.loginauthapi.exceptions;

public class UnavailableTokenException extends RuntimeException {
    public UnavailableTokenException(String message) {
        super(message);
    }
}
