import java.util.Scanner;

public class MOJA3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number(Integers only): ");
		int firstNum = input.nextInt();

		System.out.print("Enter Second Number(Integers only): ");
		int secondNum = input.nextInt();

		int product = (firstNum * secondNum);
		int sum = (firstNum + secondNum);

		if (firstNum > 0 && secondNum > 0){
			System.out.println(product);
		}
    else if(firstNum < 0 && secondNum < 0){
      System.out.println(product);
    }
		else{
		System.out.println(sum);
		}
	}
}
