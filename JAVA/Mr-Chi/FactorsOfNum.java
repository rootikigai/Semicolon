import java.util.Scanner;

public class FactorsOfNum{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive number: ");
		int number = input.nextInt();
		
		while(number < 0){
			System.out.println("Why are you like this? Is that a positive number?");
			System.out.print("Please enter a positive number!: ");
			number = input.nextInt();
        while(number == 0){
          System.out.println("I knew you would try to be funny. Don't try me! Enter a positive number above 0: ");
          number = input.nextInt();
        }
		}
	  int i = 1;

		while(i <= number){
			if(number % i == 0){
        System.out.print(i + ", ");
			}
      i++;
		}
      System.out.println(" are the factors of " + number);
	}
}
