package com.redhash.patterns.adapter;

public class App {

    public static void main(String[] args) {
        // XML data (usually this would come from some external source)
        String xmlContent = "<person><name>John Doe</name><age>30</age></person>";
        XMLData xmlData = new XMLData(xmlContent);

        // Adapter to convert XML to JSON
        JSONData jsonData = new XMLToJSONAdapter(xmlData);

        // Client expects JSON format
        System.out.println("JSON Output:");
        System.out.println(jsonData.getJSON());
    }
}
