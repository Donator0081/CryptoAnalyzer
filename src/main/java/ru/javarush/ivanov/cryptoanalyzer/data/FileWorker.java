package ru.javarush.ivanov.cryptoanalyzer.data;

public interface FileWorker {
    String readFromFile(String text);
    void writeToFile(String fileName, String text);
}
