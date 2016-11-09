package Module6;

import java.util.ArrayList;

public final class ArrayUtils {


    public final static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public final static double sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public final static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public final static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public final static double max(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public final static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public final static int maxPositive(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public final static double maxPositive(double[] array) {

        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public final static int multiplication(int[] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            value *= array[i];
        }
        return value;
    }

    public final static double multiplikation(double[] array) {
        double value = 1;
        for (int i = 0; i < array.length; i++) {
            value *= array[i];
        }
        return value;
    }

    public final static int modulus(int[] array) {

        return array[0] % array[array.length - 1];
    }

    public final static double modulus(double[] array) {

        return array[0] % array[array.length - 1];
    }

    public final static int secondLargest(int[] array) {
        int max = array[0];

        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i1 = 0; i1 < array.length; i1++) {
            if (max != array[i1]) {
                if (max2 < array[i1]) {
                    max2 = array[i1];
                }
            }
        }
        return max2;
    }

    public final static double secondLargest(double[] array) {
        double max = array[0];
        double max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (max != array[i]) {
                if (max2 < array[i]) {
                    max2 = array[i];
                }
            }
        }
        return max2;
    }

    public final static int[] reverse(int[] array) {
        int[] array2 = new int[array.length];
        for (int b = 0; b < array.length; b++) {
            array2[b] = array[array.length - b - 1];
        }
        return array2;
    }

    public final static Integer[] findEvenElements(int[] array) {
        ArrayList<Integer> arrays = new ArrayList<>();
        for (int arr : array) {
            if (arr % 2 == 0) arrays.add(arr);
        }
        return arrays.toArray(new Integer[arrays.size()]);
    }
}
