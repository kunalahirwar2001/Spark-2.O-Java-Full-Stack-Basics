public class Arrays {
    public static void main(String[] args) {
        // Array in java is a collection of similar type of elements that have a contiguous memory location.
        // Array is a reference data type, so it is necessary to initialize it before use.
        // The size of an array must be specified while declaring it.
        // The size of an array is fixed, so you cannot change it once it is created.
        // Array can store primitive data types as well as objects of a class depending on the definition of the array.

        // Array declaration
        // dataType[] arrayName;
        // dataType arrayName[];
        // dataType arrayName[] = new dataType[arraySize];
        // dataType[] arrayName = new dataType[arraySize];
        // dataType[] arrayName = {value1, value2, value3, ...}

        // Array initialization
        // dataType[] arrayName = new dataType[arraySize];
        // arrayName[index] = value;

        // Array declaration and initialization
        // dataType[] arrayName = {value1, value2, value3, ...};

        
        // Array of integers with 6 elements 
        // int[] array = { 1, 2, 3, 4, 5, 6 };

        // Print the array elements
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }

        //1. Declare an array of integers with 5 elements
        // int [] arr = new int[5];

        //2. Assign values to the array elements
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        //3. Print the array elements
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10;
        }
        
    }
}
