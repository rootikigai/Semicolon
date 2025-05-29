//I want to write a function that replaces the element in each index (at current state) with the element in the destination index (at final state) to mimick a rotation!

public class RotateMatrix{
	public static int[][] rotateMatrix(int[][] array){
		int[][] original = new int [3][];
    int[][] rotated = new int [3][3];
    rotated [0][0] = original [2][0];
    rotated [0][1] = original [1][0];
    rotated [0][2] = original [0][0];
    rotated [1][0] = original [2][1];
    rotated [1][1] = original [1][1];
    rotated [1][2] = original [0][1];
    rotated [1][0] = original [2][2];
    rotated [2][1] = original [1][2];
    rotated [2][2] = original [0][2];
	}
  return int[][] rotated;
}
