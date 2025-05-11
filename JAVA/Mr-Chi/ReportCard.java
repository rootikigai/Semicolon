import java.util.Scanner;

public class ReportCard{
	public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int count;
    int countInv = 0;
    int countVal = 0;
    int countA = 0;
    int countB = 0;
    int countC = 0;
    int countD = 0;
    int countF = 0;

    for(count = 1; count <= 10; count++){//possible I can change this count range from a for loop to a while loop and have a have a nested for loop to capture 10 valid scores "countVal"??? Priority: Try later!
    System.out.println("Enter your valid score: ");
    int score = input.nextInt();

      if(score >= 0 && score <= 100){

/*
80-100 A
70-79 B
60-69 C
50-59 D
49 Below F
*/

        switch(score/10){
          case 8, 9, 10: System.out.println("A");
                      score = input.nextInt();
                      countA++;
                      countVal++;
                      break;
          case 7: System.out.println("B");
                      score = input.nextInt();
                      countB++;
                      countVal++;
                      break;
          case 6: System.out.println("C");
                      score = input.nextInt();
                      countC++;
                      countVal++;
                      break;
          case 5: System.out.println("D");
                      score = input.nextInt();
                      countD++;
                      countVal++;
                      break;
          case 4, 3, 2, 1: System.out.println("F");
                      score = input.nextInt();
                      countF++;
                      countVal++;
                      break;
        }
      }
      else {
        System.out.println("Invalid input!");
        countInv++;
      }
    }
    System.out.printf("%nInvalid inputs: %d%nValid inputs: %d%nScore count Grade A: %d%nScore count Grade B: %d%nScore count Grade C: %d%nScore count Grade D: %d%nScore count Grade F: %d%n", countInv, countVal, countA, countB, countC, countD, countF);
  }
}
