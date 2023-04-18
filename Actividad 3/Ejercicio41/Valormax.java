package Ejercicio41;
public class Valormax {
    public static double findMax(double[] nums) {
        double max = Double.NEGATIVE_INFINITY;
        for (double num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}


