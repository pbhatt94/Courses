import java.util.Scanner;

public class Exercise9 {
    public static boolean isPerfectNumber(int number) {
        int sum = 1;
        for(int i=2; i*i<number; i++) {
            if(number % i == 0) {
                if(i*i == number) sum += i;
                else sum += i + number/i;
            }
        }
        return sum == number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = Exercise9.isPerfectNumber(num);
        if(ans) System.out.println("Yes");
        else System.out.println("No");
    }
}
