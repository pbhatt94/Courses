public class ArrayMagic {
    
    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        for(int e: array) {
            if(e > number) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayMagic obj = new ArrayMagic();
        System.out.println(obj.doesHaveElementGreaterThan(new int[]{1,2,43,5233,1, 32122}, 12));
    }
}