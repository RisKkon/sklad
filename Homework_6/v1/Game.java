import java.util.Scanner;



public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game ");
        System.out.println("1. Work with numbers");
        System.out.println("2. Work with words");
        System.out.println("3. Exit from the program ");

        int gameMode = scanner.nextInt();
        WorkWithNums nums = new WorkWithNums();




        if (gameMode == 1) {

            System.out.println("Enter how many numbers are you gonna work with");
            int countOfNums = scanner.nextInt();
            int[] arrayOfNums = new int[countOfNums];
            System.out.println("Enter the numbers");
            for (int i = 0; i < arrayOfNums.length; i++) {
                arrayOfNums[i] = scanner.nextInt();
            }
            nums.printMemu();
            int chosenFunction = scanner.nextInt();
            if(chosenFunction == 1) {
                nums.getPrimeNums(arrayOfNums);
            }
            if(chosenFunction == 2) {
                nums.getMostCommonNum(arrayOfNums);
            }
            if(chosenFunction == 3) {
                nums.getLargesrChainOfAscendingNums(scanner, arrayOfNums);

            }
            if(chosenFunction == 4) {
                nums.getLargesrChainOfDescendingNums(scanner, arrayOfNums);

            }
            System.out.println();
        }



    }

    public static int[] getArrayOfNums(Scanner scanner) {

        System.out.println("Enter how many numbers are you gonna work with");
        int countOfNums = scanner.nextInt();
        int arrayOfNums[] = new int[countOfNums];
        System.out.println("Enter the numbers");
        for (int i = 0; i < arrayOfNums.length; i++) {
            arrayOfNums[i] = scanner.nextInt();
        }

        return arrayOfNums;


    }

    public static int[] useArrayOfNums(Scanner scanner) {

        return getArrayOfNums(scanner);

    }


    public static int workWithNumsMenu(Scanner scanner) {

        System.out.println("1. Print only the prime numbers");
        System.out.println("2. Print the most common number");
        System.out.println("3. Print the largest chain of ascending numbers");
        System.out.println("4. Print the largest chain of descending numbers");
        System.out.println("5. Print the largest chain of repeating numbers");
        System.out.println("6. Print a chain of numbers from the array equal to a random number");
        System.out.println("7. Go back to main menu");
        int input = scanner.nextInt();

        return input;
    }

    public static void getPrimeNums(Scanner scanner, int[] arrayOfNums) {
        boolean flag = false;
        for(int i = 0; i < arrayOfNums.length; i++) {

            for(int j = 2; j <= arrayOfNums[i] / 2; ++j) {

                if(arrayOfNums[i] % j == 0) {

                    flag = true;
                    break;
                }
            }
            if(!flag) {

                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

    }



}
