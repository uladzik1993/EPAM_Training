package by.epam.training.module03.regular.task01.service;

import java.util.Comparator;

public class WordsSort implements Comparator<String> {
    private static char ch;

    public WordsSort(char ch) {
        WordsSort.ch = ch;
    }

    private static int countCharInWord(String word, char ch) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == ch)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int compare(String o1, String o2) {
        int c = countCharInWord(o2, ch) - countCharInWord(o1, ch);
        if (c != 0) {
            return c;
        }
        return o1.compareToIgnoreCase(o2);
    }
}