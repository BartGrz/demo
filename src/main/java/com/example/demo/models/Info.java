package com.example.demo.models;

import lombok.Getter;

public class Info {

    @Getter
    private String category ;

    public Info(String category) {
        this.category = category;
    }
}
