public class StringRepOccurence{
  public static boolean isTrue(String numbers){
    int[] count = new int[10];
    int index = 0;
    for(index = 0; index < numbers.length(); index++){
      int strToDigit = numbers.charAt(index) - '0';
      count[strToDigit]++;
    }
    for(index = 0; index < numbers.length(); index++){
      int occurence = numbers.charAt(index) - '0';
      if(count[index] != occurence){
        return false;
      }
    }
    return true;
  }
}
