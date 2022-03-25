module ru.javarush.ivanov.cryptoanalyzer {
    requires javafx.controls;
    requires javafx.fxml;

    exports ru.javarush.ivanov.cryptoanalyzer.controllers;
    opens ru.javarush.ivanov.cryptoanalyzer.controllers to javafx.fxml;
    exports ru.javarush.ivanov.cryptoanalyzer;
    opens ru.javarush.ivanov.cryptoanalyzer to javafx.fxml;

}