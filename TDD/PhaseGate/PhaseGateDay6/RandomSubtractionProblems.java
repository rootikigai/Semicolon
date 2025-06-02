import java.util.Scanner;
public class RandomSubtractionProblems{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        int programRun = 0;
        int numOfTrials = 0;
        int countCorrect = 0;
        int countWrong = 0;
        int wrong = 0;
        double ans = 0;
        while(programRun != 10){
            double num1 = Math.floor(Math.random() * 100);
            double num2 = Math.floor(Math.random() * 100);
            if(programRun > 9){
                break;
            }
            else{
                if(num1 < num2){
                    double temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                double result = num1 - num2;
          //  for(let trials = 0; trials <= 9; trials++){
           //     const prompt = require("prompt-sync")();
                
                System.out.print("What is " + num1 + " - " + num2 + "?: ");
                ans = input.nextInt();
                    if(ans == result){
                        System.out.print(ans + " is correct.");
                        countCorrect = countCorrect + 1;
                    }
                    else if(ans != result){
                        for(wrong = 0; wrong < 1; wrong++){
                            System.out.print("Wrong. One trial left!");
                            System.out.print("What is " + num1 + " - " + num2 + "?:");
                            ans = input.nextInt();
                        }
                        countWrong = countWrong + 1;
                    }
                System.out.print(countCorrect + " correct score!");
                System.out.print(countWrong + " wrong score!");
                programRun = programRun + 1;
            }
        }

    }
}
