import java.util.Scanner;

public class MysteryGame{
	public static void main(String[] args){

		int comp = (int)((Math.random() * 10) + 1);
      System.out.println(comp);//Make I dey see the random number first...testing something!

		Scanner guess = new Scanner(System.in);

		System.out.print("Guess a number between 1 and 10: ");
		int number = guess.nextInt();//first try

    if (number > comp){
      System.out.print("Too high, try again! (2 trials left): ");
        number = guess.nextInt();
      //second try
      if (number > comp){
        System.out.print("Too high, last try!: ");
          number = guess.nextInt();
      //last try
        if (number > comp){
          System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
        }
        else if (number < comp){
          System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
        }
      }
      else if (number < comp){
        System.out.println("Too low, last try!: ");
          number = guess.nextInt();
        //last try
        if (number < comp){
          System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
        }
        else if (number > comp){
          System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
        }
  else {System.out.println("You're correct. Nice try!");}
      }
else {System.out.println("You're correct. Nice try!");}
    }
    else if (number < comp){
      System.out.print("Too low, try again (2 trials left): ");
        number = guess.nextInt();
      //second try
      if (number < comp){
        System.out.print("Too low, last try!: ");
          number = guess.nextInt();
        //last try
        if (number < comp){
          System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
        }
        else if (number > comp){
          System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
        }
      }
      else if(number > comp){
        System.out.print("Too high, last try!: ");
          number = guess.nextInt();
        //last try
        if (number > comp){
          System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
        }
        else if (number < comp){
          System.out.println("Olodo! Ordinary " + comp + " you no fit guess.");
        }
  else {System.out.println("You're correct. Nice try!");}
      }
else {System.out.println("You're correct. Nice try!");}
    }


    else {System.out.println("You're correct. Nice try!");}
        

  }
}
