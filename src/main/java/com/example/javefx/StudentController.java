package com.example.javefx;

import com.example.javefx.Users.Student;
import com.example.javefx.exam.QuestionsType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    @FXML
    private VBox VBox2;

    @FXML
    private ListView<Exam> List;

    @FXML
    private TextField userNameTF;
    @FXML
    private TextField numberOFExameTF;

    @FXML
    private Button buttonstartBt;

    @FXML
    private PasswordField passwordTF;
    @FXML
    private TableView<Exam> TableView;
    @FXML
    private TableColumn<Exam, Integer> id;

    @FXML
    private TableColumn<Exam, String> name;

    @FXML
    private TableColumn<Exam,Integer> numberOfQuestions;

    @FXML
    private TableColumn<Exam,Integer> minPassAverage;

    @FXML
    private TableColumn<Exam, QuestionsType> type;

    public void viewExamsResultsBt(ActionEvent event) throws IOException {

    }
    public void SolveExam(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "SolveExam2.fxml" ) );
        List =new ListView<> (  );
        ObservableList<Exam> observableList = FXCollections.observableArrayList(Exam.exams );
        List.setItems ( observableList );
        Scene scene =new Scene (  fxmlLoader.load ());
        Stage stage =new Stage (   );
        stage.setScene ( scene );
        stage.show ( );
    }

    public void start(ActionEvent event) {
        Exam exam =new Exam (  );
        String userName =userNameTF.getText (  );
        String password =passwordTF.getText ();
        int examNum =Integer.parseInt ( numberOFExameTF.getText () );
        Student student=HelloController.foundStudent(userName, password);
        if (student!=null){
       exam.startExam (  examNum,userName,password);
        }
    }

    @Override
    public void initialize(URL url , ResourceBundle resourceBundle) {

//        id.setCellValueFactory ( new PropertyValueFactory<Exam,Integer> ( "id" ) );
//        name.setCellValueFactory ( new PropertyValueFactory<Exam,String> ( "name" ) );
//        minPassAverage.setCellValueFactory ( new PropertyValueFactory<Exam,Integer> ( "minPassAverage" ) );
//        numberOfQuestions.setCellValueFactory ( new PropertyValueFactory<Exam,Integer> ( "numberOfQuestions" ) );
//        type.setCellValueFactory ( new PropertyValueFactory<Exam, QuestionsType> ( "type" ) );
//        ObservableList<Exam> observableList = FXCollections.observableArrayList(Exam.exams );
//        TableView.setItems ( observableList );

    }
}
