import java.util.Scanner;
public class CompVal{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    int months;
    double compInt = 0;
    
    System.out.print("Enter Monthly Savings amount: ");
    double savings = input.nextDouble();

    System.out.print("Enter annual interest rate: ");
    double intRate = input.nextDouble();

    System.out.print("Enter months: ");
    months = input.nextInt();

    double monInt = (intRate / 100) / 12;

    for(int i = 1; i <= months; i++){
    compInt = savings * (1 + monInt);
    }
    System.out.printf("After %d months, the account balance is %.2f\n", months, compInt);
  }
}
