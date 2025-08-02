import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTDD{
  @Test
  public void testThatSubtractionWorks(){
    Calculator lets = new Calculator();
    int result = lets.subtract(5,2);
    int expected = 3;
   
    assertEquals(expected, result);
  }
  @Test
  public void testThatMultiplicationWorks(){
    Calculator lets = new Calculator();
    int result = lets.multiply(8,6);
    int expected = 48;

    assertEquals(expected, result);
  }
  @Test
  public void testThatDivisionWorks(){
    Calculator lets = new Calculator();
    int result = lets.divide(100, 20);
    int expected = 5;

    assertEquals(expected, result);
  }
}
