import java.util.Scanner;

public class PrimeNumbers{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

	  int number = 0;

    System.out.print("Enter a positive number: ");
      number = input.nextInt();

    while(number < 1){     
        System.out.println("Invalid input");
        System.out.println("Enter a positive number: ");
          number = input.nextInt();
    }
      if(number == 1){
        System.out.println("You should know 1 isn't a prime number. Oh! You didn't know? Now you know. You're welcome.");
        System.out.println("Enter a positive number jare, alakoba: ");
          number = input.nextInt();
      }

        int numCheck = 2;
        int count = 0;
    
        while(numCheck <= number / 2){
          if (number % numCheck == 0){
            count++;
          }
          numCheck++;
        }
        if(count == 0 && number > 1){
          System.out.printf("%d is a prime number.%n", number);
        }
        else {System.out.printf("%d is not a prime number.%n", number);
        }
	}
}
