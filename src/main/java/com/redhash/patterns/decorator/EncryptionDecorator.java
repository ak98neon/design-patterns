package com.redhash.patterns.decorator;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        var arr = data.getBytes();
        for (int i = 0; i < arr.length; i++) {
            arr[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(arr);
    }

    private String decode(String data) {
        var arr = Base64.getDecoder().decode(data);
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= (byte) 1;
        }

        return new String(arr);
    }
}
