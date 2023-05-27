package com.example.javefx;

import com.example.javefx.Questions.QuestionUtils;
import com.example.javefx.Questions.YasNoQuestion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class addYasuoQuestion {

    @FXML
    private TextField QuestionId;

    @FXML
    private TextField QuestionName;

    @FXML
    private TextField QuestionMark;

    @FXML
    private TextField QuestionImageTF;

    @FXML
    private TextField QuestionAnswerTF;

    @FXML
    private Button addQuestionBT;

    @FXML
    void addQuestionAc(ActionEvent event) {
        try {
            QuestionUtils.yasNoQuestions.add ( new YasNoQuestion ( Integer.parseInt ( QuestionId.getText () ),QuestionName.getText (),Integer.parseInt ( QuestionMark.getText () ),QuestionImageTF.getText (),Boolean.parseBoolean ( QuestionAnswerTF.getText () ) ) );
            QuestionId.setText ( "" );
            QuestionName.setText ( "" );
            QuestionAnswerTF.setText ( "" );
            QuestionMark.setText ( "" );
            QuestionImageTF.setText ( "" );
        }catch (Exception e){
            Alert alert = new Alert( Alert.AlertType.INFORMATION);
            alert.setTitle("Enter Question data ");
            alert.setHeaderText("Don't data is Empty  ");
            alert.setContentText("Don't data is Empty " +
                    "");
            alert.showAndWait();
        }

    }

}
