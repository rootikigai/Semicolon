import java.util.Arrays;
public class LoopArrayTest{
  public static void main(String[] args){
		int[] numbers = new int[6];
    numbers[0] = 8;
    numbers[1] = 0;
    numbers[2] = 1;
    numbers[3] = 4;
    numbers[4] = 9;
    numbers[5] = 2;

    String minmax = Arrays.toString(LoopArray.minmaxsumofArray(numbers));
    System.out.print(minmax);
	}
}
