import java.util.Scanner;



public class Game {

    public static void main(String[] args) {
        boolean isGameRunning = true;
        boolean isGameModeRunning;
        while (isGameRunning) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the game ");
            System.out.println("1. Work with numbers");
            System.out.println("2. Work with words");
            System.out.println("3. Exit from the program ");
            isGameModeRunning   = true;
            int gameMode        = scanner.nextInt();
            WorkWithNums nums   = new WorkWithNums();
            WorkWithWords words = new WorkWithWords();
            while (isGameModeRunning) {


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
                    if (chosenFunction == 1) {
                        nums.getPrimeNums(arrayOfNums);
                    }
                    if (chosenFunction == 2) {
                        nums.getMostCommonNum(arrayOfNums);
                    }
                    if (chosenFunction == 3) {
                        nums.getLargestChainOfAscendingNums(arrayOfNums);

                    }
                    if (chosenFunction == 4) {
                        nums.getLargestChainOfDescendingNums(arrayOfNums);
                    }
                    if (chosenFunction == 5) {
                        nums.getLargestChainOfRepeatingNums(arrayOfNums);
                    }
                    if (chosenFunction == 6) {
                        nums.getSumOfNumsEqualToARandomNum(arrayOfNums);
                    }
                    if (chosenFunction == 7) {
                        isGameModeRunning = false;
                    }
                }

                if(gameMode == 2) {
                    System.out.println("Enter with how many words are you going to work with");
                    int countOfWords = scanner.nextInt();
                    String[] arrayOfWords = new String[countOfWords + 1];
                    System.out.println("Enter the words");

                    for(int i = 0; i < arrayOfWords.length; i++) {
                        arrayOfWords[i] = scanner.nextLine();
                    }
                    words.printMenu();
                    int chosenFunction = scanner.nextInt();

                    if(chosenFunction == 1) {
                        words.turnTheWordBackwards(arrayOfWords);
                    }
                    if(chosenFunction == 2) {
                        words.getTheMostRepeatedLetter(arrayOfWords);
                    }
                    if(chosenFunction == 3) {
                        words.getCountOfLettersForEveryWord(arrayOfWords);
                    }
                    if(chosenFunction == 4) {
                        words.getCountOfRepeatingWords(arrayOfWords);
                    }
                    if(chosenFunction == 5) {
                        isGameModeRunning = false;
                    }
                }
                if(gameMode == 3) {
                    isGameRunning = false;
                    break;
                }
            }
        }
    }
}