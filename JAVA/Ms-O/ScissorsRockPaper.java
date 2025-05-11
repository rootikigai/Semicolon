import java.util.Scanner;

public class ScissorsRockPaper{
	public static void main(String[] args){

		Scanner pick = new Scanner(System.in);

    int scissors = 0;
    int rock = 1;
    int paper = 2;

    int userScore = 0;
    int compScore = 0;

    while ((userScore - compScore) <= 2){
      int compPick = (int)(Math.random() * 3);
      System.out.println(compPick);//Please ignore. I'm using it for testing!

		  System.out.print("Take your pick number: Scissors (0), rock (1), paper(2): ");
		  int userPick = pick.nextInt();

      System.out.print("The Computer is ");
      if (compPick == 0){
        System.out.println("Scissors");
      }
      else if (compPick == 1){
        System.out.println("Rock");
      }
      else {
        System.out.println("Paper");
      }

      System.out.print("You are ");
      if (userPick == 0){
        System.out.println("Scissors");
      }
      else if (userPick == 1){
        System.out.println("Rock");
      }
      else {
        System.out.println("Paper");
      }

      if (userPick == compPick){
        System.out.println("It's a Draw!");
      }
      else if ((userPick == 0 && compPick == 2) || (userPick == 1 && compPick == 0) || (userPick == 2 && compPick == 1)){
        System.out.println("You won this round!");
        userScore = userScore + 1;
      }
      else {
        System.out.println("Computer won this round!");
        compScore = compScore + 1;
      }

      System.out.println("Your score is " + userScore);
      System.out.println("Computer score is " + compScore);      

    }

    if (userScore > compScore){
      System.out.println("Congrats!!! You win the game.");
    }
    else {
      System.out.println("Eyaah! Computer wins the game.");
    }


  }
}
