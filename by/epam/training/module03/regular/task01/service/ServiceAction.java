package by.epam.training.module03.regular.task01.service;

import static java.util.Comparator.comparingInt;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceAction {


    public String[] splitTextOnParagraphs(String text) {
        return text.split("[\n]");
    }


    public String[] splitTextOnSentences(String text) {

        text = text.replace("\n", " ");

        Pattern p = Pattern.compile("([.?!]\\s*)");
        Matcher m = p.matcher(text);

        StringBuffer sb = new StringBuffer();

        while (m.find()) {
            m.appendReplacement(sb, m.group() + "\n");
        }
        return sb.toString().split("\n");
    }


    public String[] splitTextOnWords(String text) {
        return text.split("([.?!\n\\s]\\s*)");
    }


    public void sortParagraphsByCountSentences(String[] paragraphs) {

        String[][] sentences = new String[paragraphs.length][];

        for (int i = 0; i < paragraphs.length; i++) {
            sentences[i] = splitTextOnSentences(paragraphs[i]);
        }

        Arrays.sort(sentences, comparingInt(o -> o.length));

        for (int i = 0; i < paragraphs.length; i++) {

            StringBuilder sb = new StringBuilder();

            for (String str : sentences[i]) {
                sb.append(str).append(" ");
            }
            String s = sb.toString();
            paragraphs[i] = s;
        }
    }


    public String sortWordInSentenceByLength(String sentence) {

        String[] strTemp;
        StringBuilder sb = new StringBuilder();

        strTemp = sentence.replaceAll("\\p{Punct}", "").split(" ");

        Arrays.sort(strTemp, comparingInt(String::length));

        for (String str : strTemp) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

    public String sortLexemesInSentenceByCountSymbol(String sentence, char ch) {

        String[] lexemes;
        StringBuilder sb = new StringBuilder();

        lexemes = splitTextOnWords(sentence);

//        Arrays.sort(lexemes, comparingInt(o -> countCharInLexeme(o, ch)));
        Arrays.sort(lexemes, new WordsSort(ch));

        for (String str : lexemes) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
