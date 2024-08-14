package com.redhash.patterns.adapter;

import org.json.JSONObject;
import org.json.XML;

public class XMLToJSONAdapter implements JSONData {
    private XMLData xmlData;

    public XMLToJSONAdapter(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String getJSON() {
        String xml = xmlData.getXML();
        JSONObject jsonObject = XML.toJSONObject(xml);
        return jsonObject.toString(4);
    }
}
