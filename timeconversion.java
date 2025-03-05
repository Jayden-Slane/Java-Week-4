import java.util.*;
public class timeconversion {

    public static void main (String[]args){

    int hours;
    int minutes;
    int remaining;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter time in minutes: "); 
    minutes = input.nextInt();

    hours = minutes / 60;
    remaining = minutes % 60;
    
    System.out.println("The time is: " + hours + ":" + remaining);

    }
    
}
