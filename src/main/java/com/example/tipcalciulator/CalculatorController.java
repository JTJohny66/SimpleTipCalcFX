package com.example.tipcalciulator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


public class CalculatorController {

    @FXML
    private TextField amount;
    @FXML
    private TextField tip;
    @FXML
    private TextField total;
    @FXML
    private Slider slider;
    @FXML
    private Label sliderLabel;
    @FXML
    private Label invalidLabel;

    @FXML
    private void onSlider(MouseEvent e){
        try{
            sliderLabel.setText(""+slider.getValue());
            double numAmt = Double.parseDouble(amount.getText());
            tip.setText(String.format("%.2f",(numAmt * slider.getValue()) / 100));
            total.setText(String.format("%.2f",(numAmt + Double.parseDouble(tip.getText()))));
            invalidLabel.setVisible(false);
        }
        catch(NumberFormatException event){
            invalidLabel.setVisible(true);
        }
    }

    @FXML
    private void onAmount(KeyEvent e){
        try{
            double numAmt = Double.parseDouble(amount.getText());
            tip.setText(String.format("%.2f",(numAmt * slider.getValue()) / 100));
            total.setText(String.format("%.2f",(numAmt + Double.parseDouble(tip.getText()))));
            invalidLabel.setVisible(false);
        }
        catch(NumberFormatException event){
            invalidLabel.setVisible(true);
        }
    }

}
