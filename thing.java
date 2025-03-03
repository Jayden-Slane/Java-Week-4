import java.util.*;
public class thing {

    public static void main (String[]args){

    String name;
    String pasword;

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your name: "); 
    name = input.nextLine();
    System.out.print("Enter your pasword: ");
    pasword = input.next();

    System.out.println("Your name is: "+ name);
    System.out.println("Your pasword is: " + pasword);


    }
    
}
