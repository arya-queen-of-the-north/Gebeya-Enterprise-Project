package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Menu {

    private String title;
    public List<MenuItem> menuItems = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int userInput;


    public Menu() {
    }

    public Menu(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void addMenuItem(int choice,String description){
        MenuItem menuItem = new MenuItem(choice,description);
        menuItems.add(menuItem);


    }

    public void showMenu(){
        System.out.println("Welcome To Gebeya Enterprise!");
       for(MenuItem menuItem:
               menuItems){
           System.out.println(menuItem);;
       }

    }

    public void waitForInput(){

        System.out.println("Enter Choice");
        userInput = scanner.nextInt();
        while(userInput > menuItems.size()){

            System.out.println("Invalid choice, try again");
            userInput = scanner.nextInt();
        }


    }

    protected abstract void processInput();




    public void start(){
        showMenu();
    }

}
