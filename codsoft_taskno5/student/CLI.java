package student;

import java.util.InputMismatchException;
import java.util.Scanner;

class CLI {
    static Scanner scanner = new Scanner(System.in);
    static void displayUI(){
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM!");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println("Choose one of the following options: ");
        System.out.println();
        System.out.println("-> Press 1 to Add Student");
        System.out.println("-> Press 2 to Remove Student");
        System.out.println("-> Press 3 to Search a student by ROLL_ID");
        System.out.println("-> Press 4 to Display a list of all Students");
        System.out.println();
        System.out.print("Enter your answer here: ");
    }

    static int getInput() {
        try{
            return scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Enter a valid input!");
        }
        return 0;
    }
    static Student addStudent(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.print("Enter Student Name: ");
        String name = scanner.next();
        System.out.print("Enter Student Roll Number: ");
        int roll = scanner.nextInt();
        System.out.print("Enter Student Grade: ");
        float grade = (float) scanner.nextDouble();
        System.out.println();
        System.out.println("Processing.....");
        return new Student(name,roll,grade);
    }
    static int getStudentRoll(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        System.out.print("Enter Student Roll Number: ");
        int roll = scanner.nextInt();
        System.out.println();
        System.out.println("Processing.....");
        return roll;
    }

}
