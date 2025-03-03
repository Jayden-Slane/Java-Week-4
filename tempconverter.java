import java.util.*;
public class tempconverter {

    public static void main (String[]args){


    double fahrenhiet;
    double celcius;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter fahrenhiet: "); 
    fahrenhiet = input.nextInt();

    celcius = (5.0/9.0) * (fahrenhiet - 32.0);

    System.out.println("Celcius is: " + celcius);

    }
    
}
