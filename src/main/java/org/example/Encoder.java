package org.example;

import org.jetbrains.annotations.NotNull;

public class Encoder {
    public StringBuilder encryptText(@NotNull String text){
        String[] symbols = text.split("(?!^)");
        char ch;
        StringBuilder result = new StringBuilder();
        for (String s : symbols){
            ch = s.charAt(s.length() - 1);

            ch = (char) (ch + 3);
            if (ch == '#'){
                ch += 50;
            }
            assert false;
            result.append(ch);
        }

        return result;
    }

    public StringBuilder decryptText(@NotNull String text){
        String[] symbols = text.split("(?!^)");
        char ch;
        StringBuilder builder = new StringBuilder();
        for (String s : symbols){
            ch = s.charAt(s.length() - 1);
            if (ch == 'U') {
                ch -= 50;
            }
            ch = (char) (ch - 3);
            assert false;
            builder.append(ch);
        }
        return builder;
    }
}
