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
      sum += arrays[i];
    }
    return sum;
  }
//sumOfEvenNumbersIn
  public static int sumOfEvenNumbersIn(int[] arrays){
    int sumOfEven = 0;
    for(int i = 0; i < arrays.length; i++){
      if(arrays[i] % 2 == 0){
        sumOfEven += arrays[i];
      }
    }
    return sumOfEven;
  }
//sumOfOddNumbersIn
  public static int sumOfOddNumbersIn(int[] arrays){
    int sumOfOdd = 0;
    for(int i = 0; i < arrays.length; i++){
      if(arrays[i] % 2 != 0){
        sumOfOdd += arrays[i];
      }
    }
    return sumOfOdd;
  }
//maximumAndMinimumOf
  public static int maximumAndMinimumOf(int[] arrays){
  }*/
//noOfOddNumbersIn
  public static int noOfOddNumbersIn(int[] arrays){
    int noOfOdd = 0;
    for(int i = 0; i < arrays.length; i++){
      if(arrays[i] % 2 != 0){
        noOfOdd += 1;
      }
    }
    return noOfOdd;
  }
}
