import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2,num3,num4,num5, temp = 0;
        int counter = 0;
        while (counter < 1){
            System.out.print("Enter a five digit integer: ");
            int number = input.nextInt();
            String num = Integer.toString(number);

            if (num.length() != 5) {
                System.out.println("Number is not legit, enter a 5-digits number.");
            }
            if (num.length() == 5) {
                num1 = number % 10;
                num2 = (number/10) % 10;
                num4 = (number/1000) % 10;
                num5 = (number/10000) % 10;
                if((num5 == num1) && (num4 == num2)){
                    System.out.println("Number is palindrome");
                }else {System.out.println("Number is not palindrome");}
                counter++;
            }
        }

    }
}
