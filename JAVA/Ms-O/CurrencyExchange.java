/*
Import Scanner
Declare Class
Invoke main method


*/

import java.util.Scanner;

public class CurrencyExchange{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the exchange rate from dollars to RMB: ");
    double exchRate = input.nextDouble();

    if(exchRate > 0){
      System.out.print("Enter 0 to convert from Dollars to RMB and 1 to convert from RMB to Dollars: ");
      int rateTrigger = input.nextInt();
    }
    else{
      System.out.println("Enter a valid exchange rate...No stress me!: ");
      exchRate = input.nextDouble();
    }

      System.out.print("Enter 0 to convert from Dollars to RMB and 1 to convert from RMB to Dollars: ");
      int rateTrigger = input.nextInt();

      if(rateTrigger == 0){
        System.out.print("Enter Dollar Amount: ");
        double dollarAmt = input.nextDouble();
        double dollarToRmb = (dollarAmt * 6.81);
        System.out.printf("%.2f is %.2f Yuan %n", dollarAmt, dollarToRmb);
      }
      else if(rateTrigger == 1){
        System.out.print("Enter RMB Amount: ");      
        double rmbAmt = input.nextDouble();
        double rmbToDollar = (rmbAmt / 6.81);
        System.out.printf("%.2f is %.2f Dollars %n", rmbAmt, rmbToDollar);
      }
      else{
        System.out.println("You haven't entered a valid Converter Trigger. No make me vexxxx!!!");
        System.out.print("Enter 0 to convert from Dollars to RMB and 1 to convert from RMB to Dollars: ");
        rateTrigger = input.nextInt();
      }
      if(rateTrigger == 0){
        System.out.print("Enter Dollar Amount: ");
        double dollarAmt = input.nextDouble();
        double dollarToRmb = (dollarAmt * 6.81);
        System.out.printf("%.2f is %.2f Yuan", dollarAmt, dollarToRmb);
      }
      else if(rateTrigger == 1){
        System.out.print("Enter RMB Amount: ");      
        double rmbAmt = input.nextDouble();
        double rmbToDollar = (rmbAmt / 6.81);
        System.out.printf("%.2f is %.2f Dollars", rmbAmt, rmbToDollar);
      }
      else{
        System.out.println("You haven't entered a valid Converter Trigger. No make me vexxxx!!!");
        System.out.print("Enter 0 to convert from Dollars to RMB and 1 to convert from RMB to Dollars: ");
        rateTrigger = input.nextInt();
      }
  }
}

