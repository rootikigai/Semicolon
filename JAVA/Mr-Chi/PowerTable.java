public class PowerTable{
	public static void main(String[] args){

		System.out.println("a    b    pow(a, b)");

	  int a = 1;
    int b = 2;
	
	  while(a <= 5){
			int pow = 1;
			int counter = 1;
      while(counter <= b){
      	pow *= a;
				counter++;
			}
			System.out.println(a + "    " + b + "    " + pow);
			a = a + 1;
			b = b + 1;
		}
  }
}
