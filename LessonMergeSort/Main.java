package LessonMergeSort;

public class Main {

    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void mergeSort(int[] array) {

        int length = array.length;
        if(length <= 1) return; // Base case

        int middle = length / 2; // Middle of array
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // Left array
        int j = 0; // Right array

        for(; i < length; i++) { // Splits the array in half until the length of each array is less than or equal to 1
            if(i < middle) {
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // Indices (i = original array) (l = left array) (r = right array)
        while(l < leftSize && r < rightSize) { // While there are still elements in both arrays, continue to add elements to the original array
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
