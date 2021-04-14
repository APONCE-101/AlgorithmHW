import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningAverage(input)));
    }

    public static double[] runningAverage(int[] nums) {
        double sum = 0;
        double[] runAverage = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runAverage[i] = sum / (i + 1);
        }
        return runAverage;
    }

}
