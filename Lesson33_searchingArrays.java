public class Lesson33_searchingArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 8, 3, 9, 4};
        int target = 2;
        boolean isFound = false;

        bubbleSort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound) {
            System.out.println("Element not found in the array.");
        }
    }

    static void bubbleSort(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < numbers.length - i - 1; j++) {
                if(numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
