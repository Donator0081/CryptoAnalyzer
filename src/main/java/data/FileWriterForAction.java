package data;

import java.io.*;

public class FileWriterForAction implements FileWorker {

    public static final FileWriterForAction getInstance = new FileWriterForAction();

    public void writeToFile(String fileName, String text) {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private FileWriterForAction() {
    }

    @Override
    public String readFromFile(String text) {
        return null;
    }
}
