package org.launchcode.java.demos.technology;

public class SmartPhone extends Computer{
    public boolean camera = false;

    public SmartPhone(double memoryTB, int GBram, String internetConnection, boolean camera) {
        super(memoryTB, GBram, internetConnection);
        this.camera = camera;
    }

    public void makePhoneCall(String phoneNum){
        if (phoneNum.length() > 11){
            System.out.println("You're phone plan doesn't allow for international calls.");
        } else if ( phoneNum.length() >= 7 && phoneNum.length() <= 11){
            System.out.println("The phone is ringing...");
        } else {
            System.out.println("That is not a valid telephone number");
        }
        // Ignoring 911 and other emergency numbers for this project.
    }

    public boolean camIsOn(){
        if(camera == false){
            return camera = true;
        } else {
            return camera = false;
        }
    }

    public void takePicture(){
        camIsOn();
        System.out.println("FLASH!");
    }

}
