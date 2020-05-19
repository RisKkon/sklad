import java.util.ArrayList;
import java.util.Random;


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


    }

    public void getMostCommonNum(int[] arrayOfNums) {
        int temp;
        int count      = 1, tempCount;
        int mostCommon = arrayOfNums[0];

        for (int i = 0; i < arrayOfNums.length; i++) {
            temp      = arrayOfNums[i];
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

    public void getLargestChainOfAscendingNums(int[] arrayOfNums) {

        ArrayList<Integer> currentChain = new ArrayList<>();
        ArrayList<Integer> bestChain    = new ArrayList<>();
        ArrayList<Integer> chainFinal   = new ArrayList<>();
        int nextNum                     = 0;
        int previousNum                 = 0;

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

    public void getLargestChainOfDescendingNums(int[] arrayOfNums) {

        ArrayList<Integer> currentChain = new ArrayList<>();
        ArrayList<Integer> bestChain    = new ArrayList<>();
        ArrayList<Integer> chainFinal   = new ArrayList<>();
        int nextNum                     = 0;
        int previousNum                 = 0;

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

    public void getLargestChainOfRepeatingNums(int[] arrayOfNums) {
        int currentNum;
        ArrayList<Integer> currentChain  = new ArrayList<>();
        ArrayList<Integer> bestChain     = new ArrayList<>();
        int nextNum                      = 0;
        int previousNum                  = 0;
        for(int i = 0; i < arrayOfNums.length; i++) {

            currentNum = arrayOfNums[i];
            if(i != arrayOfNums.length - 1)
            nextNum = arrayOfNums[i + 1];

            if(i != 0) {
                previousNum = arrayOfNums[i - 1];
            }

            if(currentNum == nextNum) {
                currentChain.add(currentNum);
            }
            if(previousNum == currentNum && nextNum != currentNum) {
                currentChain.add(currentNum);
            }

            if(currentNum < nextNum || currentNum > nextNum || i == arrayOfNums.length - 1) {

                if(currentChain.size() > bestChain.size()) {

                    bestChain.clear();
                    bestChain.addAll(currentChain);
                }
                currentChain.clear();
            }
        }
        for(int g : bestChain) {

            System.out.print(g + " ");
        }
    }

    public void getSumOfNumsEqualToARandomNum(int[] arrayOfNums) {
        int currentNum;
        ArrayList<Integer> currentChain = new ArrayList<>();
        ArrayList<Integer> bestChain = new ArrayList<>();

        Random rand              = new Random();
        int randomNum            = rand.nextInt((100 - 1) + 1) + 1;
        int nextNum              = 0;
        int tempSum              = 0;
        for(int i = 0; i < arrayOfNums.length; i++) {

            currentNum = arrayOfNums[i];
            if(i != arrayOfNums.length -1 ) {
                nextNum = arrayOfNums[i + 1];
            }
            tempSum += currentNum;
            currentChain.add(currentNum);

            if(tempSum == randomNum || i == arrayOfNums.length - 1) {
                

            }

        }



    }
}


