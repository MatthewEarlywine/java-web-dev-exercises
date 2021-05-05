package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    public String teacher;
    public ArrayList<Student> classRoster = new ArrayList<>();
    public double numberOfCredits;

    public Course (String teacher, ArrayList<Student> classRoster, double numberOfCredits){
        this.teacher = teacher;
        this.classRoster = classRoster;
        this.numberOfCredits = numberOfCredits;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getClassRoster() {
        return classRoster;
    }

    public void setClassRoster(ArrayList<Student> classRoster) {
        this.classRoster = classRoster;
    }

    public double getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(double numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}
