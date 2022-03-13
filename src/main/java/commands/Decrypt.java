package commands;

import constants.Constants;

import java.util.Arrays;

public class Decrypt implements Action {
    private int key;
    private String textAfterDecrypt;

    @Override
    public String doAction(String text) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        while (counter < text.length()) {
            for (int i = 0; i < Constants.ALPHABET.length; i++) {
                if (Constants.ALPHABET[i] == text.charAt(counter)) {
                    if (i - key < 0) {
                        builder.append(Constants.ALPHABET[Constants.ALPHABET.length - (key - i)]);
                    } else {
                        builder.append(Constants.ALPHABET[i - key]);
                    }
                }
            }
            counter++;
        }
        textAfterDecrypt = builder.toString();

        return textAfterDecrypt;
    }

    public Decrypt(int key) {
        this.key = key;
    }
}