package data;

import java.util.Scanner;

public class ScannerReceiver {
    private static Scanner scanner = new Scanner(System.in);
    private static int typeOfService;
    private static String fromFile;
    private static String toFile;
    private static int key;

    public static void setTypeOfService() {
        ScannerReceiver.typeOfService = scanner.nextInt();
    }

    public static void setFromFile() {
        ScannerReceiver.fromFile = scanner.nextLine();
    }

    public static void setToFile() {
        ScannerReceiver.toFile = scanner.nextLine();
    }

    public static void setKey() {
        ScannerReceiver.key = scanner.nextInt();
    }

    public static int getTypeOfService() {
        return typeOfService;
    }

    public static String getFromFile() {
        return fromFile;
    }

    public static String getToFile() {
        return toFile;
    }

    public static int getKey() {
        return key;
    }

}


