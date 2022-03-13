package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderForAction implements FileWorker{

    public static String readFromFile(String text){
        StringBuilder builder = null;
        try(BufferedReader fileReader = new BufferedReader(new FileReader(text))) {
            builder = new StringBuilder();
            while (fileReader.ready()){
                builder.append(fileReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert builder != null;
        return builder.toString();
    }
}
