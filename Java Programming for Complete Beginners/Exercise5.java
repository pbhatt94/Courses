
import java.util.Scanner;

public class Exercise5 {

    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        return angle1 > 0 && angle2 > 0 && angle3 > 0 && angle1 + angle2 + angle3 == 180;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angles of a triangle");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        Exercise5 obj = new Exercise5();
        boolean result = obj.isValidTriangle(angle1, angle2, angle3);
        System.out.printf("Triangle with angles %d, %d, %d is a %s traingle", angle1, angle2, angle3, (result ? "Valid" : "Invalid"));
        sc.close();
    }
}