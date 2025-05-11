import java.util.Scanner;

public class MOJA4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number(Integers only): ");
		int firstNum = input.nextInt();

		System.out.print("Enter Second Number(Integers only): ");
		int secondNum = input.nextInt();

		int difference = (firstNum - secondNum);

		if (firstNum > secondNum){
			System.out.println(difference);
		}
	}
}
