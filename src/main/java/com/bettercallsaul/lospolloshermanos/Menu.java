package com.bettercallsaul.lospolloshermanos;

import java.util.ArrayList;

public class Menu {

    ArrayList<MenuItem> menuItemArrayList = new ArrayList<>();

    public boolean addMenuItem(MenuItem newMenuItem) throws IllegalArgumentException {
        return menuItemArrayList.add(newMenuItem);
    }

    public boolean doesMenuItemExist(MenuItem newMenuItem) {
        boolean exists = false;

        if (menuItemArrayList.contains(newMenuItem)) {
            exists = true;
        }

        return exists;
    }

}
