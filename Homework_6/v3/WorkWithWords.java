

public class WorkWithWords {

    public void printMenu() {

        System.out.println("1. Turn the letters of the words backwards");
        System.out.println("2. Print the most repeated letter for every word");
        System.out.println("3. Print the count of the letters for every word");
        System.out.println("4. Print the count of repeating words");
        System.out.println("5. Go back to main menu");
    }



    public void turnTheWordBackwards(String[] arrayOfWords) {

        for (String g : arrayOfWords) {
            StringBuilder strb = new StringBuilder(g);
            System.out.println(strb.reverse());


        }
    }

    public void getTheMostRepeatedLetter(String[] arrayOfWords) {

    }

    public void getCountOfLettersForEveryWord(String[] arrayOFWords) {

        for(int i = 1; i < arrayOFWords.length; i++) {

            int lenghtOfWord = arrayOFWords[i].length();

            System.out.println("The word " + arrayOFWords[i] + " has " + lenghtOfWord + " letters");
        }
    }

    public void getCountOfRepeatingWords(String[] arrayOfWords) {
        String currentWord;
        String bestWord  = "";
        int currentCount = 0;
        int bestCount    = 0;

        for(int i = 0; i < arrayOfWords.length; i++) {

            currentWord         = arrayOfWords[i];
            String previousWord = "";

            if(i != 0) {
                previousWord = arrayOfWords[i - 1];
            }
            if(i == 0) {
                bestWord = arrayOfWords[i];
                currentCount++;
            } else {
                if (currentWord.equals(previousWord)) {
                    currentCount++;
                    bestWord = currentWord;
                }
            }
            if(currentCount > bestCount) {
                bestCount = currentCount;
                currentWord = bestWord;
            }
        }
        System.out.println("The word "  + bestWord + " is repeated " + bestCount + " times");
    }
}
