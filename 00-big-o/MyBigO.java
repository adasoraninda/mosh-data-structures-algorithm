public class MyBigO {

    // O(1) Constant
    public void log1(int[] numbers) {
        System.out.println(numbers[0]);
    }

    // O(n) Linear
    public void log2(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // O(n^2) Quadratic
    public void log3(int[] numbers) {
        for (int number1 : numbers) {
            for (int number2 : numbers) {
                System.out.println(number1 + number2);
            }
        }
    }

    // O(log n) Logarithmic & O(2^n) Exponential

    // Fast -> Slow
    // O(1), O(log n), O(n), O(n^2), O(2^n)
}
