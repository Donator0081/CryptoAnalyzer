package commands;

import constants.Constants;

public class Decrypt implements Action {
    private int key;

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

        return builder.toString();
    }

    public Decrypt(int key) {
        this.key = key;
    }
}
