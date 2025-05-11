public class Munchies{
/*	public static int findMultiple(int number){
		return number * 5;
	}

  public static void displayPrimeNumbers(){
    int count = 0;
    int number = 2;

    while(count < 50){
    int diviCount = 0;
      for(int i = 1; i <= number; i++){
        if(number % i == 0){
          diviCount++;
        }
      }
      if(diviCount == 2){
        System.out.print(number + ",");
          count++;
      }
      number++;
    }
  }

  public static String displayAge(int ageYears){
    int years = ageYears;
    int months = ageYears * 12;
    int days = ageYears * 365;
    int minutes = (ageYears * 365) * 24 * 60;
    int seconds = (ageYears * 365) * (24 * 60) * 60;

    return "Age in years: " + ageYears + "\nAge in months: " + months + "\nAge in days: " + days + "\nAge in minutes: " + minutes + "\nAge in seconds: " + seconds;
  }
*/
  public static void displayDogAge(String name, int humanYears){
  int dogYears = humanYears * 7;
  System.out.println(name + " is " + dogYears + " years old in dog years!");
  }

  /*public static String findMultiplesOf7Not5(){
  String result = "";

  }

  public static int computeSumOfNumber(int number){
    int sum = 0;

    int a = number / 1000;
    int b = (number / 100) % 10;
    int c = (number / 10) % 10;
    int d = (number % 10);

    sum = a + b + c + d;
    return sum;
  }

  public static boolean isLeapYear(int year){
    if(year % 4 == 0){
      return true;
    }
    return false;
  }*/
}
