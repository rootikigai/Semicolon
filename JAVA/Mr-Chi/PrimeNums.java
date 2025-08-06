public class PrimeNums{
  public static void main(String[] args){
    int number = 10;
    int prime = 0;
    int numbers = 0;
		for(numbers = 2; numbers <= number; numbers++){
      if(number % numbers == 1 && number % numbers == numbers){
        prime++;
      }
      if(prime == 2){
      System.out.println(numbers);
      }
    }     
  }
}

