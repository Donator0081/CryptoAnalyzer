package ru.javarush.ivanov.cryptoanalyzer.data;

import java.io.*;

public class FileWriterForAction extends FileManager {

    public static final FileWriterForAction getInstance = new FileWriterForAction();

    public void writeToFile(String fileName, String text) {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readFromFile(String text) {
        return null;
    }
}
