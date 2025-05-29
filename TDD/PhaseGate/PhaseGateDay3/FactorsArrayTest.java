import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorsArrayTest{
  @Test
  public void testThatFac
torsReturn(){
	  FactorsArray factorial = new FactorsArray(24);
    int [] result = {1,2,3,4,6,8,12,24};
    int [] expected = {1,2,3,4,6,8,12,24};
   
  assertEquals(expected, result);
  }
}
