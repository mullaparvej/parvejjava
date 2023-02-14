public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // the number of Fibonacci numbers to calculate
        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        // print the Fibonacci sequence
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
