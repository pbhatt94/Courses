import java.util.ArrayList;
import java.util.List;

public class Multiples {
    public List<Integer> determineMultiples(int number, int limit) {
        int num = number;
        List<Integer> multiples = new ArrayList<Integer>();
        if(number<=0 || limit<=0) return multiples;
        while(number < limit) {
            multiples.add(number);
            number += num;
        }
        return multiples;
    }
    public static void main(String[] args) {
        Multiples multiplesFinder = new Multiples();

        int number = 3;
        int limit = 20;

        List<Integer> multiples = multiplesFinder.determineMultiples(number, limit);

        System.out.println("Multiples of " + number + " up to " + limit + ": " + multiples);
    }
}
