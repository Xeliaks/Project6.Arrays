package Part1Syntax;

public class Main {
    public static void main(String[] args) {
        // Part1 Demonstrate array creation:
        // Part1.1 With predefined size: new int[10]
        int[] arr1;
        arr1 = new int[10];
        // Part 1.2 With size defined in a variable: int[size]
        int[] arr2;
        int size = 5;
        arr2 = new int[size];
        // Part 1.3 Literal array creation: int[] arr = {1, 4, 2, ...}
        int[] arr3 = {1, 1 ,2, 3, 5};
        // Part 1.4 Use different types for array elements (int, double, String, char, boolean).
        String[] list = new String[10];
        double[] values = new double[size];
        char[] letters = new char[36];
        boolean[] truths = new boolean[2];
        // Part 1.5 Show use of array.length.
        System.out.println("Length of arr3: " + arr3.length);
        // Part 2 Set and access array elements by index:
        // Part 2.1 Assign value to array element: a[4] = 45
        arr3[4] = 45;
        // Part 2.2 Print array element value: ...println("5th element value: " + a[4])
        System.out.println("5th element value: " + arr3[4]);
        // Part 2.3 Demonstrate error of accessing array element by non-existing index: a[1000]. Include screenshot of error.
        //System.out.println("Non-existent array element: " + arr3[30]);
        // Part  3 Iterate over array (array traversal):
        // Part 3.1 Use for loop to traverse an array.
        for (int i=0; i < arr3.length; i++){
            System.out.println((i+1) + ". " + arr3[i]);
        }
        // Part 3.2 Use the enhanced for loop to traverse array: for (int value : values) { ... }
        for (int value: arr3) {
            System.out.println(value);
        }
        // Part 3.3 Use while loop to traverse an array.
         int j=0;
        while (j < arr3.length){
            System.out.println(arr3[j]);
            j++;
        }

    }
}