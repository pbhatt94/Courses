public class StringMagic2 {

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        StringMagic2 obj = new StringMagic2();
        System.out.println(obj.hasConsecutiveDuplicates("Check this string for duplicates."));
    }
}