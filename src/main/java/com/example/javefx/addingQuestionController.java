package com.example.javefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class addingQuestionController {



    public void createYesNoQuestion(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "CreateYesNoQuestion.fxml" ) );
        Scene scene =new Scene (  fxmlLoader.load ());
        Stage stage =new Stage (  );
        stage.setTitle ( "Adding Student" );
        stage.setScene ( scene );
        stage.show ( );
    }

    public void createFillTheBlankQuestion(ActionEvent event) {
    }

    public void createMultipleChoiceQuestion(ActionEvent event) {
    }
}
