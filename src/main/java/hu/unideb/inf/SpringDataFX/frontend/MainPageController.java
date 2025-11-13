package hu.unideb.inf.SpringDataFX.frontend;

import javafx.event.ActionEvent;

public class MainPageController {
    BackendManager backendManager;

    public void handleStartButton(ActionEvent actionEvent) {
        backendManager.start();
    }

    public void handleStopButton(ActionEvent actionEvent) {
        backendManager.stop();
    }

    public void handlePrintButton(ActionEvent actionEvent) {
        backendManager.print();
    }
}
