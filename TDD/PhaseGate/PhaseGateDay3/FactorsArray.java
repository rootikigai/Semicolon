public class FactorsArray{
	public static int[] factorsOfNum(int number){
		int factor = 1;
    long[] factorsStore = new int [];
		while(factor <= number){
			if(number % factor == 0){
      factorsStore = new int [factor];
			}
      factor++;
		}
    return factorStore;
	}
}
