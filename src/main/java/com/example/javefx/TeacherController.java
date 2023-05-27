package com.example.javefx;
import com.example.javefx.Questions.Question;
import com.example.javefx.Questions.QuestionUtils;
import com.example.javefx.Users.Student;
import com.example.javefx.exam.ExamResult;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
public class TeacherController {
    @FXML
    private Button addingStudentBt;

    @FXML
    private Button viewAllStudentB;

    @FXML
    private Button addQuestionBt;

    @FXML
    private Button viewAllQuestionBt;

    @FXML
    private Button addExamBt;

    @FXML
    private Button viewAllExamsBt;

    @FXML
    private Button viewExamsResultsBt;

    public void addQuestionBt(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "addingQustion.fxml" ) );
        Scene scene =new Scene (  fxmlLoader.load ());
        Stage stage =new Stage (  );
        stage.setResizable ( true );
        stage.setTitle ( "Adding Student" );
        stage.setScene ( scene );
        stage.show ( );
    }

    public void viewAllQuestionBt(ActionEvent event) {
        QuestionUtils.setQuestionsData ();
        Stage primaryStage =new Stage ();
        primaryStage.setTitle("List Of Questions");

        ArrayList<Question> questions =  QuestionUtils.questions;

        ObservableList<Question> observableList = FXCollections.observableArrayList(questions);

        ListView<Question> listView = new ListView<>(observableList);

        VBox root = new VBox (listView);

        primaryStage.setScene(new Scene (root, 800, 400));
        primaryStage.show();
    }

    public void addExamBt(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "addExam.fxml" ) );
        Scene scene =new Scene (  fxmlLoader.load ());
        Stage stage =new Stage (  );
        stage.setResizable ( true );
        stage.setTitle ( "Adding Student" );
        stage.setScene ( scene );
        stage.show ( );
    }

    public void viewAllExamsBt(ActionEvent event) {
        Stage primaryStage =new Stage ();
        primaryStage.setTitle("List Of Students");
        ArrayList<Exam> exams = (ArrayList<Exam>) Exam.exams;
        ObservableList<Exam> observableList = FXCollections.observableArrayList(exams);
        ListView<Exam> listView = new ListView<>(observableList);
        VBox root = new VBox (listView);
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();

    }

    public void viewExamsResultsBt(ActionEvent event) {
        Stage primaryStage =new Stage ();
        primaryStage.setTitle("List Of Students");
        ArrayList<ExamResult> exams =  Exam.examResults;
        ObservableList<ExamResult> observableList = FXCollections.observableArrayList(exams);
        ListView<ExamResult> listView = new ListView<>(observableList);
        VBox root = new VBox (listView);
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();
    }

    public void viewAllStudentB(ActionEvent event) {
        Stage primaryStage =new Stage ();
        primaryStage.setTitle("List Of Students");
        ArrayList<Student> students = (ArrayList<Student>) HelloController.students;
        ObservableList<Student> observableList = FXCollections.observableArrayList(students);
        ListView<Student> listView = new ListView<>(observableList);
        primaryStage.setResizable ( true );
        VBox root = new VBox (listView);

        primaryStage.setScene(new Scene (root, 800, 400));
        primaryStage.show();
    }
    public void addingStudentBt(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "Scene2.fxml" ) );
        Scene scene =new Scene (  fxmlLoader.load ());
        Stage stage =new Stage (   );
        stage.setTitle ( "Adding Student" );
        stage.setScene ( scene );
        stage.show ( );
    }
}
