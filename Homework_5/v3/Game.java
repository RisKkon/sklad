    import java.util.Random;
    import java.util.Scanner;

public class Game {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game.");
        System.out.println("Enter the size of the array.");

        int sizeOfArray = scanner.nextInt();
        int[] array     = new int[sizeOfArray];
        getArray(array, sizeOfArray);
        while(true) { //TODO Make the game loop

            chosenFunction();
            executeFunction(array);
            printArray(array);

        }

    }

    public static void reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }

    }

    public static int[] getArray(int[] array, int sizeOfArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array.");
        for (int i = 0; i < sizeOfArray; i++) {

            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void chosenFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Sort the numbers in the array in ascending order");
        System.out.println("2. Sort the numbers in the array in descending order");
        System.out.println("3. Look for a specific number in the array");
        System.out.println("4. Shuffle the numbers in the array");
        System.out.println("5. Get the sum of the numbers in the array");
        System.out.println("6. Find the largest number");
        System.out.println("7. Find the smallest number");
        System.out.println("8. Find the average of all the numbers in the array");
        System.out.println("9. Check for symmetry in the array");
        System.out.println("10. Reverse the numbers in the array");
        System.out.println("11. Show the array of numbers");
        System.out.println("12. Exit");

    }

    public static void executeFunction(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int chosenFunction = scanner.nextInt();
        if (chosenFunction == 1) {
            sortNumbersInAscendingOrder(array, 0, array.length - 1);
        } else if (chosenFunction == 2) {
            sortNumbersInAscendingOrder(array, 0, array.length - 1);
            reverseArray(array);
        } else if (chosenFunction == 3) {
            searchForNumber(array);
        } else if (chosenFunction == 4) {
            shuffleArray(array);
        } else if (chosenFunction == 5) {
            getSumOfArray(array);
        } else if (chosenFunction == 6) {
            findLargestNumber(array);
        } else if (chosenFunction == 7) {
            findSmallestNumber(array);
        } else if (chosenFunction == 8) {
            findAverageNumber(array);
        } else if (chosenFunction == 9) {
            if (isArraySymmetrical(array)) {
                System.out.println("Array is symmetrical");
            } else {
                System.out.println("Array is not symmetrical");
            }
        } else if (chosenFunction == 10) {
            reverseArray(array);
        } else if (chosenFunction == 11) {
            printArray(array);
        }




    }

    public static void findAverageNumber(int[] array) {

        double sumOfNums = 0;

        for (int i = 0; i < array.length; i++) {

            sumOfNums += array[i];
        }

        double average = sumOfNums / array.length;
        System.out.println("The average of this array is: " + average);
    }

    public static boolean isArraySymmetrical(int[] array) {
        int maxIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {


            if (array[i] != array[maxIndex]) {
                return false;
            }
            maxIndex --;
        }
        return true;
    }

    public static void findSmallestNumber(int[] array) {

        int smallestNum = array[0];

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp < smallestNum) {
                smallestNum = temp;
            }
        }
        System.out.println("The smallest number in the array is :" + smallestNum);
    }

    public static void findLargestNumber(int[] array) {

        int largestNum = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp > largestNum) {
                largestNum = temp;
            }
        }
        System.out.println("The largest number in the array is :" + largestNum);
    }

    public static void getSumOfArray(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        System.out.println("The sum of all the elements is : " + sum);
    }

    public static void shuffleArray(int[] array) {

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {

            int randomIndexToSwap    = rand.nextInt(array.length);
            int temp                 = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i]                 = temp;
        }
    }

    public static void searchForNumber(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to search for.");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("The number: " + array[i] + " is on index: " + i);
            }

        }
    }

    public static void sortNumbersInAscendingOrder(int[] array, int low, int high) {
        if (array == null) return;
        if (low >= high) return;

        int middle  = low + (high - low) / 2;
        int pivot   = array[middle];
        int i       = low;
        int j       = high;

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {

                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            sortNumbersInAscendingOrder(array, low, j);

        }
        if (high > i) {
            sortNumbersInAscendingOrder(array, i, high);
        }
    }

    public static void swap(int[] array, int x, int y) {

        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}