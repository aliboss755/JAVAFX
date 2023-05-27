package com.example.javefx;

import com.example.javefx.Users.Admin;
import com.example.javefx.Users.Student;
import com.example.javefx.Users.Teacher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class HelloController {
    static List<Teacher> teachers;
    static  List <Student> students;
    public static boolean foundAdmin=true;
    public static boolean foundStudent=true;
    public static boolean foundTeacher=true;
    static  List<Admin> admins ;
    public static void setUsersData(){

        admins=new ArrayList<> (  );
        students=new ArrayList<> (  );
        teachers=new ArrayList<> (  );
        admins.add(new Admin ("admin", "admin","Al-Agha", "1/1/1997", "male",""));
        teachers.add(new  Teacher("JafarAgha", "112233", "Jafar Al-Agha", "1/1/1997", "male", 2000, "Eng"));
        teachers.add(new  Teacher("MohDalo", "112233", " Mohammed Al-Dalo", "1/1/1998", "male", 1000, "Eng"));
        teachers.add(new  Teacher("EtafHadda", "112233", "Abu Hadda", "1/1/1999", "female", 3000, "Eng"));
        teachers.add(new  Teacher("HashemSaqqa", "112233", "JHashem Al-Saqqa", "1/1/2000", "mail", 1500, "IT"));
        students.add(new Student("s1", "123456", "Ahmed Ali", 120180001,"1/1/2000", "Male"));
        students.add(new Student("s2", "123456", "Heba Ahmed", 120190001,"1/1/2001", "Female"));
        students.add(new Student("s3", "123456", "Dalia Mohammed", 120200001,"1/1/2002", "Female"));

    }
    @FXML
    private Label userNameL;
    private Stage stage;
    private Scene scene;
    private Parent parent;
    public void switchToScene1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "hello-view.fxml" ) );
         scene = new Scene ( fxmlLoader.load ( ));
        stage=(Stage)((Node)event.getSource ()).getScene ().getWindow ();
        scene=new Scene ( parent );
        stage.setScene ( scene );
        stage.show ();
    }
    public void switchToScene2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "hello-view.Scene1" ) );
         scene = new Scene ( fxmlLoader.load ( ));
        stage=(Stage)((Node)event.getSource ()).getScene ().getWindow ();
        scene=new Scene ( parent );
        stage.setScene ( scene );
        stage.show ();
    }

    @FXML
    private Label passwordL;

    @FXML
    private TextField userNameTF;

    @FXML
    private PasswordField passwordTF;

    @FXML
    private Button loginBt;

    @FXML

    void checkUser(MouseEvent event) throws IOException {
        setUsersData ();
        String userName =userNameTF.getText ();
        String password =passwordTF.getText ();
        Admin admin = foundAdmin(userName, password);
        Teacher teacher =foundTeacher(userName, password);
        Student student=foundStudent(userName, password);
        if (admin!=null){

            FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "Scene1.fxml" ) );
            Scene scene =new Scene (  fxmlLoader.load ());
            Stage stage =new Stage (  );
            stage.setScene ( scene );
            stage.show ( );


        } else if (teacher!=null) {
            FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "TeacherScene.fxml" ) );
            Scene scene =new Scene (  fxmlLoader.load ());
            Stage stage =new Stage (  );
            stage.setScene ( scene );
            stage.show ( );

        } else if (student!=null) {
            FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "StudentScene.fxml" ) );
            Scene scene =new Scene (  fxmlLoader.load ());
            Stage stage =new Stage (  );
            stage.setScene ( scene );
            stage.show ( );

        }
    }




    public static Admin foundAdmin(String userName ,String password){
        Admin admin ;
        for(Admin a : admins){

            if(a.getUserName().equals(userName) && (a.getPassword().equals(password)) ){

                if (userName.isEmpty ()||!userName.equals ( a.getUserName () )){

                }  if (password.isEmpty ()) {
                    Alert alert = new Alert( Alert.AlertType.INFORMATION);
                    alert.setTitle("Enter your Password");
                    alert.setHeaderText("Password ");
                    alert.setContentText("Password is Empty");
                    alert.showAndWait();
                }
                return admin=a;
            } else if (a.getUserName().equals(userName) && !(a.getPassword().equals(password))){
                Alert alert = new Alert( Alert.AlertType.INFORMATION);
                alert.setTitle("Enter your Password");
                alert.setHeaderText("Password ");
                alert.setContentText("Password is Success");
                alert.showAndWait();
            }
        }

        return null;
    }
    public static Student foundStudent(String userName ,String password){
        Student student;
        for(Student a : students){
            if(a.getUserName().equals(userName)&&a.getPassword().equals(password)){
                if (userName.isEmpty ()||!userName.equals ( a.getUserName () )){

                }  if (password.isEmpty ()) {
                }
                return student=a;
            }  else if (a.getUserName().equals(userName) && !(a.getPassword().equals(password))){
                Alert alert = new Alert( Alert.AlertType.INFORMATION);
                alert.setTitle("Enter your Password");
                alert.setHeaderText("Password ");
                alert.setContentText("Password is Success");
                alert.showAndWait();
            }
        }
        return null;
    }
    public static Teacher foundTeacher(String userName ,String password){
        Teacher teacher ;
        for(Teacher a : teachers){
            if(a.getUserName().equals(userName)&&a.getPassword().equals(password)){
                if (userName.isEmpty ()||!userName.equals ( a.getUserName () )){
                }  if (password.isEmpty ()) {
                }
                return teacher=a;
            } else if (a.getUserName().equals(userName) && !(a.getPassword().equals(password))){
                Alert alert = new Alert( Alert.AlertType.INFORMATION);
                alert.setTitle("Enter your Password");
                alert.setHeaderText("Password ");
                alert.setContentText("Password is Not Success");
                alert.showAndWait();

            }
        }

        return null;
    }



}
