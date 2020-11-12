import java.util.Scanner;

public class Chapter2Test {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter a number: ");
  int num1= scan.nextInt();

  System.out.println("Enter a number: ");
  int num2= scan.nextInt();

  double num11 =  (double) num1;
  double num22 =  (double) num2;


  double x = (num11 + num22) / 2;

  System.out.println("The average is: " + x);

  }
}