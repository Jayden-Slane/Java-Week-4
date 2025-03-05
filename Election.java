import java.util.*;
import java.text.NumberFormat;
public class Election {


    public static void main (String[]args){


    Scanner input = new Scanner(System.in);

    NumberFormat percent= NumberFormat.getPercentInstance();
    double NY;
    double NJ;
    double CN;
    double NYA;
    double NJA;
    double CNA;
    double Awbrey;
    double Martinez;
    double totalVotes;
    double averageA;
    double averageM;

    System.out.print("Enter New york Election for Martinez: ");
    NY = input.nextInt();
    System.out.print("Enter Conneticet Election for Martinez: ");
    NJ = input.nextInt();
    System.out.print("Enter New jersey Election for Martinez: ");
    CN = input.nextInt();


    System.out.print("Enter New york Election for Awbrey: ");
    NYA = input.nextInt();
    System.out.print("Enter Conneticet Election for Awbrey: ");
    NJA = input.nextInt();
    System.out.print("Enter New jersey Election for Awbrey: ");
    CNA = input.nextInt();
    
    Awbrey = NYA + NJA + CNA;
    Martinez = NY + NJ + CN;
    totalVotes = Awbrey + Martinez;
    averageA = (Awbrey/totalVotes) ;
    averageM = (Martinez/totalVotes) ;



    System.out.println("Candidate\tVotes\tPercentage\nAwbrey\t\t" +Awbrey + "\t" + percent.format(averageA));
    System.out.println("Martinez\t" + Martinez + "\t" + percent.format(averageM));
    System.out.println("Total votes: " + totalVotes);



    }



}