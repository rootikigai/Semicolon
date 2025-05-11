import java.util.Scanner;

public class CountLargestNum{
	public static void main(String[] args){
		
		long largest = -999999999;
		int count = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer(Enter 0 to stop): ");
		int number = input.nextInt();
		
		while(number != 0){
			if(number > largest){
				largest = (int)number;
				count = 1;
			}
			else if(number == largest){
					count++;
			}
			System.out.print("Enter another integer(Enter 0 to stop): ");
			number = input.nextInt();
		}
		System.out.println("The largest number is " + largest);
    System.out.println("It appeared " + count + " times.");
	}
}
