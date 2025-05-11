public class ArrayKata{
  public static int maximumIn(int[] arrays)
    int largest = arrays[0];
    for(int i = 0; i < arrays.length; i++){
      if(arrays[i] > largest){
        largest = arrays[i];
      }
    }
    return largest;
}
