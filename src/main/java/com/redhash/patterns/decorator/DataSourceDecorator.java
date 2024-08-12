package com.redhash.patterns.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DataSourceDecorator implements DataSource {

    private final DataSource dataSource;


    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
