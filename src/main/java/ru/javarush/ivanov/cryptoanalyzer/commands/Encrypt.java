package ru.javarush.ivanov.cryptoanalyzer.commands;

import ru.javarush.ivanov.cryptoanalyzer.constants.Constants;

public class Encrypt implements Action {

    public static final Encrypt getInstance = new Encrypt();

    @Override
    public String doAction(String text, int key) {
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

        return builder.toString();
    }

    private Encrypt() {
    }
}
