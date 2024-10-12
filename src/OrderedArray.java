import java.util.Arrays;

public class OrderedArray {
    private int[] arr;
    private int size;


    // Constructor to initialize the array
    public OrderedArray(int initialSize) {
        arr = new int[initialSize];
        size = 0;
    }


    // Insertion Method
    public void insert(int x) {
        if (size >= arr.length) {
            resize(size + 1);       // Add one additional space if array's full
        }
        int i;
        for (i = size - 1; i >= 0 && arr[i] > x; i--) {
            arr[i + 1] = arr[i];            // Shift larger elements
        }
        arr[i + 1] = x;
        size++;
    }


    // Resizing Method
    public void resize(int newSize) {
        arr = Arrays.copyOf(arr, newSize);
        if (newSize < size) {
            size = newSize;
        }
    }


    // Binary Search Method
    private int binarySearch(int x) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;      // If elem is found
            } else if (arr[mid] < x) {
                left = mid + 1;             // If not found, continue searching in the second half
            } else {
                right = mid - 1;            // If not found, continue searching in the first half
            }
        }
        return -1;
    }


    // Deletion Method
    public boolean delete(int x) {
        // Search for the target element
        int index = binarySearch(x);

        if (index == -1) {
            return false;
        }

        for (int j = index; j < size - 1; j++) {
            arr[j] = arr[j + 1];        // Shift the other elements to the left
        }
        size--;
        return true;
    }


    // Find Element (index) Method
    public int find(int x) {
        return binarySearch(x);
    }


    //Get Element Method
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ". Indices should be from 0 to " + (size - 1) + ".");
        }
        return arr[index];
    }


    // Size of the array
    public int size() {
        return size;
    }


    // Print the elements in the array
    public void printArray() {
        System.out.print("Current elements in the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}