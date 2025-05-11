import java.util.Scanner;

public class RunPrograms{
	public static void main (String[] args){
	  Scanner input = new Scanner(System.in);

    int total = 0;
    int counter = 1;
	
    while (counter <= 10) {
      System.out.print("Enter your grade: ");
	    int grade = input.nextInt();
      counter = counter + 1;
      total = total + grade;
    }

    int classAverage = total / 10;

    System.out.printf("%nTotal of 10 grades is: %d%n", total);
    System.out.printf("Class Average is: %d%n", classAverage);

    if (classAverage >= 80){
      System.out.println("This class performed well. Bonus for teacher!");
    }
    else {
      System.out.println("Poor performance from this class. Teacher should do better");
    }
  }
}
