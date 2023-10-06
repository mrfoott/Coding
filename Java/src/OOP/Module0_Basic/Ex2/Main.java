package OOP.Module0_Basic.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentID;
        String fullName;
        double theoryPoint, practicePoint;

        Student student1 = new Student(1, "Vo Hong Phu", 10, 10);
        Student student2 = new Student(2, "Another Vo Hong Phu", 10, 10);
        Student student3 = new Student();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student's info:");
        System.out.print("Student ID: ");
        studentID = sc.nextInt();
        System.out.print("Full name: ");
        fullName = sc.next();
        System.out.print("Theory point: ");
        theoryPoint = sc.nextDouble();
        System.out.print("Practice point: ");
        practicePoint = sc.nextDouble();
        System.out.println("\n");

        System.out.printf("%-10s | %-30s | %10s | %10s | %14s", "Student ID", "Full name", "Theory", "Practice", "Average Point");
        System.out.println();
        System.out.println("======================================================================================");
        student3.setStudentID(studentID);
        student3.setFullName(fullName);
        student3.setTheoryPoint(theoryPoint);
        student3.setPracticePoint(practicePoint);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
