package com.company.Errors;

public class BadRequestAlertException extends Exception {
    public BadRequestAlertException(String message) {
        super(message);
    }
}