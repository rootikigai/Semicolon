public class AddUpToTen{
	public static void main(String[] args){

	  int counter = 1;
    int sum = 0;
	
	  while(counter <= 10){    
      sum = sum + counter;
      counter++;
    }
  System.out.printf("Sum is %d%n", sum);
  }
}
