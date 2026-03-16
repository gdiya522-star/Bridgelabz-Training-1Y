package com.gla.String.level2;
import java.util.*;

public class StudentScorecard {

    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        Random r = new Random();

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + r.nextInt(90); // 2 digit marks (10–99)
            }
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        int students = marks.length;
        double[][] result = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }
    public static String[] calculateGrade(double[][] result) {
        int students = result.length;
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {
            double percent = result[i][2];

            if (percent >= 90)
                grade[i] = "A+";
            else if (percent >= 80)
                grade[i] = "A";
            else if (percent >= 70)
                grade[i] = "B+";
            else if (percent >= 60)
                grade[i] = "B";
            else if (percent >= 50)
                grade[i] = "C";
            else
                grade[i] = "Fail";
        }
        return grade;
    }
    public static void displayScorecard(int[][] marks, double[][] result, String[] grade) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t"
                    + marks[i][0] + "\t"
                    + marks[i][1] + "\t\t"
                    + marks[i][2] + "\t"
                    + result[i][0] + "\t"
                    + result[i][1] + "\t"
                    + result[i][2] + "%\t\t"
                    + grade[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);
        double[][] result = calculateResults(marks);
        String[] grade = calculateGrade(result);

        displayScorecard(marks, result, grade);
    }
}

