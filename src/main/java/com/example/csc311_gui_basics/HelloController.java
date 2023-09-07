package com.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label name;
    @FXML
    protected void onButton2Click(){
        System.out.println("Hi!");
    }
    @FXML
     ImageView image = new ImageView();



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}