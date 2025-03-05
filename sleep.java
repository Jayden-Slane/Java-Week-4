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
    

        System.out.print("Enter your birthyear: "); 
        birthyear = input.nextInt();
        System.out.print("Enter your birth month: "); 
        birthmonth = input.nextInt();
        System.out.print("Enter your birth day: "); 
        birthday = input.nextInt();
        System.out.print("Enter current year: "); 
        todayear = input.nextInt();
        System.out.print("Enter current month: "); 
        month = input.nextInt();
        System.out.print("Enter current day: "); 
        day = input.nextInt();

        timealive = (todayear - birthyear) * 365;
        hourslept = (day - birthday) * 8;


    }
    
}
