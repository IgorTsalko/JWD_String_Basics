package by.epamtc.tsalko.main;

public class Main {

    public static void main(String[] args) {
        // random values
        String str = "Good afternoon  Java HOW are you Java?";
        String palindrome = "level";
        String firstBigNumber  = "85749625824293372036854775807";
        String secondBigNumber =   "949625824293372036854775807";

        Task.showSplitLine(str);
        Task.showRatioLetters(str);
        Task.showStringWithoutDuplicateCharacters(str);
        Task.showFrequencyRepetition(str, 'a');
        Task.showReversString(str);
        Task.showInsertSubStringToString(str, "EPAM EPAM", 8);
        Task.showRemoveSubString(str, 5, 10);
        Task.showCopyPartOfString(str, 5, 10);
        Task.showLengthOfString(str);
        Task.showQuantitySubStringInString(str, "Java");
        Task.showWordsInReverseOrder(str);
        Task.showStringWithAsterisksInsteadOfSpaces(str);
        Task.showModifiedStringInLargestWord(str);
        Task.showLengthShortestWord(str);
        Task.showAmountOfWords(str);
        Task.showWordsReplacement(str, "afternoon", "Java");
        Task.showStringWithoutLastWord(str);
        Task.showStringWithDoubleSpaces(str);
        Task.showStringPalindrome(palindrome);
        Task.showReplaceSubString(str, "TestTest", 5, 10);
        Task.showSumTwoBigNumbers(firstBigNumber, secondBigNumber);
        Task.showRemovingWordsOfGivenLength(str, 4);
        Task.showRemovingExtraSpaces(str);
        Task.showWords(str);
    }
}
