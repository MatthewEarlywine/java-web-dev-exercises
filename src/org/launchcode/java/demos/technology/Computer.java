package org.launchcode.java.demos.technology;

public abstract class Computer extends AbstractEntity{
    public double memoryTB;
    public int GBram;
    public String internetConnection = "WiFi";

    public Computer (double memoryTB, int GBram, String aInternetConnection){
        this.memoryTB = memoryTB;
        this.GBram = GBram;
        this.internetConnection = aInternetConnection;
    }

    public double getMemoryTB() {
        return memoryTB;
    }

    public void setMemoryTB(double memoryTB) {
        this.memoryTB = memoryTB;
    }

    public int getGBram() {
        return GBram;
    }

    public void setGBram(int ram) {
        this.GBram = GBram;
    }

    public String getInternetConnection() {
        return internetConnection;
    }

    public void setInternetConnection(String internetConnection) {
        this.internetConnection = internetConnection;
    }
}
