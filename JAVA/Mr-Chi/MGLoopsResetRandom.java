//After each 3 wrong guesses, change random and notify user

import java.util.Scanner;

public class MGLoopsResetRandom{
	public static void main(String[] args){

	int comp = (int)((Math.random() * 10) + 1);
/*  System.out.println(comp); Make I dey see the random number first...testing something! 
*/

	Scanner guess = new Scanner(System.in);

    int trialCount = 0;
    int number = 0;
    int wrongCount = 0;

    while (true){
	    System.out.print("Guess a number between 1 and 10: ");
		    number = guess.nextInt();

        if (number == 0 || number > 10){ /* thought to fix this here...wasn't in my first code.*/
          System.out.println("Invalid input! Try again.");
           continue;
        }

        trialCount = trialCount + 1;

      if (number == comp){
        System.out.println("Sharp!!! It took you " + trialCount + " trials to gerrit!");
        break;
      }
      else{wrongCount = wrongCount + 1;
        
      if (number < comp){
        System.out.println("Too low, try again!: ");
      }
      else if (number > comp){
        System.out.println("Too high, try again!: ");
      }
      if (wrongCount == 3){
        comp = (int)((Math.random() * 10) + 1);
          //System.out.print(comp);
          System.out.println("Random number has changed. You got 3 wrong guesses!");
          wrongCount = 0;
      }
    }
  }
    /*if (number != comp){
      System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
    }*/
  }
}
