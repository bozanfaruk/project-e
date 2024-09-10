package com.farukbozan.projecte.designpatterns.structural.adapter.xml;

public class XML {

    private final String xmlContent;

    public XML(String xmlContent) {
        this.xmlContent = xmlContent;
    }

    public String getXmlContent() {
        return xmlContent;
    }
}
