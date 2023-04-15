package org.example.Seminar6.Ex1;

public class Ex_1 {
    public static void main(String[] args) {
        Text text = new Text("Мама мыла раму");
        Word word = new Word("раму");
        Word word1 = new Word("руки");

        WordReplacer wordReplacer = new WordReplacer();
        WordDeleter wordDeleter = new WordDeleter();
        TextAppender textAppender = new TextAppender();
        TextPrinter textPrinter = new TextPrinter();

        textPrinter.printText(text);
        Text text1 = new Text(wordReplacer.replaceWordInText(text, word, word1).getText());
        textPrinter.printText(text1);
        Text text2 = new Text(wordDeleter.deleteWordInText(text1, word1).getText());
        textPrinter.printText(text2);
        Text text3 = new Text(textAppender.appendText(text2, new Text(word.getWord())).getText());
        textPrinter.printText(text3);

    }
}
