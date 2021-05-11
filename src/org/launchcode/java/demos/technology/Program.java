package org.launchcode.java.demos.technology;

import org.junit.Test;
import org.junit.Before;

import org.launchcode.java.demos.technology.Computer;
import org.launchcode.java.demos.technology.Laptop;
import org.launchcode.java.demos.technology.SmartPhone;
import org.launchcode.java.demos.technology.AbstractEntity;

import static org.junit.Assert.*;

public class Program {

    Laptop test_laptop;
    SmartPhone test_smartPhone;


    @Before
    public void createLaptopObject(){
        test_laptop = new Laptop(1, 16, "EtherNet Cable", false);
    }

    @Before
    public void createSmartPhoneObject(){
        test_smartPhone = new SmartPhone(.06, 8, "WiFi", false);
    }

    @Test
    public void emptyTest(){
        assertEquals(10, 10);
    }

    @Test
    public void inheritsSuper(){
        assertEquals(1, test_laptop.getMemoryTB(), .001);
        assertEquals(16, test_laptop.getGBram(), .001);
        assertEquals("EtherNet Cable", test_laptop.getInternetConnection());
        assertFalse(.01, test_smartPhone.getMemoryTB(), .001);
        assertFalse(16, test_smartPhone.getGBram(), .001);
        assertFalse("EtherNet Cable", test_smartPhone.getInternetConnection());
        assertEquals(.06, test_smartPhone.getMemoryTB(), .001);
        assertEquals(8, test_smartPhone.getGBram(), .001);
        assertEquals("WiFi", test_smartPhone.getInternetConnection());
        assertTrue(test_laptop instanceof Computer);

    }

    private void assertFalse(String etherNet_cable, String internetConnection) {
    }

    private void assertFalse(double v, double memoryTB, double v1) {
    }


}
