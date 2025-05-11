public class ArrayKata{
/*maximumIn
  public static int maximumIn(int[] arrays){
    int largest = arrays[0];
    for(int i = 0; i < arrays.length; i++){
      if(arrays[i] > largest){
        largest = arrays[i];
      }
    }
    return largest;
  }
//minimumIn
  public static int minimumIn(int[] arrays){
    int smallest = arrays[0];
    for(int i = 0; i < arrays.length; i++){
      if(arrays[i] < smallest){
        smallest = arrays[i];
      }
    }
    return smallest;
  }
//sumOf
  public static int sumOf(int[] arrays){
    int sum = 0;
    for(int i = 0; i < arrays.length; i++){
      sum = sum + arrays[i];
    }
    return sum;
  }
//sumOfEvenNumbersIn */
  public static int sumOfEvenNumbersIn(int[] arrays){
    int sumOfEven = 0;
    for(int i = 0; i < arrays.length; i++){
      if(arrays[i] % 2 == 0){
        sumOfEven += arrays[i];
      }
    }
    return sumOfEven;
  }
}
