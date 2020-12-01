package by.epam.training.module03.stringbuilder.task04;

// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.


public class Module03Task04 {
    public static void main(String[] args) {
        String word = "информатика";
        //String nWord = buildingNewWord(word);
        System.out.println(buildNewWord(buildingArray(word)));
    }

    private static char[] buildingArray(String str) {
        char[] temp = new char[4];
        try {
            str.getChars(7, 8, temp, 0);
            str.getChars(3, 5, temp, 1);
            str.getChars(7, 8, temp, 3);

        } catch (Exception ex) {
        }
        return temp;
    }

    private static String buildNewWord(char[] arr) {
        StringBuilder nWord = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            nWord.append(arr[i]);
        }
        return nWord.toString();
    }
}
