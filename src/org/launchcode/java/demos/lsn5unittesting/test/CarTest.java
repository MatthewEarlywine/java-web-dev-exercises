package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
// We can access assertEquals with this import as well, but we must use the Assert object to access the method
import org.junit.Assert;

// assertEquals is a static method; must be imported as such
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {

    Car test_car;

    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        // Assert.assertEquals(10, 10, .001) is another valid way to do this with the first import
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

/*    @Test
    public void testInitialGasTank(){
        assertFalse(test_car.getGasTankLevel() == 0);
    }

    @Test
    public void testInitialGasTank(){
        assertTrue(test_car.getGasTankLevel() == 10);
    }*/

    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}
