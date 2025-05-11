public class LoopeyPatterns{
	public static void main(String[] args){

    System.out.println("Pattern A");
    for(int r = 1; r <= 6; r++){
      for(int c = 1; c <= r; c++){
        System.out.print(c + " ");
      }
    System.out.println();
    }

System.out.println();

    System.out.println("Pattern B");
    for(int r = 6; r >= 1; r--){
      for(int c = 1; c <= r; c++){
        System.out.print(c + " ");
      }
    System.out.println();
    }

System.out.println();

    System.out.println("Pattern C");
    for(int r = 1; r <= 6; r++){
        for(int c = 1; c <= 6 - r; c++){
          System.out.println("* ");
      }
      for(int num =r; num >= 1; num--){
        System.out.print(num + " ");
      }
    System.out.println();
  }
}
}


/*
//Got this accidentally: Pyramid Pattern 6 rows:
will see what I did later.
    System.out.println("Pattern C");
    for(int r = 1; r <= 6; r++){

      for(int c = r; c <= 6; c++){
        System.out.print(" ");
      }
      for(int c = 1; c <= r; c++){
        System.out.print(c + " ");
      }
    System.out.println();
    }
*/
