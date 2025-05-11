//print all possible two digit combinations using nested for loops from 10 to 99

public class TwoDigits{
  public static void main(String[] args){

    for (int i = 0; i <= 9; i++){
      for(int j = 0; j <= 9; j++){
        System.out.println(i + "" + j);
      }
    }
  }
}

