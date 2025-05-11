public class LoopeyPatternsA{
	public static void main(String[] args){

    System.out.println("Pattern A");
    for(int r = 1; r <= 6; r++){
      for(int c = 1; c <= r; c++){
        System.out.print(c + " ");
      }
    System.out.println();
    }
  }
}
