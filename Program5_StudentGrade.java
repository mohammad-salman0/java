import java.util.InputMismatchException;
import java.util.Scanner;

interface Grading {
    String calculateGrade(int marks);
}

class Student implements Grading {
    public String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }
}

public class Program5_StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter marks (0-100): ");
            int marks = sc.nextInt();

            Student s = new Student();
            String grade = s.calculateGrade(marks);
            System.out.println("Grade: " + grade);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Enter numeric marks.");
        }
    }
}
