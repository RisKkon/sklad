import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithNums {


    public void printMemu() {

        System.out.println("1. Print only the prime numbers");
        System.out.println("2. Print the most common number");
        System.out.println("3. Print the largest chain of ascending numbers");
        System.out.println("4. Print the largest chain of descending numbers");
        System.out.println("5. Print the largest chain of repeating numbers");
        System.out.println("6. Print a chain of numbers from the array equal to a random number");
        System.out.println("7. Go back to main menu");

    }


    public void getPrimeNums(int[] arrayOfNums) {

        boolean flag = false;
        for (int i = 0; i < arrayOfNums.length; i++) {

            for (int j = 2; j <= arrayOfNums[i] / 2; ++j) {

                if (arrayOfNums[i] % j == 0) {

                    flag = true;
                    break;
                }
            }
            if (!flag) {

                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }

    public void getMostCommonNum(int[] arrayOfNums) {
        int count = 1, tempCount;
        int mostCommon = arrayOfNums[0];
        int temp = 0;
        for (int i = 0; i < arrayOfNums.length; i++) {
            temp = arrayOfNums[i];
            tempCount = 0;
            for (int j = 1; j < arrayOfNums.length; j++) {

                if (temp == arrayOfNums[j]) {

                    tempCount++;
                }
                if (tempCount > count) {
                    mostCommon = temp;
                    count = tempCount;
                }
            }
        }
        System.out.println("The most common number is: " + mostCommon);
    }

    public void getLargesrChainOfAscendingNums(Scanner scanner, int[] arrayOfNums) {

        ArrayList<Integer> currentChain = new ArrayList<>();
        ArrayList<Integer> bestChain = new ArrayList<>();
        ArrayList<Integer> chainFinal = new ArrayList<>();
        int nextNum = 0;
        int previousNum = 0;

        for (int i = 1; i < arrayOfNums.length; i++) {

            int currentNum = arrayOfNums[i - 1];
            if(i != 1) {
                previousNum = arrayOfNums[i - 2];
            }
            if (i != arrayOfNums.length - 1) {
                nextNum = arrayOfNums[i];
            }
            if(currentNum == nextNum - 1) {
                currentChain.add(currentNum);
            }
            if (previousNum == currentNum - 1) {
                currentChain.add(currentNum);
            }
            previousNum++;

            if (currentNum >= nextNum || i == arrayOfNums.length - 1) {

                if (currentChain.size() > bestChain.size()) {
                    bestChain.clear();
                    bestChain.addAll(currentChain);
                }
                currentChain.clear();
            }
        }

        for (int t : bestChain) {

            if (!chainFinal.contains(t)) {
                chainFinal.add(t);
            }
        }

        for (int k : chainFinal) {
            System.out.print(k + " ");
        }
    }

    public void getLargesrChainOfDescendingNums(Scanner scanner, int[] arrayOfNums) {

        ArrayList<Integer> currentChain = new ArrayList<>();
        ArrayList<Integer> bestChain = new ArrayList<>();
        ArrayList<Integer> chainFinal = new ArrayList<>();
        int nextNum = 0;
        int previousNum = 0;

        for(int i = 1; i < arrayOfNums.length; i++) {

            int currentNum = arrayOfNums[i - 1];

            if(i != 1) {

                previousNum = arrayOfNums[i - 2];
            }

            if(i != arrayOfNums.length - 1) {
                nextNum = arrayOfNums[i];

            }
            if(currentNum == nextNum + 1) {
                currentChain.add(currentNum);
            }
            if(previousNum == currentNum + 1) {
                currentChain.add(currentNum);
            }



            previousNum++;
            if (currentNum <= nextNum || i == arrayOfNums.length - 1) {

                if (currentChain.size() > bestChain.size()) {
                    bestChain.clear();
                    bestChain.addAll(currentChain);
                }
                currentChain.clear();
            }
        }


        for (int t : bestChain) {

            if (!chainFinal.contains(t)) {
                chainFinal.add(t);
            }
        }

        for (int k : chainFinal) {
            System.out.print(k + " ");
        }

    }
}


