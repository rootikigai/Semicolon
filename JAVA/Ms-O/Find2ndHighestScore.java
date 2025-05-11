import java.util.Scanner;

public class Find2ndHighestScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();

    int highScore = -1;
    String topStudent = "";
		int highScore2 = -1;
		String topStudent2 = "";

    for(int i = 1; i <= numOfStudents; i++){
      System.out.print("Enter the name of student " + i + ": ");
      String studentName = input.next();

      System.out.print("Enter the score of " + studentName + ": ");
      int studentScore = input.nextInt();

        if (studentScore > highScore){

          highScore = studentScore;
          topStudent = studentName;

					highScore2 = highScore;
					topStudent2 = topStudent;
        }
				else if(studentScore == highScore2){
					highScore2 = studentScore;
					topStudent2 = studentName;
			
				}
    }
System.out.println("The student with the highest score is: " + topStudent + " with a score of " + highScore);
System.out.println("The student with the 2nd highest score is: " + topStudent2 + " with a score of " + highScore2);
	}
}
