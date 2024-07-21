
public class NumberUtils {

    public int getLastDigit(int number) {
        return number >= 0 ? number % 10 : -1;
    }

    public static void main(String[] args) {
        NumberUtils utils = new NumberUtils();

        System.out.println(utils.getLastDigit(1234));   
        System.out.println(utils.getLastDigit(90));     
        System.out.println(utils.getLastDigit(9));      
        System.out.println(utils.getLastDigit(0));      
        System.out.println(utils.getLastDigit(-67));
    }
}
