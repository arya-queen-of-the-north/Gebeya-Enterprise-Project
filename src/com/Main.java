package com;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        WelcomeMenu welcomeMenu = new WelcomeMenu();
        MenuItem menuItem = new MenuItem();
        menuItem.addMenuItem(1,"Continue as Talent");
        menuItem.addMenuItem(2,"Continue as Client");
        menuItem.addMenuItem(0,"Exit");

        menuItem.showMenu();
        welcomeMenu.waitForInput();
        welcomeMenu.start();



    }
}
