package com.example.javefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "hello-view.fxml" ) );
        Group group = new Group ( );
        Text text = new Text ( "ali" );
        Scene scene = new Scene ( fxmlLoader.load ( ));
        stage.setScene ( scene );
        stage.setResizable ( true );
        stage.setTitle ( "Hello!" );
        stage.setScene ( scene );
        stage.show ( );
//        RadioButton button1 = new RadioButton("Java");
//        RadioButton button2 = new RadioButton("Python");
//        RadioButton button3 = new RadioButton("C++");
//        //Toggle button group
//        ToggleGroup group = new ToggleGroup();
//        button1.setToggleGroup(group);
//        button2.setToggleGroup(group);
//        button3.setToggleGroup(group);
//        //Adding the toggle button to the pane
//        VBox box = new VBox(5);
//        box.setFillWidth(false);
//        box.setPadding(new Insets (5, 5, 5, 50));
//        box.getChildren().addAll(button1, button2, button3);
//        //Setting the stage
//        Scene scene = new Scene(box, 595, 150, Color.BEIGE);
//        stage.setTitle("Toggled Button Example");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) {
        launch ( );
    }


}