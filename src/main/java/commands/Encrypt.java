package commands;

import constants.Constants;

import java.util.Arrays;

public class Encrypt implements Action {
    private int key;
    private String textAfterEncrypt;


    @Override
    public String doAction(String text) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        while (counter < text.length()) {
            for (int i = 0; i < Constants.ALPHABET.length; i++) {
                if (Constants.ALPHABET[i] == text.charAt(counter)) {
                    if (i + key > Constants.ALPHABET.length - 1) {
                        builder.append(Constants.ALPHABET[(i + key) % Constants.ALPHABET.length]);
                    } else {
                        builder.append(Constants.ALPHABET[i + key]);
                    }
                }
            }
            counter++;
        }
        textAfterEncrypt = builder.toString();

        return textAfterEncrypt;
    }

    public Encrypt(int key) {
        this.key = key;
    }
}