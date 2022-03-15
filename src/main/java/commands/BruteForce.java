package commands;

import constants.Constants;

public class BruteForce implements Action {
    public static final BruteForce getInstance = new BruteForce();

    @Override
    public String doAction(String text, int key) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        key = 1;
        while (Constants.ALPHABET.length > key) {
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

            for (int i = 0; i < Constants.SEQUENCE_BRUTE.length; i++) {
                if (builder.toString().contains(Constants.SEQUENCE_BRUTE[i])) {
                    return builder.toString();
                }
            }
            builder.delete(0,builder.length());
            counter = 0;
            key++;
        }

        return "Не русский текст";
    }

    private BruteForce() {
    }
}
