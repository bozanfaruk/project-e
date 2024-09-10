package com.farukbozan.projecte.designpatterns.structural.adapter;

import com.farukbozan.projecte.designpatterns.structural.adapter.json.JSON;
import com.farukbozan.projecte.designpatterns.structural.adapter.json.JSONContent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContentObjectAdapterTest {

    @Test
    void should_adapt() {
        //GIVEN
        var content = "This is json value :)";

        var jsonContent = new JSONContent() {

            @Override
            public JSON getContent(String content) {
                return new JSON("This is json value :)");
            }

        };

        var adapter = new ContentObjectAdapter(jsonContent);

        //WHEN
        var xml = adapter.getContent(content);

        //THEN
        assertEquals(content, xml.getXmlContent());
    }

}
