// Jayden Slane, 2/27

import java.util.*;
public class gradeaverage {


    public static void main (String[]args){

    
    double average;
    double grade1;
    double grade2;
    double grade3;
    double grade4;
    double grade5;
    Scanner input = new Scanner(System.in);


    System.out.print("Enter a grade: "); 
    grade1 = input.nextInt();
    System.out.print("Enter a grade: "); 
    grade2 = input.nextInt();
    System.out.print("Enter a grade: "); 
    grade3 = input.nextInt();
    System.out.print("Enter a grade: "); 
    grade4 = input.nextInt();
    System.out.print("Enter a grade: "); 
    grade5 = input.nextInt();

    average = (grade1 + grade2 +grade3 + grade4 + grade5) /5;

    System.out.println("Your average is: " + average);

    }
    
}
