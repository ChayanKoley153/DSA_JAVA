public class max_subarray_sum_brute_Force {

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) { // print
                // subarray sum
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }

        System.out.println("max sum = " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(numbers);
    }

}
