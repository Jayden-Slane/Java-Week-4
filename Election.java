import java.util.*;
public class Election {


    public static void main (String[]args){


    Scanner input = new Scanner(System.in);

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
    averageA = (Awbrey/totalVotes) * 100;
    averageM = (Martinez/totalVotes) * 100;



    System.out.println("Candidate\tVotes\tPercentage\nAwbrey\t\t" +Awbrey + "\t" + averageA);
    System.out.println("Martinez\t" + Martinez + "\t" + averageM);



    }



}