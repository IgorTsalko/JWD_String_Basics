package by.epamtc.tsalko.main;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskLogic {

    /*
    Здесь используеться StringBuilder для увеличения скорости обработки
    при большой длине строки.
    */
    public String[] splitIntoTwoLinesByEvenAndOdd(String str) {
        String[] result = new String[2];
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            /*
            Здесь намеренно переставлены местами добавления четных и нечетных.
            т.к. отсчет с 0, то четными будут: 0, 1, 3, 5 и т.д.
             */
            if (i % 2 == 0) {
                odd.append(symbol);
            } else {
                even.append(symbol);
            }
        }

        result[0] = even.toString();
        result[1] = odd.toString();

        return result;
    }

    public double[] countRatioUppercaseAndLowercase(String str) {
        double[] ratio = new double[2];
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if ((symbol >= 'A' && symbol <= 'Z')
                    || (symbol >= 'А' && symbol <= 'Я')) {
                upper++;
            } else if ((symbol >= 'a' && symbol <= 'z')
                    || (symbol >= 'а' && symbol <= 'я')) {
                lower++;
            }
        }

        ratio[0] = ((double) upper / str.length()) * 100.0;
        ratio[1] = ((double) lower / str.length()) * 100.0;

        return ratio;
    }

    public String removeDuplicateCharacters(String str) {
        String copyString = new String(str);

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (copyString.contains(String.valueOf(symbol))) {
                copyString = copyString.replace(Character.toString(symbol), "");
            }
        }

        return copyString;
    }

    public int findFrequencyRepetition(String str, char c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (symbol == c) {
                count++;
            }
        }

        return count;
    }

    public String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String insertString(String str, String subStr, int start) {
        if (start > str.length() - 1) {
            start = str.length();
        }

        return str.substring(0, start) +
                subStr +
                str.substring(start);
    }

    public String removeSubString(String str, int start, int end) {
        StringBuilder result = new StringBuilder(str);

        if (end > str.length() - 1) {
            end = str.length();
        }

        result = result.replace(start, end, "");

        return result.toString();
    }

    public String copyPartOfString(String str, int start, int end) {
        String copyOfString;

        if (end > str.length() - 1) {
            end = str.length();
        }

        copyOfString = str.substring(start, end);

        return copyOfString;
    }

    public int determineLengthOfString(String str) {
        return str.length();
    }

    public int findQuantitySubString(String str, String subString) {
        int quantity = 0;

        Pattern pattern = Pattern.compile(subString);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            quantity++;
        }

        return quantity;
    }

    public String wordsInReverseOrder(String str) {
        StringBuilder result = new StringBuilder();
        String[] wordsArray;
        wordsArray = str.split("\\s+");

        for (int i = wordsArray.length - 1; i >= 0; i--) {
            result.append(wordsArray[i] + " ");
        }

        return result.toString().trim();
    }

    public String replaceSpacesWithAsterisks(String str) {
        return str.replaceAll("\\s+", "*");
    }

    public String replaceAWithBInLargestWord(String str) {
        String result;
        String largestWord;
        String modifiedLargestWord;
        String[] wordsArray;
        wordsArray = str.split("\\s+");

        // Можно было бы отсортировать и через Arrays.sort()
        for (int i = 0; i < wordsArray.length - 1; i++) {
            for (int j = i + 1; j < wordsArray.length; j++) {
                if (wordsArray[i].length() < wordsArray[j].length()) {
                    String copyString = wordsArray[j];
                    wordsArray[j] = wordsArray[i];
                    wordsArray[i] = copyString;
                }
            }
        }

        largestWord = wordsArray[0];
        modifiedLargestWord = largestWord.replace('a', 'b');

        result = str.replace(largestWord, modifiedLargestWord);

        return result;
    }

    public int findLengthShortestWord(String str) {
        int length;
        String[] wordsArray;
        wordsArray = str.split("\\s+");

        Arrays.sort(wordsArray);

        length = wordsArray[0].length();

        return length;
    }

    public int countAmountOfWords(String str) {
        return str.split("\\s+").length;
    }

    public String swapWords(String str, String firstWord, String secondWord) {
        int startIndexFirstWord;
        int endIndexFirstWord;
        int startIndexSecondWord;
        int endIndexSecondWord;

        startIndexFirstWord = str.indexOf(firstWord);
        endIndexFirstWord = startIndexFirstWord + firstWord.length();
        startIndexSecondWord = str.indexOf(secondWord);
        endIndexSecondWord = startIndexSecondWord + secondWord.length();

        return str.substring(0, startIndexFirstWord) +
                secondWord +
                str.substring(endIndexFirstWord, startIndexSecondWord) +
                firstWord +
                str.substring(endIndexSecondWord);
    }

    public String removeLastWord(String str) {
        return str.replaceAll("\\b(\\w+)\\b.?$", "");
    }

    public String doubleAllSpaces(String str) {
        return str.replaceAll("\\s", "  ");
    }

    public boolean isPalindrome(String str) {
        String reverseString = new StringBuilder(str).reverse().toString();

        return reverseString.equals(str);
    }

    public String replaceSubString(String str, String subString, int start, int end) {
        return str.substring(0, start) +
                subString +
                str.substring(end);
    }

    public String addTwoNumbers(String firstNumber, String secondNumber) {
        // Сюда поместим сумму чисел
        StringBuilder sum = new StringBuilder();

        // Если числа разной длины, выравниваем их с заполнением нулями в начале
        if (firstNumber.length() != secondNumber.length()) {
            String[] alignedString = alignStringsLength(firstNumber, secondNumber);
            firstNumber = alignedString[0];
            secondNumber = alignedString[1];
        }

        // дополнительный десяток, если сумма больше 9
        int addingTen = 0;

        for (int i = firstNumber.length() - 1; i >= 0; i--) {
            // Берем два последних числа, переводим в строку а затем в число и складываем
            int s = Integer.parseInt(String.valueOf(firstNumber.charAt(i))) +
                    Integer.parseInt(String.valueOf(secondNumber.charAt(i)));

            // Если есть доп. десяток, то прибовляем
            s += addingTen;
            addingTen = 0;

            // Если сумма больше 10, нужно перенести единицу
            if (s > 9) {
                addingTen = 1;
                s %= 10;
            }

            // Вставляем сумму двух цифр в начало суммы
            sum.insert(0, s);
        }

        // Если после сложения последних цифр остался лишний десяток, записываем его
        if (addingTen > 0) {
            sum.insert(0, addingTen);
        }

        return sum.toString();
    }

    private String[] alignStringsLength(String firstNumber, String secondNumber) {
        String[] result = new String[2];

        String largestNumber;
        String smallestNumber;

        StringBuilder buffer;
        int lengthDifference;

        // Находим большее по длине число и присваиваем значения
        if (firstNumber.length() > secondNumber.length()) {
            largestNumber = firstNumber;
            smallestNumber = secondNumber;
            lengthDifference = firstNumber.length() - secondNumber.length();
        } else if (firstNumber.length() < secondNumber.length()) {
            largestNumber = secondNumber;
            smallestNumber = firstNumber;
            lengthDifference = secondNumber.length() - firstNumber.length();
        } else {
            largestNumber = firstNumber;
            smallestNumber = secondNumber;
            lengthDifference = 0;
        }

        // Если числа разной длины, меньшее нужно заполнить нулями в начале до единой длины
        if (lengthDifference > 0) {
            buffer = new StringBuilder(smallestNumber);
            for (int i = 0; i < lengthDifference; i++) {
                buffer.insert(0, "0");
            }
            smallestNumber = buffer.toString();
        }

        result[0] = largestNumber;
        result[1] = smallestNumber;

        return result;
    }

    public String removeWordsOfGivenLength(String str, int length) {
        return str.replaceAll("\\b(\\w{" + length + "})\\b", "");
    }

    public String removeExtraSpaces(String str) {
        return str.replaceAll("\\s+", " ").trim();
    }

    public String[] extractWords(String str) {
        return str.split("\\s+");
    }
    
}
