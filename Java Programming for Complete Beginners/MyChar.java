
public class MyChar {

    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
        char lowerCaseChar = Character.toLowerCase(ch);
        switch (lowerCaseChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                break;
        }

        return false;
    }

    public static void main(String[] args) {
        MyChar myChar = new MyChar();

        System.out.println(myChar.isVowel('A'));  
        System.out.println(myChar.isVowel('b'));  
        System.out.println(myChar.isVowel('E'));  
        System.out.println(myChar.isVowel('f'));
    }
}
