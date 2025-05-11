import java.util.Scanner;

public class NesoWhileLoopEx{
	public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a number between 1 and 10: ");
  int num = input.nextInt();

  	while(num < 1 || num > 10){
			System.out.printf("%d is not between 1 and 10. Try again: ", num);
      num = input.nextInt();
		}
			System.out.printf("%d is between 1 and 10. Thanks!%n", num);
  }
}
