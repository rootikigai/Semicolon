import java.util.Scanner;
public class RangeTest{
	public static void main(String[] args){

    Scanner inputArrays = new Scanner(System.in);

    System.out.print("How many numbers do you want to input?: ");
    int arraySize = inputArrays.nextInt();

		int[] nums = new int[arraySize];
    for(int i = 0; i < arraySize; i++){
      System.out.print("Enter number " + (i + 1) + ": ");
      nums[i] = inputArrays.nextInt();
    }

		int range = RangeFunction.arrayRange(nums);
		System.out.println(range + " is the range.");
	}
}
