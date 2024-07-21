
import java.util.Scanner;

public class Exercise7 {

    public long calculateSumOfSquares(int n) {
        if (n < 0) {
            return -1;
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Exercise7 obj = new Exercise7();
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long answer = obj.calculateSumOfSquares(num);
        System.out.println("Sum of Square of numbers till " + num + " is equal to " + answer);
        sc.close();
    }
}
