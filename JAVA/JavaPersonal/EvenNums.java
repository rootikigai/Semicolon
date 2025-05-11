import java.util.Scanner;

public class EvenNums{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
    
    System.out.print("Enter First Number: ");
    int num1 = input.nextInt();

    System.out.print("Enter Second Number: ");    
    int num2 = input.nextInt();

    System.out.print("Enter Third Number: ");    
    int num3 = input.nextInt();

    System.out.print("Enter Fourth Number: ");    
    int num4 = input.nextInt();

    System.out.print("Enter Fifth Number: ");    
    int num5 = input.nextInt();


    if(num2 > num1){
      System.out.printf("%n%d is the largest number ", num2);
    }

    else if(num3 > num2){
      System.out.printf("%n%d is the largest number ", num3);
    }

    else if(num4 > num3){
      System.out.printf("%n%d is the largest number ", num4);
    }

    else if(num5 > num4){
      System.out.printf("%n%d is the largest number ", num5);
    }

    int largest = num1;
    int smallest = num1;  

//For the smallest number

    int even = 0;
    int average = 0;

  if(even == 0){
    if(num1 % 2 == 0){
      even += num1;
      average ++;
    }
    if(num2 % 2 == 0){
      even += num2;
      average ++;
    }
    if(num3 % 2 == 0){
      even += num3;
      average ++;
    }
    if(num4 % 2 == 0){
      even += num4;
      average ++;
    }
    if(num5 % 2 == 0){
      even += num5;
      average ++;
    }
  }

    int averageNum = even / average;

    System.out.printf("%nAverage of even Numbers is: %d%n", averageNum);
  }
}
