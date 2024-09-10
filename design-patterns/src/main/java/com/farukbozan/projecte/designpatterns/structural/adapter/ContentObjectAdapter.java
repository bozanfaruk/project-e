package com.farukbozan.projecte.designpatterns.structural.adapter;

import com.farukbozan.projecte.designpatterns.structural.adapter.json.JSONContent;
import com.farukbozan.projecte.designpatterns.structural.adapter.xml.XML;
import com.farukbozan.projecte.designpatterns.structural.adapter.xml.XMLContent;

public class ContentObjectAdapter implements XMLContent {

    private final JSONContent jsonContent;

    public ContentObjectAdapter(JSONContent jsonContent) {
        this.jsonContent = jsonContent;
    }

    @Override
    public XML getContent(String content) {
        return new XML(jsonContent.getContent(content).getJsonContent());
    }

}
