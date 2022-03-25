package ru.javarush.ivanov.cryptoanalyzer.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderForAction extends FileManager{

    public static final FileReaderForAction getInstance = new FileReaderForAction();

    public String readFromFile(String text){
        StringBuilder builder = null;
        try(BufferedReader fileReader = new BufferedReader(new FileReader(text))) {
            builder = new StringBuilder();
            while (fileReader.ready()){
                builder.append((char) fileReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert builder != null;
        return builder.toString();
    }


    private FileReaderForAction() {
    }
}
