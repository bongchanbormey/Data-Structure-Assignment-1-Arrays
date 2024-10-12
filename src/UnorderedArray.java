import java.util.Arrays;

public class UnorderedArray {
    private int[] arr;
    private int size;

    // Constructor to initialize the array size
    public UnorderedArray (int initialSize) {
        arr = new int[initialSize];
        size = 0;
    }

    // Insertion Method - Add new elem at the end of the array
    public void insert(int x) {
        if (size >= arr.length) {
            resize(arr.length + 1);     // Add one additional space if array's full
        }
        arr[size++] = x;
    }

    // Resizing Method
    public void resize(int newSize) {
        arr = Arrays.copyOf(arr, newSize);     //Make a copy of the existing array
        if (newSize < size) {
            size = newSize;    // Discard any elements that are out of the resized array
        }
    }

    // Deletion Method
    public boolean delete(int x) {
        for (int i = 0; i < size; i++) {
            // Search for the target elem to delete
            if (arr[i] == x) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];        // Shift the remaining elements to the left
                }
                size--;
                return true;
            }
        }
        return false;       // if it doesn't exist
    }

    // Find Element (index) Method
    public int find(int x) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                return i;       // return the index
            }
        }
        return -1;      // if it doesn't exist
    }

    // Get Element Method
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