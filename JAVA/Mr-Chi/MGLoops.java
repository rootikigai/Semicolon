import java.util.Scanner;

public class MGLoops{
	public static void main(String[] args){

	int comp = (int)((Math.random() * 10) + 1);
    //System.out.println(comp);//Make I dey see the random number first...testing something!

	Scanner guess = new Scanner(System.in);

    int trialCount = 0;
    int number = 0;

    while (trialCount < 3){
	    System.out.print("Guess a number between 1 and 10: ");
		    number = guess.nextInt();

        if (number == 0 || number > 10) {
          System.out.println("Invalid input! Try again.");
           continue;//Good to find out this exists!
        }

        trialCount = trialCount + 1;

      if (number == comp){
        System.out.println("You're correct. Nice try!");
        break;
      }
      else if (number < comp && trialCount < 3){
        System.out.println("Too low, try again!: ");
      }
      else if (number > comp && trialCount < 3){
        System.out.println("Too high, try again!: ");
      }
  }
    if (number != comp){
      System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
    }
  }
}
