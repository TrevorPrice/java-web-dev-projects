package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem(10.99,"Burger", "Main Course", true);
        MenuItem item2 = new MenuItem(3.99, "Brownie", "Dessert", false);
        MenuItem item3 = new MenuItem(5.50, "Cheese Curds", "Appetizer", true);

        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        java.util.Date date = new java.util.Date();
//        System.out.println(date);
        Menu ourMenu = new Menu(date, items);

        System.out.println(item1);
        System.out.println(ourMenu);

        items.remove(item1);
        System.out.println(ourMenu);
    }
}
