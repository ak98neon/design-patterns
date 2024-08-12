package com.redhash.patterns.decorator;

public class App {

    public static void main(String[] args) {
        var file = new EncryptionDecorator(new FileDataSource("test.txt"));
        file.writeData("Hello, World!");
        System.out.println(file.readData());
    }
}
