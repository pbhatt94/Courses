
import java.util.Scanner;

public class BiNumber {

    private int number1;
    private int number2;

    /**
     * Constructor that initializes the two numbers.
     * @param number1: The first number.
     * @param number2: The second number.
     */
    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * Getter for the first number.
     * @return the first number.
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Getter for the second number.
     * @return the second number.
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Calculates and returns the least common multiple (LCM) of the two numbers.
     * If either number is negative, returns -1 as the LCM for negative numbers is undefined.
     * If either number is zero, returns 0 as the LCM of 0 and any other number is 0.
     * @return LCM of the two numbers, or -1 if either number is negative, or 0 if either number is zero.
     */
     
     
    public int gcd(int a, int b) {
        if(b > a) return gcd(b, a);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
     
    public int calculateLCM() {
        if(number1 < 0 || number2 < 0) return -1;
        if(number1 == 0 || number2 == 0) return 0;
        return (number1 * number2) / gcd(number1, number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Create an instance of BiNumber
        BiNumber biNumber = new BiNumber(num1, num2);

        // Calculate and display the LCM
        int lcm = biNumber.calculateLCM();
        if (lcm == -1) {
            System.out.println("LCM is undefined for negative numbers.");
        } else if (lcm == 0) {
            System.out.println("LCM of 0 and any other number is 0.");
        } else {
            System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        }
        scanner.close();
    }
}