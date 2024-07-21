public class SecLargest {
    /**
     * This method finds and returns the second largest element in the given array.
     * 
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */
     
     public int findSecondLargestElement(int[] array) {
        if(array.length < 2) return -1;
        int largest = Integer.MIN_VALUE;
        for(int e: array) {
            largest = Math.max(e, largest);
        }
        int secLar = Integer.MIN_VALUE;
        for(int e: array) {
            if(e > secLar && e < largest) {
                secLar = e;
            }
        }
        if(secLar == largest || secLar == Integer.MIN_VALUE) return -1;
        return secLar;
    }

    public static void main(String[] args) {
        SecLargest obj = new SecLargest();
        int arr[] = {22, 32, 12, 22, 1, 44, 90};
        System.out.println(obj.findSecondLargestElement(arr));
    }
}
