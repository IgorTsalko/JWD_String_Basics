package by.epamtc.tsalko.main;

public class Task {

    private static TaskLogic logic = new TaskLogic();

    public static void showSplitLine(String str) {
        String[] splitStrings;
        splitStrings = logic.splitIntoTwoLinesByEvenAndOdd(str);

        System.out.printf("[%s] - even: [%s], odd: [%s]\n", str, splitStrings[0], splitStrings[1]);
    }

    public static void showRatioLetters(String str) {
        double[] ratio;
        ratio = logic.countRatioUppercaseAndLowercase(str);

        System.out.printf("In string: [%s] uppercase: %.2f%%, lowercase: %.2f%%\n",
                str, ratio[0], ratio[1]);
    }

    public static void showStringWithoutDuplicateCharacters(String str) {
        String result;
        result = logic.removeDuplicateCharacters(str);

        System.out.printf("String before: [%s], string after: [%s]\n", str, result);
    }

    public static void showFrequencyRepetition(String str, char c) {
        int result;
        result = logic.findFrequencyRepetition(str, c);

        System.out.printf("In string: [%s] the character [%c] repeats %d times\n", str, c, result);
    }

    public static void showReversString(String str) {
        String result;
        result = logic.stringReverse(str);

        System.out.printf("String [%s] after reverse: [%s]\n", str, result);
    }

    public static void showInsertSubStringToString(String str, String subString, int start) {
        String result;
        result = logic.insertString(str, subString, start);

        System.out.printf("String before insert: [%s], subString: [%s], string after insert [%s]\n",
                str, subString, result);
    }

    public static void showRemoveSubString(String str, int start, int end) {
        String result;
        result = logic.removeSubString(str, start, end);

        System.out.printf("String: [%s], after removing: [%s]\n", str, result);
    }

    public static void showCopyPartOfString(String str, int start, int end) {
        String result;
        result = logic.copyPartOfString(str, start, end);

        System.out.printf("String: [%s], copy of subString: [%s]\n", str, result);
    }

    public static void showLengthOfString(String str) {
        int length;
        length = logic.determineLengthOfString(str);

        System.out.printf("Length of string: [%s] - %d chars\n", str, length);
    }

    public static void showQuantitySubStringInString(String str, String subString) {
        int quantity;
        quantity = logic.findQuantitySubString(str, subString);

        System.out.printf("String [%s] includes subString [%s] %d times\n", str, subString, quantity);
    }

    public static void showWordsInReverseOrder(String str) {
        String result;
        result = logic.wordsInReverseOrder(str);

        System.out.printf("String: [%s] after changing words order: [%s]\n", str, result);
    }

    public static void showStringWithAsterisksInsteadOfSpaces(String str) {
        String result;
        result = logic.replaceSpacesWithAsterisks(str);

        System.out.printf("String with spaces: [%s], string with asterisks: [%s]\n", str, result);
    }

    public static void showModifiedStringInLargestWord(String str) {
        String result;
        result = logic.replaceAWithBInLargestWord(str);

        System.out.printf("String: [%s] after modification: [%s]\n", str, result);
    }

    public static void showLengthShortestWord(String str) {
        int length;
        length = logic.findLengthShortestWord(str);

        System.out.printf("In string [%s] the shortest word has length %d chars\n", str, length);
    }

    public static void showAmountOfWords(String str) {
        int amount;
        amount = logic.countAmountOfWords(str);

        System.out.printf("In string [%s] %d words\n", str, amount);
    }

    public static void showWordsReplacement(String str, String firstWord, String secondWord) {
        String result;
        result = logic.swapWords(str, firstWord, secondWord);

        System.out.printf("String [%s] after words swap: [%s]\n", str, result);
    }

    public static void showStringWithoutLastWord(String str) {
        String result;
        result = logic.removeLastWord(str);

        System.out.printf("String [%s] without last word [%s]\n", str, result);
    }

    public static void showStringWithDoubleSpaces(String str) {
        String result;
        result = logic.doubleAllSpaces(str);

        System.out.printf("String [%s] with double spaces: [%s]\n", str, result);
    }

    public static void showStringPalindrome(String str) {
        boolean isPalindrome = logic.isPalindrome(str);

        if (isPalindrome) {
            System.out.printf("String [%s] is palindrome\n", str);
        } else {
            System.out.printf("String [%s] isn't palindrome\n", str);
        }
    }

    public static void showReplaceSubString(String str, String subString, int start, int end) {
        String result;
        result = logic.replaceSubString(str, subString, start, end);

        System.out.printf("String [%s] after changing subString: [%s]\n", str, result);
    }

    public static void showSumTwoBigNumbers(String firstNumber, String secondNumber) {
        String sum;
        sum = logic.addTwoNumbers(firstNumber, secondNumber);

        System.out.printf("Sum: %s\n", sum);
    }

    public static void showRemovingWordsOfGivenLength(String str, int length) {
        String result;
        result = logic.removeWordsOfGivenLength(str, length);

        System.out.printf("String [%s] without words %d chars long: [%s]\n", str, length, result);
    }

    public static void showRemovingExtraSpaces(String str) {
        String result;
        result = logic.removeExtraSpaces(str);

        System.out.printf("String [%s] without extra spaces: [%s]\n", str, result);
    }

    public static void showWords(String str) {
        String[] words;
        words = logic.extractWords(str);

        StringBuilder result;
        result = new StringBuilder(String.format("String [%s] содержит слова: ", str));

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);

            if (i != words.length - 1) {
                result.append(", ");
            }
        }

        System.out.println(result.toString());
    }

}
