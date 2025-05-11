import java.util.Scanner;

public class Calendar{
	public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int year = input.nextInt();
    int firstDay = input.nextInt();
    int month;

    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
    String leapyear = true;
    }
    else{
    leapyear = false;
    }

    for(month = 1; month <= 12; month++){
      if(month == 1){
        System.out.println("January" + year);
      }
      else if(month == 2){
        System.out.println("February" + year);
      }
    }

	}
}
