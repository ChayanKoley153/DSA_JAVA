public class subArrays_sum {

    public static void subarray_sum(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int a = 0;
            int sum = 0;
            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;

                for (int k = start; k <= end; k++) {

                    System.out.print(numbers[k] + "   ");
                    a = numbers[k];
                }
                sum += a;
                System.out.println();
            }
            System.out.print("Sum of this Subarray : " + sum);
            System.out.println();

        }
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        subarray_sum(numbers);
    }

}
