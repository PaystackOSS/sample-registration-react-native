package com.sampleregistrationrn.model;

public class TerminalResponse {
    private final String statusCode;
    private final String message;
    private final String data;

    public TerminalResponse(String statusCode, String message, String data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public String getData() {
        return data;
    }
}
