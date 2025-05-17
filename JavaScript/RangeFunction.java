public class RangeFunction{
  public static int arrayRange(int[] arrays){
    int range = 0;
    int maximum = arrays[0];
    int minimum = arrays[0];
    for(int i = 0; i < arrays.length; i++){
      if(arrays[i] > maximum){
        maximum = arrays[i];
      }
      if(arrays[i] < minimum){
        minimum = arrays[i];
      }
    }
    range = maximum - minimum;
    return range;
  }
}
