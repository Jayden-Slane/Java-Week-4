/* 2/25/25, Jayden Slane seperate digets into parts */

import java.util.*;
public class digits {

public static void main (String[] args){


    int number;
    int ones;
    int tens;
    int hundreds;
    int thousand;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a 4 digit number ");

    number = input.nextInt();
    // number = 1289;
    ones = number % 10;
    tens = (number / 10) % 10 ;
    hundreds = (number /100) % 10;
    thousand = (number / 1000) % 10;

    System.out.println("The thousand digit: " + thousand);
    System.out.println("The hundreds digit: " + hundreds);
    System.out.println("The tens digit: " + tens);
    System.out.println("The ones digit: " + ones);




}






}