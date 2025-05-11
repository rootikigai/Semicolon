/*
import Scanner
prompt user to enter first int
prompt user to enter second int
if first int is greater than second int, print first int
else if second int is greater than first int, print second int
However, if the first int and second int are same, print 0
If num 1 divided by 6 is equal to num2 divided by 6, the two same values have the same remainder when divided by 6, find the smallest value of the two
*/


import java.util.Scanner;

public class MOJA5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number(Integers only): ");
		int firstNum = input.nextInt();

		System.out.print("Enter Second Number(Integers only): ");
		int secondNum = input.nextInt();

    int remFirstNum = firstNum % 6;
    int remSecNum = secondNum % 6;

		if (firstNum > secondNum){
			System.out.printf("%d is the larger value %n", firstNum);
		}
		else{
			System.out.printf("%d is the larger value %n", secondNum);
		}
    if(firstNum == secondNum){
      System.out.println(0);
    }    
    else if(remFirstNum == remSecNum){
      if(firstNum < secondNum){
        System.out.printf("%d is the smaller value %n", firstNum);
      }
      else{
        System.out.printf("%d is the smaller value %n", secondNum);
      }
    }
	}
}
