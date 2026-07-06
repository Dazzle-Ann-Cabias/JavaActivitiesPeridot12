import java.util.Arrays;

public class algorithmsample {

    public static void heapSort(int[] array) {
        int n = array.length;
        // Build Max-Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i); }
        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0); } }
    private static void heapify(int[] array, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heapSize && array[left] > array[largest]) {
            largest = left;
        }
        if (right < heapSize && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, heapSize, largest);
        } }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp; }
    public static void main(String[] args) {
        int[] ages = {10, 8, 3, 5, 2, 7, 1, 4, 6, 9};

        System.out.println("Original: " + Arrays.toString(ages));
        heapSort(ages);
        System.out.println("Sorted:   " + Arrays.toString(ages));
    }
}