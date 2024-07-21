import java.util.Arrays;

public class ReverseArray {
    public int[] reverseArray(int[] array) {

        int i=0, j=array.length-1;
        while(i<=j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
            i++;
        }
        return array;
    }
    public static void main(String[] args) {
        ReverseArray arrayMagic = new ReverseArray();

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] reversedArray = arrayMagic.reverseArray(array);

        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

}
