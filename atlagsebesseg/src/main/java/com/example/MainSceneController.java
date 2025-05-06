/*
* File: MainSceneController.java
* Author: Szücs Gyöngyi
* Copyright: 2025, Szücs Gyöngyi
* Group: Szoft I-2-E
* Date: 2025-05-06
* Github: https://github.com/Gyongyos149/
* Licenc: MIT
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainSceneController {

    @FXML
    private Button button;

    @FXML
    private TextField distance;

    @FXML
    private Label distanceErr;

    @FXML
    private TextField time;

    @FXML
    private Label timeErr;

    @FXML
    private TextField velocity;

    @FXML
    void OnClickCalc(ActionEvent event) {
        startCalc();
    }
    void startCalc(){

        if (distance.getText().isEmpty()){
            System.err.println("distance is empty");
            distanceErr.setText("distance is empty");
            return;
        }else{
            distanceErr.setText("");
        }
        if (time.getText().isEmpty()){
            System.err.println("time is empty");
            timeErr.setText("time is empty");
            return; 
        }else{
            timeErr.setText("");
        }
        double d = Double.parseDouble(distance.getText());
        double t = Double.parseDouble(time.getText());
        double v = d/t;
        velocity.setText(String.valueOf(v));
    }

}
