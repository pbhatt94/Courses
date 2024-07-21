
import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int number) {
        if(number < 0) return -1;
        int rev = 0;
        while(number > 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(ReverseNumber.reverseNumber(num));
        num = sc.nextInt();
        System.out.println(ReverseNumber.reverseNumber(num));
        num = sc.nextInt();
        System.out.println(ReverseNumber.reverseNumber(num));
    }
}
