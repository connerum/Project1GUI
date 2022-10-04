package edu.bsu.cs222.project1gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label article_lb;
    @FXML
    private Label results_lb;
    @FXML
    private Label Title_lb;

    @FXML
    private TextField title_tb;

    @FXML
    private TextArea results_tb;

    @FXML
    private Button title_button;

    @FXML
    protected void onButtonClick() {
        Title_lb.setText(title_tb.getText());
        String userInput = title_tb.getText();
        results_tb.setText(userInput);
    }
}

