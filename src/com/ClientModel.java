package com;

public class ClientModel extends BookingModel{

    private String name;
    private long phoneNumber;

    public ClientModel() {
    }

    public ClientModel(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
