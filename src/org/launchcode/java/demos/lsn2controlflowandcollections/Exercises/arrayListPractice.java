package org.launchcode.java.demos.lsn2controlflowandcollections.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayListPractice {

    public static void main(String[] args) {
        int[] intList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int finalSum = evenSum(intList);
        System.out.println(finalSum);

        String testString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        print5LetterWords(testString);
    }

    public static int evenSum(int[] arrayOfInts){
        int sum = 0;
        for (int num : arrayOfInts){
            if(num % 2 == 0){
                System.out.println(num);
                sum += num;
            }
        } return sum;
    }

    public static void print5LetterWords(String sampleString){
        List<String> wordList;

        String[] listOfWords = sampleString.split(" ");
        wordList = Arrays.asList(listOfWords);
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of letters you want your words to have: ");

        int numOfLetters = input.nextInt();

        for(String word : wordList){
            //int wordLength;

            if(word.contains(".")){
                word = word.replace(".", "");
            } else if (word.contains(",")){
                word = word.replace(",", "");
            }

            if (word.length() == numOfLetters){
                System.out.println(word);
            }
        }
      return;
    }
}
