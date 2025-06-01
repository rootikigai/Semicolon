import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerCBTTest{
  @Test
  public void testThatGetCBTPriceFunctionWorks(){
    TestDrillerCBT lets = new TestDrillerCBT();
    int result = lets.getCBTPrice(4);
    int expected = 8000;

    assertEquals(expected, result);
  }
}
