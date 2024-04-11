package org.launchcode;

public class Array {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        //loop through the array and print odd numbers only
        for (int i : integerArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] words = phrase.split(" ");
        String[] sentences = phrase.split("\\.");
//        System.out.println(words.toString());
        for (String i : sentences) {
            System.out.println(i);
        }
    }
}
