package org.launchcode.java.demos.lsn2controlflowandcollections.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
       // String newStudent;
        int newID;
        String newStudent;

        System.out.println("Enter your students (or '0' to finish):");

        // Get student names and IDs
        do {

            System.out.print("ID Number: ");
            newID = input.nextInt();

            if (newID != 0) {
                System.out.print("Student Name: ");
                input.nextLine();
                newStudent = input.nextLine(); //changed from .nextLine, which for some reason wold not deposit
                students.put(newID, newStudent);  //assigned value to newStudent.

                // Read in the newline before looping back

            }

        } while(newID != 0);

        input.close();

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }
    }
}
