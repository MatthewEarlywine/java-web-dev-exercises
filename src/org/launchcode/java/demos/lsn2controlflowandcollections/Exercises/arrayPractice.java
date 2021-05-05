package org.launchcode.java.demos.lsn2controlflowandcollections.Exercises;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 1, 2, 3, 5, 8};
        String testString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        for (int i = 0; i < arrayFirst.length; i++){
            if (arrayFirst[i] % 2 != 0) {
                System.out.println(arrayFirst[i]);
            }
        }

        String[] testStringArray = testString.split(" ");
        System.out.println(Arrays.toString(testStringArray));

        String[] testStringArray2 = testString.split("\\.");
        System.out.println(Arrays.toString(testStringArray2));

    }
}
