public class AddUpToHundred{
	public static void main(String[] args){

	  int counter = 1;
    int sum = 0;
	
	  while(counter <= 100){    
      sum = sum + counter;
      counter++;
    }
  System.out.printf("%d ", sum);
  }
}
