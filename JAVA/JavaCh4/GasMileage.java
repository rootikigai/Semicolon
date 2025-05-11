import java.util.Scanner;

public class GasMileage{
	public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int miles = 0;   
    int gallons;
    int totalMiles = 0;
    int totalGallons = 0;
    double mpg;
    double allMPG;
//mpg = miles / gallons

    while(miles != -1){
      System.out.print("Enter miles driven (enter -1 to quit): ");
      miles = input.nextInt();

      if(miles == -1){
        break;
      }
        System.out.print("Enter gallons used: ");
        gallons = input.nextInt();

        mpg = (double)(miles / gallons);
        System.out.printf("MPG for this trip is %.2f%n", mpg);
        totalMiles += miles;
        totalGallons += gallons;

      if(totalGallons != 0){
        allMPG = (double) totalMiles / totalGallons;
      }

    System.out.printf("All MPGs so far is %.2f%n", allMPG);
    }

	}
}
