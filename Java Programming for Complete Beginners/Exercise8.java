
import java.util.Scanner;

public class Exercise8 {

    public boolean isLeapYear(int year) {
        if (year < 1) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        return (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Exercise8 obj = new Exercise8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        System.out.printf("%d is %s year", year, (obj.isLeapYear(year) ? "a leap year" : "not a leap year"));
        sc.close();
    }
}
