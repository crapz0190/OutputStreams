package model;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Arrays;

public class ConvertToCharArray {

    public void writeWords(String[] words) throws IOException {
        LetterPrinter printer = new LetterPrinter();

        char[] letters = Converter.convert(words); // converting method
        for (char letter : letters) {
            printer.write(letter);
        }
    }

    public static void main(String[] args) {
        String[] words = {"This", " ", "is", " ", "a", " ", "test"};
        ConvertToCharArray cc = new ConvertToCharArray();
        try {
            cc.writeWords(words);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}

class LetterPrinter {
    public void write(char letter) {
        //implementation
        System.out.print(letter);
    }
}

class Converter {
    public static char[] convert(String[] words) throws IOException {
        // implement the method
        CharArrayWriter writer = new CharArrayWriter();

        if (words != null) {
            for (String word : words) {
                if (word != null) {
                    writer.write(word);
                }
            }
        }

        return writer.toCharArray();
    }
}