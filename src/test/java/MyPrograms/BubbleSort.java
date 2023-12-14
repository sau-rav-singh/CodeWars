package MyPrograms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 4, 5, 6, 2, 1, 3};
        int tempValue;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Swap the elements if they are in the wrong order
                    tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
