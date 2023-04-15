package org.example.Seminar6.Ex1;

public class TextAppender {
    public Text appendText(Text currentText, Text newText){
        return new Text (currentText.getText() + newText.getText());
    }
}
