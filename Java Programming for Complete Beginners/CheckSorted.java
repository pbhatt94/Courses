public class CheckSorted {
    
    public boolean isSorted(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            if(array[i] > array[i+1] ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        CheckSorted checker = new CheckSorted();
        
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 2, 4, 5};
        
        if (checker.isSorted(array1)) {
            System.out.println("array1 is sorted.");
        } else {
            System.out.println("array1 is not sorted.");
        }
        
        if (checker.isSorted(array2)) {
            System.out.println("array2 is sorted.");
        } else {
            System.out.println("array2 is not sorted.");
        }

    }
}
