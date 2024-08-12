package com.redhash.patterns.decorator;

public interface DataSource {

    void writeData(String data);

    String readData();
}
