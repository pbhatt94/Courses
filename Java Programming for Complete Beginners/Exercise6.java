
import java.util.Scanner;

public class Exercise6 {

    public boolean check(int h, int b, int p) {
        return p * p + b * b == h * h;
    }

    public boolean isRightAngled(int side1, int side2, int side3) {
        return (side1 > 0 && side2 > 0 && side3 > 0) && (check(side1, side2, side3) || check(side2, side1, side3) || check(side3, side1, side2));
    }

    public static void main(String[] args) {
        Exercise6 obj = new Exercise6();
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        boolean result = obj.isRightAngled(s1, s2, s3);
        System.out.printf("Triangle wwith sides %d, %d, %d is a %s triangle", s1, s2, s3, (result ? "Valid RIght angle Triangle" : "not a Valid right angle Triangle"));
        sc.close();
    }
}
