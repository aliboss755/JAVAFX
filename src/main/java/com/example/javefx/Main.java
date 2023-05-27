package com.example.javefx;

import com.example.javefx.Users.Student;
import com.example.javefx.Users.Teacher;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    @FXML
    private Button adds;

    @FXML
    private Button addt;

    @FXML
    private Button viewS;

    @FXML
    private Button viewT;
    @FXML
    public ListView<Student> listView;


    @FXML
    void Application(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "Scene2.fxml" ) );
        Scene scene =new Scene (  fxmlLoader.load ());
        Stage stage =new Stage (  );
        stage.setResizable ( true );
        stage.setTitle ( "Adding Student" );
        stage.setScene ( scene );
        stage.show ( );

    }
    @FXML
    void stop(ActionEvent event) throws IOException {
        Stage primaryStage =new Stage ();
        primaryStage.setTitle("List Of Students");
        ArrayList<Student> students = (ArrayList<Student>) HelloController.students;
        ObservableList<Student> observableList = FXCollections.observableArrayList (students);
        ListView<Student> listView = new ListView<>(observableList);
        VBox root = new VBox (listView);
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();
    }

    @FXML
    void init(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "Scene3.fxml" ) );
        Scene scene =new Scene (  fxmlLoader.load ());
        Stage stage =new Stage (  );
        stage.setScene ( scene );
        stage.show ( );
    }
    @FXML
    void viewT(ActionEvent event){
        Stage primaryStage =new Stage ();
        primaryStage.setTitle("List of Teachers");

        ArrayList<Teacher> teachers = (ArrayList<Teacher>) HelloController.teachers;

        ObservableList<Teacher> observableList = FXCollections.observableArrayList(teachers);

        ListView<Teacher> listView = new ListView<>(observableList);
        VBox root = new VBox (listView);

        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch ( args );
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "hello-view.fxml" ) );
        Scene scene =new Scene ( fxmlLoader.load () );
        primaryStage.setTitle ( "Adding Teacher" );
        primaryStage.setScene ( scene );
        primaryStage.show ();



    }
}
