package com;

public class TalentModel extends BookingModel{

    private String name;
    private String email;

    public TalentModel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public TalentModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
