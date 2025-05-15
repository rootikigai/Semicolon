public class Range{
	public static void main(String[] args){
    int[] numbers = {5, 6, 10, 15, 20};
		int max = numbers[0];
		int min = numbers[0];
    int range = 0;

		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] > max){
				max = numbers[index];
			}
			if(numbers[index] < min){
				min = numbers[index];
      }
    }
    range = max - min;
    System.out.println("Range is: " + range);
	}
}
