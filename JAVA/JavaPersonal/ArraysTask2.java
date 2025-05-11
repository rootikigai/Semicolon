import java.util.Arrays;
import java.util.Scanner;
public class ArraysTask2{
  public static void main(String[] args){
Scanner kelvin = new Scanner(System.in);
System.out.print("Enter numbers: ");
	int  number = kelvin.nextInt();
		int[] uniqueNums = new int[number];

  for(int i =0; i < number.length;number++){
    System.out.print("Enter an integer: ");
      int integer = kelvin.nextInt();
  }
			uniqueNums [0] = 1;
			uniqueNums [1] = 9;
			uniqueNums [2] = 7;
			uniqueNums [3] = 6;
			uniqueNums [4] = 9;
			uniqueNums [5] = 7;

    System.out.print("Original array: " + Arrays.toString(uniqueNums));

    Arrays.sort(uniqueNums);

    System.out.println();

    System.out.print("Sorted array: " + Arrays.toString(uniqueNums));
	}
}
