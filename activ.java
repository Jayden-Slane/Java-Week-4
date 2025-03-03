import java.util.*;
public class activ {

    public static void main (String []args){


    int num1;
    int num2;
    int ans1;
    int ans2;
    int ans3;
    int ans4;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Number 1: "); 
    num1 = input.nextInt();
    System.out.print("Enter Number 2: ");
    num2 = input.nextInt();

    ans1 = num1/num2 ;
    ans2 = num1%num2;
    ans3 = num2 / num1;
    ans4 = num2%num1;

    System.out.println("Answer 1 is: "+ ans1);
    System.out.println("Answer 2 is: "+ ans2);
    System.out.println("Answer 3 is: "+ ans3);
    System.out.println("Answer 4 is: "+ ans4);


    }
    
}
