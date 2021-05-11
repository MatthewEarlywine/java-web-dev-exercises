package org.launchcode.java.demos.technology;

import java.util.ArrayList;

public abstract class AbstractEntity {
    private static java.lang.Object Object;
    int abstractID = 0;
    int IDCounter = 0;

    public void entityID() {
        if (Object instanceof Computer == true) {
            abstractID++;
            IDCounter = abstractID;
        }
    }

    public int getAbstractID() {
        return abstractID;
    }
}
