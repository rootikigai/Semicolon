import java.util.Scanner;

public class FindHighestScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();

    int highScore = -1;
    String topStudent = "";

    for(int i = 1; i <= numOfStudents; i++){
      System.out.print("Enter the name of student " + i + ": ");
      String studentName = input.next();

      System.out.print("Enter the score of " + studentName + ": ");
      int studentScore = input.nextInt();

        if (studentScore > highScore){
          highScore = studentScore;
          topStudent = studentName;
        }
    }
System.out.println("The student with the highest score is: " + topStudent + " with a score of " + highScore);
	}
}
