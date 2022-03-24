package com.example.vet_hospital;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button RegisterPGButton;
    @FXML
    private Button loginButton;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;


    @FXML

    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();
    }
    @FXML
    private void RegisterPage() throws IOException {
            Main q = new Main();
        q.changeScene("Register.fxml");
    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if(username.getText().toString().equals("rami") && password.getText().toString().equals("1234")) {
            wrongLogin.setText("Success!");

            m.changeScene("PersonInfo.fxml");
        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data.");

        }


        else {
            wrongLogin.setText("Wrong username or password!");
        }
    }


}
