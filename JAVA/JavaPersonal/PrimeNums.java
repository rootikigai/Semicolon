//import java.util.Scanner;

public class PrimeNums{
	public static void main(String[] args){

  //Scanner input = new Scanner(System.in);
  
  /*System.out.print("Enter a number: ");
  int num = input.nextInt();*/

    int num = 10;

    for(int numStart = 2; numStart <= num; numStart++){
      int count = 0;
        for(int divisor = 2; divisor <= numStart / 2; divisor++){
          if(numStart % divisor == 0){
          count = 1;
          break;
          }
        }
      if(count == 0){
        System.out.println(numStart);
      }
    }
  }
}
