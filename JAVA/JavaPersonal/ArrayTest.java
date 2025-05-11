import java.util.Scanner;
public class ArrayTest{
	public static void main(String[] args){

    double[] myList = new double[10];
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter " + myList.length + " values: ");
    for (int i = 0; i < myList.length; i++)
    myList[i] = input.nextDouble()
    System.out.print(myList[i] + " ");
  }
}
































/*
		int[] scores = new int [5];
    scores[0] = 22;
    scores[1] = 51;
    scores[2] = 38;
    scores[3] = 23;
    scores[4] = 48;

		for(int i = 0; i <= 4; i++){
//      System.out.print(scores[i] + " ");
      System.out.println(scores[i] + " ");
		}
    int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
    System.out.println("\nSum is: " + sum);
*/
