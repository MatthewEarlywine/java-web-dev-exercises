package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        double PI = 3.14;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        /*try{if (input.hasNextDouble() != true){
            System.out.println("That is not a valid radius amount.");
            return;
        };} catch (Throwable InputMismatchException) {
            System.out.println("There was an error, but the program keeps going.");
        }*/
        input.close();

        if (radius <= 0){
            System.out.println("That is not a valid radius amount.");
            return;
        };



        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}


