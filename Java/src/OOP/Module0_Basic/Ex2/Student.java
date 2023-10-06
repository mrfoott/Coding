package OOP.Module0_Basic.Ex2;

import java.util.Scanner;

public class Student {
    private int studentID;
    private String fullName;
    private double theoryPoint;
    private double practicePoint;

    public Student() {
        this.studentID = 9999999;
        this.fullName = "null";
        this.theoryPoint = 0;
        this.practicePoint = 0;
    }

    public Student(int studentID, String fullName, double theoryPoint, double practicePoint) {
        if (studentID <= 0) {
            this.studentID = 9999999;
        } else {
            this.studentID = studentID;
        }

        if (!fullName.trim().equals("")) {
            this.fullName = fullName;
        } else {
            this.fullName = "null";
        }

        if (theoryPoint > 10 && theoryPoint < 0) {
            this.theoryPoint = 0;
        } else {
            this.theoryPoint = theoryPoint;
        }

        if (practicePoint > 10 && practicePoint < 0) {
            this.practicePoint = 0;
        } else {
            this.practicePoint = practicePoint;
        }
    }

    public void setStudentID(int studentID) {
        if (studentID <= 0) {
            this.studentID = 9999999;
        } else {
            this.studentID = studentID;
        }
    }

    public void setFullName(String fullName) {
        if (!fullName.trim().equals("")) {
            this.fullName = fullName;
        } else {
            this.fullName = "null";
        }
    }

    public void setTheoryPoint(double theoryPoint) {
        if (theoryPoint > 10 && theoryPoint < 0) {
            this.theoryPoint = 0;
        } else {
            this.theoryPoint = theoryPoint;
        }
    }

    public void setPracticePoint(double practicePoint) {
        if (practicePoint > 10 && practicePoint < 0) {
            this.practicePoint = 0;
        } else {
            this.practicePoint = practicePoint;
        }
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public double getTheoryPoint() {
        return theoryPoint;
    }

    public double getPracticePoint() {
        return practicePoint;
    }

    public double calAvePoi() {
        return (this.theoryPoint + this.practicePoint) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d | %-30s | %10.2f | %10.2f | %14.2f", studentID, fullName, theoryPoint, practicePoint, calAvePoi());
    }
}
