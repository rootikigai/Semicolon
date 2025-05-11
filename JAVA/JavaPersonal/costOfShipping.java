/*PSEUDOCODE:

Import Scanner
Declare Class
Write main method
Write if..else statements
If weight is greater than 0lbs but less than or equal to 1lbs print "Your Shipping cost is $3.5"
else if weight is greater than 1lbs but less than or equal to 3lbs print "Your Shipping cost is $5.5"
else if weight is greater than 3lbs but less than or equal to 10lbs print "Your Shipping cost is $8.5"
else if weight is greater than 10lbs but less than or equal to 20lbs print "Your Shipping cost is $10.5"
else print "Package cannot be shipped"

*/


import java.util.Scanner;

public class costOfShipping{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Package Weight: ");
    double packageWeight = input.nextDouble();

    if(packageWeight > 0 && packageWeight <= 1){
      System.out.println("Shipping cost for your package is $3.5");
    }
    else if(packageWeight > 1 && packageWeight <= 3){
      System.out.println("Shipping cost for your package is $5.5");
    }
    else if(packageWeight > 3 && packageWeight <= 10){
      System.out.println("Shipping cost for your package is $8.5");
    }
    else if(packageWeight > 10 && packageWeight <= 20){
      System.out.println("Shipping cost for your package is $10.5");
    }
    else {
      System.out.println("Package cannot be shipped!");
    }
  }
}
