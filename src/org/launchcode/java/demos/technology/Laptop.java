package org.launchcode.java.demos.technology;

public class Laptop extends Computer{
    public boolean wordProcessor = false;

    public Laptop(double memoryTB, int GBram, String internetConnection, boolean wordProcessor) {
        super(memoryTB, GBram, internetConnection);
        this.wordProcessor = wordProcessor;
    }

    public void activateProcessor(){
        if (wordProcessor == false){
            wordProcessor = true;
            System.out.println("The word processor is now activated.");
        } else if ( wordProcessor = true){
            wordProcessor = false;
            System.out.println("Be sure to save you file before exiting the program.");
        }
    }
}
