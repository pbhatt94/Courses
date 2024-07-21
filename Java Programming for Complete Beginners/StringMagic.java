public class StringMagic {
    
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        int cnt = 0;
        for(int i=0; i<str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        StringMagic obj = new StringMagic();
        System.out.println(obj.countUppercaseLetters("Hello this is a String"));
    }
}