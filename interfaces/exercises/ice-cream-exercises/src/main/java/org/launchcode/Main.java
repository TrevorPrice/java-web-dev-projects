package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator1 = new FlavorComparator();
        flavors.sort(comparator1);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator comparator2 = new ConeComparator();
        cones.sort(comparator2);
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("SORTED FLAVORS:");
        flavors.stream().forEach((f) -> System.out.println(f.getName()));
        System.out.println("SORTED CONES:");
        cones.stream().forEach((c) -> System.out.println(c.getName() + ": " + c.getCost()));
    }
}