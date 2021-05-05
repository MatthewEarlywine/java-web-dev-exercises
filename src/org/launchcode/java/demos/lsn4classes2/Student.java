package org.launchcode.java.demos.lsn4classes2;

import java.math.MathContext;
import java.util.Objects;
import java.math.BigDecimal;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        String gradeLevel = "";
        if (this.numberOfCredits <= 29 && this.numberOfCredits >= 0){
            gradeLevel = "Freshman";
        } else if (this.numberOfCredits <= 59 && this.numberOfCredits >= 30){
            gradeLevel = "Sophomore";
        } else if (this.numberOfCredits <= 89 && this.numberOfCredits >= 60){
            gradeLevel = "Junior";
        } else if (this.numberOfCredits >= 90){
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = this.gpa * this.numberOfCredits;
        double classQualityScore = grade * courseCredits;

        totalQualityScore = totalQualityScore + classQualityScore;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
        double bdgpa = this.gpa;
        BigDecimal bdValue = new BigDecimal(bdgpa);
        MathContext m = new MathContext(2);
        BigDecimal bdValue2 = bdValue.round(m);
        this.gpa = bdValue2.doubleValue();
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

   // @Override
   // public String toString() {
   //     return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
   // }
    @Override public String toString(){
        String studentReview = String.format("%s is a %s with %d credits and a GPA of %.1f", name, getGradeLevel(), getNumberOfCredits(), getGpa());
        return studentReview; // the '%.1f' above is a means to round the float without
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
        sally.addGrade(25, 3.3);
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
        sally.addGrade(25, 4.0);
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
    }
}
