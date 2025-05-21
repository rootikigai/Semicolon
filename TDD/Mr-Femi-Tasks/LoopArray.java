public class LoopArray {
    public static int[] minmaxsumofArray(int[] arrays) {

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;

        for (int i = 0; i < arrays.length; i++) {
            sum1 = sum1 + arrays[i];
        }
        sum1 = sum1 - arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            sum2 = sum2 + arrays[i];
        }
        sum2 = sum2 - arrays[1];
        for (int i = 0; i < arrays.length; i++) {
            sum3 = sum3 + arrays[i];
        }
        sum3 = sum3 - arrays[2];
        for (int i = 0; i < arrays.length; i++) {
            sum4 = sum4 + arrays[i];
        }
        sum4 = sum4 - arrays[3];
        for (int i = 0; i < arrays.length; i++) {
            sum5 = sum5 + arrays[i];
        }
        sum5 = sum5 - arrays[4];
        for (int i = 0; i < arrays.length; i++) {
            sum6 = sum6 + arrays[i];
        }
        sum6 = sum6 - arrays[5];

        int[] sumArray = new int[6];
        sumArray[0] = sum1; System.out.println(sumArray[0]);
        sumArray[1] = sum2; System.out.println(sumArray[1]);
        sumArray[2] = sum3; System.out.println(sumArray[2]);
        sumArray[3] = sum4; System.out.println(sumArray[3]);
        sumArray[4] = sum5; System.out.println(sumArray[4]);
        sumArray[5] = sum6; System.out.println(sumArray[5]);

        int min = sumArray[0];
        int max = sumArray[0];

        for (int j = 0; j < sumArray.length; j++) {
            if (sumArray[j] > max) {
                max = sumArray[j];
            }
            if (sumArray[j] < min) {
                min = sumArray[j];
            }
            System.out.println("Max" + max);

            System.out.println("Min" + min);
                        System.out.println();
        }

        int[] result = {min, max};
        return result;
    }
}

