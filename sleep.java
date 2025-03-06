import java.text.NumberFormat;
import java.util.*;
public class sleep {

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        int birthyear;
        int birthmonth;
        int birthday;
        int todayear;
        int month;
        int day;
        int timealive;
        int hourslept;
        int monthalive;
        int dayalive;
        int yearalive;
    
        NumberFormat number = NumberFormat.getIntegerInstance();

        System.out.println("Enter your birthdate:");
        System.out.print("Year: "); 
        birthyear = input.nextInt();
        System.out.print("Month: "); 
        birthmonth = input.nextInt();
        System.out.print("Day: "); 
        birthday = input.nextInt();
        System.out.println("Enter todays date:");
        System.out.print("Year: "); 
        todayear = input.nextInt();
        System.out.print("Month: "); 
        month = input.nextInt();
        System.out.print("Day: "); 
        day = input.nextInt();

        
        timealive = ((day - birthday) + ((month - birthmonth) * 30) + ((todayear - birthyear) * 365));
        hourslept = timealive * 8;

        System.out.println("You have been alive for: " + (number.format(timealive)) + " days");
        System.out.println("You have slept for: " + (number.format(hourslept)) + " hours");


    }
    
}
