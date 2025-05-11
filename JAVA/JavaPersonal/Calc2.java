import java.util.Scanner;

public class Calc2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum;
        int diff;
        int mult;
        double div;
        int nav = 1;

        while(true){

				String display = """
======================================
          		Calc 2.0

Choose Arithmetic Operation:
1 ==> Addition
2 ==> Subtraction
3 ==> Multiplication
4 ==> Division
0 ==> Exit Calculator
======================================

""";
        System.out.print(display);
        int operationChoice = input.nextInt();

        if(operationChoice == 0){
          System.out.println("Exiting Calc...");
          break;
        }

          switch(operationChoice){
            case 1:
              while(nav == 1){
              System.out.print("\nYou are doing an addition. " + "Enter first number: ");
              num1 = input.nextInt();
              System.out.print("Enter second number: ");
              num2 = input.nextInt();

              sum = num1 + num2;

              System.out.println("Result: " + sum);
              System.out.println("Enter 1 to add again or 0 to go back to menu: ");
              nav = input.nextInt();
              if(nav == 0){
              break;
              }
            }
            break;

            case 2:
              while(nav == 1){
              System.out.print("\nYou are doing a subtraction. " + "Enter first number: ");
              num1 = input.nextInt();
              System.out.print("Enter second number: ");
              num2 = input.nextInt();

              diff = num1 - num2;

              System.out.println("Result: " + diff);
              System.out.println("Enter 1 to add again or 0 to go back to menu: ");
              nav = input.nextInt();
              if(nav == 0){
              break;
              }
            }
            break;

            case 3:
              while(nav == 1){
              System.out.print("\nYou are doing a multiplication " + "Enter first number: ");
              num1 = input.nextInt();
              System.out.print("Enter second number: ");
              num2 = input.nextInt();

              diff = num1 * num2;

              System.out.println("Result: " + diff);
              System.out.println("Enter 1 to add again or 0 to go back to menu: ");
              nav = input.nextInt();
              if(nav == 0){
              break;
              }
            }
              break;

            case 4:
              while(nav == 1){
                System.out.print("\nYou are doing a division " + "Enter first number: ");
                num1 = input.nextInt();
                System.out.print("Enter second number: ");
                num2 = input.nextInt();

                if(num2 != 0){
                  div = (double) num1 / num2;
                  System.out.printf("Result: %.2f%n", div);
                  System.out.println("Enter 1 to add again or 0 to go back to menu: ");
                nav = input.nextInt();
                  if(nav == 0){
                  break;
                  }
                }
                else{
                System.out.println("Number cannot be divided by 0");
                break;
                }
              }
              break;

            default:
                System.out.println("Not a valid input...Pick between option 1 to 4");
                break;
          }
          if(nav == 0){
            break;
          }
        }
    }
}

