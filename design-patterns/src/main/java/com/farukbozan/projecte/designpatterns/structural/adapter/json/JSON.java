package com.farukbozan.projecte.designpatterns.structural.adapter.json;

public class JSON {

    private final String jsonContent;

    public JSON(String jsonContent) {
        this.jsonContent = jsonContent;
    }

    public String getJsonContent() {
        return jsonContent;
    }
}
