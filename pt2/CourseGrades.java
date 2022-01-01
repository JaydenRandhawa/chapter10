package pt2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CourseGrades {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("pt2/grades.txt");
        Scanner inp = new Scanner(file);

        int studentCount = inp.nextInt(); inp.nextInt();

        int[][] grades = getGrades("pt2/grades.txt");

        showGrades(grades);
        System.out.println(studentAvg(grades, 3));
        System.out.println(testAvg(grades, 3));

        inp.close();
    }

    public static int[][] getGrades(String source) throws FileNotFoundException{
        File file = new File(source);

        Scanner inp = new Scanner(file);

        int studentCount = inp.nextInt();
        int gradeCount = inp.nextInt();

        int[][] grades = new int[studentCount][gradeCount];

        String[] names = new String[studentCount];
        
        for(int i=0;i<studentCount;i++){
            names[i] = inp.next();
        }

        for(int i=0;i<studentCount;i++){
            System.out.println("Please enter " + names[i] + "'s test scores: ");
            for(int ii=0; ii<gradeCount;ii++){
                grades[i][ii] = inp.nextInt();
            }
        }
        inp.close();

        return grades;
    }

    public static void showGrades(int[][] grades){
        for(int i=0;i<grades.length;i++){
            for(int ii=0; ii<grades[0].length;ii++){
                System.out.print(grades[i][ii]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int studentAvg(int[][] grades, int student){
        int sum = 0;

        for(int i=0; i<grades[0].length;i++){
            sum += grades[student][i];
        }
        return sum/grades[0].length;
    }

    public static int testAvg(int[][] grades, int test){
        int sum = 0;

        for(int i=0; i<grades.length;i++){
            sum += grades[i][test];
        }
        return sum/grades.length;
    }


}