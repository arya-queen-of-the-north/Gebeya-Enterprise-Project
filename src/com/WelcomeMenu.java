package com;

import java.util.ArrayList;

public class WelcomeMenu extends Menu {

    public WelcomeMenu() {
    }

    public WelcomeMenu(String title) {
        super(title);
    }

    @Override
    protected void processInput() {
        switch (userInput){
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;
        }

    }
}
