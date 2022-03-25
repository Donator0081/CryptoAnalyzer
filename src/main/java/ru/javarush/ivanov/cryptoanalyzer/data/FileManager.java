package ru.javarush.ivanov.cryptoanalyzer.data;

public abstract class FileManager implements FileWorker {
    @Override
    public String readFromFile(String text) {
        return null;
    }

    @Override
    public void writeToFile(String fileName, String text) {

    }
}
