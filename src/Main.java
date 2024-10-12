public class Main {
    public static void main(String[] args) {
        // Create an instance of UnorderedArray with the size of 8
        UnorderedArray unorderedArray = new UnorderedArray(8);

        // Insert some elements
        System.out.println("Inserting elements: 3, 2, 6, 9, 12, 25, 11, 17, 21");
        unorderedArray.insert(3);
        unorderedArray.insert(2);
        unorderedArray.insert(6);
        unorderedArray.insert(9);
        unorderedArray.insert(12);
        unorderedArray.insert(25);
        unorderedArray.insert(11);
        unorderedArray.insert(17);
        unorderedArray.insert(21);

        unorderedArray.printArray();

        // Display current size
        System.out.println("Current size: " + unorderedArray.size());


        // Resize the array
        // Decrease -> Array should contain [3 2 6 9 12 25]
        unorderedArray.resize(6);
        System.out.println("Current size: " + unorderedArray.size());
        unorderedArray.printArray();


        // Insert another element -> Resize the array
        System.out.println("Inserting a new element: 10");
        unorderedArray.insert(10);
        System.out.println("Current size after inserting 10: " + unorderedArray.size());
        unorderedArray.printArray();


        // Find an element/integer
        // Existing element in the array -> display index
        int index = unorderedArray.find(12);
        System.out.println("Index of the target element is " + index);

        // Non-existent element -> display -1
        int index2 = unorderedArray.find(5);
        System.out.println("Index of the target element is " + index2);


        // Get an element by index
        try {
            System.out.println("Element at the target index is " + unorderedArray.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        unorderedArray.printArray();


        // Delete an element
        boolean deleted = unorderedArray.delete(6);
        System.out.println("Deleted element: " + deleted);
        System.out.println("Current size after deletion: " + unorderedArray.size());

        unorderedArray.printArray();


        // Try to get an element that is out of bounds -> Display error msg
        try {
            System.out.println("Element at the target index is " + unorderedArray.get(11) + ".");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // Final state of the array
        System.out.print("Final elements in the array: ");
        for (int i = 0; i < unorderedArray.size(); i++) {
            System.out.print(unorderedArray.get(i) + " ");
        }




        // Ordered Array Examples
        // Create an instance of OrderedArray with the size of 8
        OrderedArray orderedArray = new OrderedArray(8);

        // Insert some elements
        System.out.println("Inserting elements: 3, 2, 6, 9, 12, 25, 11, 17, 21");
        orderedArray.insert(3);
        orderedArray.insert(2);
        orderedArray.insert(6);
        orderedArray.insert(9);
        orderedArray.insert(12);
        orderedArray.insert(25);
        orderedArray.insert(11);
        orderedArray.insert(17);
        orderedArray.insert(21);

        orderedArray.printArray();

        // Display current size
        System.out.println("Current size: " + orderedArray.size());

        // Resize the array
        // Decrease -> Array should contain [2, 3, 6, 9, 11, 12]
        orderedArray.resize(6);
        System.out.println("Current size after resizing: " + orderedArray.size());
        orderedArray.printArray();

        // Insert another element -> Resize the array
        System.out.println("Inserting a new element: 10");
        orderedArray.insert(10);
        System.out.println("Current size after inserting 10: " + orderedArray.size());
        orderedArray.printArray();

        // Find an element/integer
        // Existing element in the array -> display index
        int index3 = orderedArray.find(12);
        System.out.println("Index of the target element (12) is: " + index3);

        // Non-existent element -> display -1
        int index4 = orderedArray.find(5);
        System.out.println("Index of the target element (5) is: " + index4);

        // Get an element by index
        try {
            System.out.println("Element at the target index (2) is: " + orderedArray.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        orderedArray.printArray();

        // Delete an element -> should display [2, 3, 9, 10, 11, 12]
        boolean deleted2 = orderedArray.delete(6);
        System.out.println("Deleted element (6): " + deleted2);
        System.out.println("Current size after deletion: " + orderedArray.size());

        orderedArray.printArray();

        // Try to get an element that is out of bounds -> Display error msg
        try {
            System.out.println("Element at the target index (11) is: " + orderedArray.get(11) + ".");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // Final state of the array
        System.out.print("Final elements in the array: ");
        for (int i = 0; i < orderedArray.size(); i++) {
            System.out.print(orderedArray.get(i) + " ");
        }
    }
    }