public class BiArray {

    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        // TODO: Write the code to compare the sums of the arrays and return the result.
        return sum1 == sum2;
    }

    private int calculateSum(int[] array) {
        
        // TODO: Write the code to calculate the sum of the array.
        int sum = 0;
        for(int e: array) sum += e;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        BiArray biArray = new BiArray(arr1, arr2);

        boolean sumsEqual = biArray.areSumsEqual();

        if (sumsEqual) {
            System.out.println("The sums of array1 and array2 are equal.");
        } else {
            System.out.println("The sums of array1 and array2 are not equal.");
        }

    }
}