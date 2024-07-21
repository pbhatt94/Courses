import java.util.ArrayList;
import java.util.List;

public class Factors {
    public List<Integer> determineAllFactors(int number) {

        // TODO: Write your code here
        List<Integer> factors = new ArrayList<>();
        for(int i=1; i<=number; i++) {
            if(number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
    public static void main(String[] args) {
        Factors factors = new Factors();

        int number = 36;

        List<Integer> allFactors = factors.determineAllFactors(number);

        System.out.println("Factors of " + number + ": " + allFactors);
    }
}
