import java.util.Arrays;
public class ArrayKataTest{
	public static void main(String[] args){
		ArrayKata inputArrays = new ArrayKata();

		int[] nums = {4, 8, 6, 9, 5, 2};
		int largest = inputArrays.maximumIn(nums);
		System.out.println(largest + " is the largest number.");
	}
}
