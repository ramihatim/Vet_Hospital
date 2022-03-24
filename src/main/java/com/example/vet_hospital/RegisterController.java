package com.example.vet_hospital;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class RegisterController {
@FXML
    private Button backButton;
@FXML
    private Button userRegister;

////////////////
@FXML
    private void backBtn1() throws IOException {
        Main l = new Main();
        l.changeScene("Login.fxml");
    }
@FXML
    private void userRegister() throws IOException {
        Main f = new Main();
        f.changeScene("Login.fxml");
    }
}
