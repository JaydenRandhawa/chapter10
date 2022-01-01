package pt1;

import java.util.Scanner;

public class StudentRoster{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("How many students are there: ");
        int studentCount = inp.nextInt();

        String[] names = new String[studentCount];

        for(int i=0;i<studentCount;i++){
            System.out.println("Enter the name of student " + (i+1));
            names[i] = inp.next();
        }
        
        System.out.println("Student Roster:");
        printList(names);
        System.out.println("Student Roster Reversed:");
        printReverse(names);
        
        inp.close();
    }

    static void printList(String names[]){
        String list = "";
        list += "[";
        for(int i=0;i<names.length;i++){
            list += names[i];
            list += ", ";
        }
        list = list.substring(0, list.length()-2);
        list += "]";
        System.out.println(list);
    }

    static void printReverse(String[] names){
        String list = "";
        list += "[";
        for(int i=names.length-1;i>=0;i--){
            list += names[i];
            list += ", ";
        }
        list = list.substring(0, list.length()-2);
        list += "]";
        System.out.println(list);
    }
}