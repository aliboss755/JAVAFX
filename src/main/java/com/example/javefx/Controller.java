package com.example.javefx;

import com.example.javefx.Users.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;



public class Controller {

    @FXML
    private TextField universityIdTF;

    @FXML
    private TextField birthdayTF;

    @FXML
    private TextField genderTF;

    @FXML
    private TextField usernameTF;
    @FXML
    public ListView<Student> listView;

    @FXML
    private TextField passwordTF;

    @FXML
    private TextField nameTF;
    @FXML
    private Button adds;

    @FXML
    void getParameters(ActionEvent event) {
        if (usernameTF.getText ( ) != null && passwordTF.getText ( ) != null && nameTF.getText ( ) != null && universityIdTF.getText ( ) != null && Integer.parseInt ( universityIdTF.getText ( ) ) != 0 && birthdayTF.getText ( ) != null && !genderTF.equals ( "" )) {
            HelloController.students.add ( new Student ( birthdayTF.getText ( ) , passwordTF.getText ( ) , nameTF.getText ( ) ,
                    Integer.parseInt ( universityIdTF.getText ( ) ) , birthdayTF.getText ( ) , genderTF.getText (  ) ) );
            usernameTF.setText ( "" );
            passwordTF.setText ( "" );
            universityIdTF.setText ( "" );
            birthdayTF.setText ( "" );
            genderTF.setText ( "" );
            nameTF.setText ( "" );
            for (Student s :HelloController.students){
                System.out.println (  s.toString () );
            }

        }
    }
    public  void getStudent(){
        ObservableList<Student> observableList = FXCollections.observableArrayList(HelloController.students);

        // Create a ListView and set the ObservableList as its items
    listView = new ListView<>(observableList);
    }









}

