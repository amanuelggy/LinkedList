public class EulerAlgos {
    // #Problem #1
    // If we list all the natural numbers below 10 that are multiples of 3 or 5, we
    // get 3, 5, 6 and 9.
    // The sum of these multiples is 23.
    // Find the sum of all the multiples of 3 or 5 below 1000.

    // Solution steps: create a while-loop that multiplies the given number by
    // incremental numbers as long as the result is less than 10
    public int multiples(int num) {
        int sum = 0;
        int check = 0;
        int count = 1;
        while (sum < 1000) {
            check += (count * num);
            if (check > 1000) {
                return sum;
            } else {
                sum += (count * num);
            }
            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        EulerAlgos algos = new EulerAlgos();
        System.out.println(algos.multiples(5));
    }
}