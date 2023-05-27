package com.example.javefx;

import com.example.javefx.Users.Teacher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class MainController {

    @FXML
    private TextField filedTF;

    @FXML
    private TextField birthdayTF;

    @FXML
    private TextField genderTF;

    @FXML
    private TextField usernameTF;

    @FXML
    private TextField passwordTF;

    @FXML
    private TextField nameTF;

    @FXML
    private Button addTeacherB;

    @FXML
    private TextField salaryTF;

    @FXML
    void getParameters(ActionEvent event) {
        if (usernameTF.getText ( ) != null && passwordTF.getText ( ) != null && nameTF.getText ( ) != null && filedTF.getText ( ) != null
                && !genderTF.equals ( "" ) && Double.parseDouble ( salaryTF.getText ( ) ) != 0.0 && filedTF.getText ( ) != null) {
            HelloController.teachers.add ( new Teacher ( usernameTF.getText ( ) , passwordTF.getText ( ) , nameTF.getText ( )
                    , birthdayTF.getText ( ) , genderTF.getText ( ) , Double.parseDouble ( salaryTF.getText ( ) ) , filedTF.getText ( ) ) );
            usernameTF.setText ( "" );
            passwordTF.setText ( "" );
            birthdayTF.setText ( "" );
            salaryTF.setText ( "" );
            filedTF.setText ( "" );
            nameTF.setText ( "" );
            genderTF.setText ( "" );
        }
    }

}




