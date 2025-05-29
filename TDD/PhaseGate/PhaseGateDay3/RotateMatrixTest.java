import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateMatrixTest{
  @Test
  public void testThatRotationWorks(){
	  RotateMatrix rotate = new RotateMatrix();
    int result = rotate.rotateMatrix({{1,2,3},{4,5,6},{7,8,9}});
    int expected = {{ 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
   
  assertEquals(expected, result);
  }
}
