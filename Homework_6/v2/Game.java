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
                nums.getLargestChainOfAscendingNums(arrayOfNums);

            }
            if(chosenFunction == 4) {
                nums.getLargestChainOfDescendingNums(arrayOfNums);
            }
            if(chosenFunction ==5) {
                nums.getLargestChainOfRepeatingNums(arrayOfNums);
            }
            if(chosenFunction == 6) {

            }
            System.out.println();
        }
    }
}
