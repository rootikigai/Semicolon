import java.util.Scanner;
public class BankATMSim{
	public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double balance;
    int multiples = 500;
    double withdrawal;
    double withdrawalFee = 100;
    double newBalance;
    int withdrawAgain;
    String welcome = """
          SEMICOLON BANK
          You are welcome.
          ----------------
""";
		System.out.print(welcome);
    String showBalance = """
Enter 1 to input your account balance
Enter 0 to exit!
""";
	  System.out.println(showBalance);
    int menuChoice = input.nextInt();
    while(menuChoice != 0){
      if(menuChoice == 0){
        System.out.println("Thank you for banking with us. Goodbye!");
        break;
      }
      else if(menuChoice == 1){
        System.out.println("Enter your account balance: ");
        balance = input.nextDouble();
        if(balance < 100){
          System.out.println("Sorry, your account cannot be lower than =N=100.");
        }
        else{
          while(true){
	          System.out.println("Enter a withdrawal amount (multiples of =N=500 or =N=1000 only): ");
            withdrawal = input.nextDouble();
            if(withdrawal % multiples != 0){
              System.out.println("Invalid!");
              //withdrawal = input.nextDouble();
            }
            else{
              newBalance = balance - (withdrawal + 100);
              System.out.println("Transaction Successful!");
              System.out.println("Withdrawal Amount: " + withdrawal);
              System.out.println("Withdrawal Fee: " + withdrawalFee);
              System.out.println("Remaining Balance is: " + newBalance);
            }
            System.out.print("Would you like to make another withdrawal?(Press 1 for yes and 0 for no): ");
            menuChoice = input.nextInt();
          }
        }
	    }
      else{
        System.out.println("Invalid! Enter 1 to input your account balance or 0 to exit!");
        menuChoice = input.nextInt();
      }
    }
  }
}
//System.out.print("Would you like to make another withdrawal?(Press 1 for yes and 0 for no): ");
//menuChoice = input.nextInt();
