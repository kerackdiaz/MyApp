package com.example.myApp.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

public class MyRequest {
    @Schema(description = "The data to be submitted", example = "Hello")
    private  String data;

    public MyRequest(String data) {
        this.data = data;
    }

    public MyRequest() {
    }

    public String getData() {
        return data;
    }
}