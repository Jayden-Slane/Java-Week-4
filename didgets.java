/* 2/25/25, Jayden Slane seperate digets into parts */

public class didgets {

public static void main (String[] args){


    int number;
    int ones;
    int tens;
    int hundreds;
    number = 100;
    ones = number % 10;
    tens = (number / 10) % 10 ;
    hundreds = (number /100) % 10;

    System.out.println(ones);
    System.out.println(tens);
    System.out.println(hundreds);




}






}