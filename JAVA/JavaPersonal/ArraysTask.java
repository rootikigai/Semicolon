import java.util.Arrays;
public class ArraysTask{
  public static void main(String[] args){
		int[] uniqueNums = new int[4];
			uniqueNums [0] = 1;
			uniqueNums [1] = 2;
			uniqueNums [2] = 3;
			uniqueNums [3] = 2;


    System.out.print("Original array: " + Arrays.toString(uniqueNums));

    Arrays.sort(uniqueNums);

    System.out.println();

    System.out.print("Sorted array: " + Arrays.toString(uniqueNums));

    System.out.println();
	}
}
