package Part2ArrayHandling;
import java.util.Scanner;
import java.util.Random;
public class Main {
    //Part2.1  Input Array Method
    public static int[] inputArray(int size){
            Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in array you want: ");
        size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i=0;i<size;i++){
            array[i] = in.nextInt();
        }
        return array;
    }
    //Part2.2 Create an array with random values method
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(101);
        }
        return randomArray;
    }
    //Part2.3 Print Array Method
    public static void printArray(int[] array){
        for (int i=0; i< array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    //Part2.4 Sum of array elements
    public static int sum(int size){
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of elements in array you want: ");
        size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i=0;i<size;i++){
            array[i] = in.nextInt();
        }
        printArray(array);
        for (int i=0;i<size;i++){
            sum +=array[i] ;
        }
        return sum;
    }
//Part 2.5 Largest value in an array
public static int max(int size) {
    Random random = new Random();
    int[] randomArray = new int[size];
    int max = 0;
    for (int i = 0; i < randomArray.length; i++) {
        randomArray[i] = random.nextInt(101);
    }
    printArray(randomArray);
    for (int i = 0; i < randomArray.length; i++){
        if (randomArray[i]>max){
            max = randomArray[i];
        }
    }
    System.out.println("Largest value in array: " + max);
    return max;
}
//Part2.6 Search value in array method
    public static int searchArray(int[] array, int value){
        int index = 0;
        for (int i =0;i< array.length; i++){
            if (array[i]==value){
                index = i;
                System.out.println("Your searched value is here: " + index);
                break;
            }
            else {
                index =-1;
                System.out.println("Your searched value is not found: " + index);
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int size = 0;
    int[] arr1 = inputArray(size);
    printArray(arr1);
    int[] arr2 = randomArray(5);
    printArray(arr2);
    int sum = sum(size);
    System.out.println("Sum of elements of the given array equals: " + sum);
    max(5);
    searchArray(arr1,3);
    }
}
