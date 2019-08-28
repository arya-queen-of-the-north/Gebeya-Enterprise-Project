package com;

public class MenuItem extends Menu {

    private int choice;
    private String description;

    public MenuItem() {

    }


    public MenuItem(int choice, String description) {
        this.choice = choice;
        this.description = description;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String show(int choice,String description){
        return choice + description;
    }

    @Override
    public void processInput() {

    }

    @Override
    public String toString() {
        return String.format("%d. %s",choice,description);
    }
}
