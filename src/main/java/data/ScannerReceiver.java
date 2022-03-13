package data;

import java.util.Scanner;

public class ScannerReceiver implements Data {
    private final static Scanner scanner = new Scanner(System.in);
    private int typeOfService;
    private String fromFile;
    private String toFile;
    private int key;

    public int getTypeOfService() {
        return typeOfService;
    }

    public String getFromFile() {
        return fromFile;
    }

    public String getToFile() {
        return toFile;
    }

    public int getKey() {
        return key;
    }

    public ScannerReceiver() {
    }

}


