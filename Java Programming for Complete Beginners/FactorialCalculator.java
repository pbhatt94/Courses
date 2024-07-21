
public class FactorialCalculator {

    public int calculateFactorial(int number) {
        if (number < 0) {
            return -1;
        }
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();

        System.out.println(calculator.calculateFactorial(5));
        System.out.println(calculator.calculateFactorial(4));
        System.out.println(calculator.calculateFactorial(3));
        System.out.println(calculator.calculateFactorial(2));
        System.out.println(calculator.calculateFactorial(1));
        System.out.println(calculator.calculateFactorial(0));
        System.out.println(calculator.calculateFactorial(-5));
    }
}
