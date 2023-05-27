package com.example.javefx;


import com.example.javefx.Questions.*;
import com.example.javefx.Users.Student;
import com.example.javefx.exam.ExamResult;
import com.example.javefx.exam.QuestionsType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;


public class Exam {

    private int numberOfQuestions;

    private double minPassMark;
    @FXML
    private TextField ExamNameEt;

    @FXML
    private TextField ExamnumberEt;

    @FXML
    private PasswordField passwordTF;

    @FXML
    private TextField minPassEt;

    @FXML
    private VBox VBox2;

    @FXML
    private ListView<Exam> List;

    @FXML
    private TextField userNameTF;

    @FXML
    private Button startBt;


    @FXML
    private javafx.scene.layout.VBox VBox;

    @FXML
    private RadioButton allTypeQ;

    @FXML
    private RadioButton yasNoQ;

    @FXML
    private RadioButton filBlacklQ;

    @FXML
    private RadioButton multipleChoiceQ;
    private ToggleGroup toggleGroup;
    @FXML
    private Button addExamBt;
    public static HashMap<String, ExamResult> resultHashMap = new HashMap<> ( );
    int id;
    public final HashSet<Question> questions = new HashSet<> ( );
    ;
    private String name;
    QuestionsType allowedQuestionsType;
    private static int basecounter;
    public static ArrayList<Exam> exams = new ArrayList<> ( );
    public static ArrayList<ExamResult> examResults = new ArrayList<> ( );


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashSet<Question> getQuestions() {
        return questions;
    }


    public static void print(String s) {
        System.out.println ( s );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuestionsType getAllowedQuestionsType() {
        return allowedQuestionsType;
    }

    public void setAllowedQuestionsType(QuestionsType allowedQuestionsType) {
        this.allowedQuestionsType = allowedQuestionsType;
    }

    public void initialize() {
        toggleGroup = new ToggleGroup ( );

        allTypeQ.setToggleGroup ( toggleGroup );
        yasNoQ.setToggleGroup ( toggleGroup );
        filBlacklQ.setToggleGroup ( toggleGroup );
        multipleChoiceQ.setToggleGroup ( toggleGroup );
    }

    public Exam() {
    }

    public Exam(String name , int numberOfQuestions , double minPassAverage , QuestionsType type) {
        this.numberOfQuestions = numberOfQuestions;
        this.minPassMark = minPassAverage;
        this.allowedQuestionsType = type;
        this.name = name;
        id = ++basecounter;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public double getMinPassAverage() {
        return minPassMark;
    }

    public void setMinPassAverage(double minPassAverage) {
        this.minPassMark = minPassAverage;
    }


    @Override
    public String toString() {
        return "Exam{" +
                "numberOfQuestions=" + numberOfQuestions +
                ", minPassAverage=" + minPassMark +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", allowedQuestionsType=" + allowedQuestionsType +
                '}';
    }

    public static void setExamDat(int i) {
       exams.get ( i );
    }

    public HashSet addExam() {

        String name = ExamNameEt.getText ( );
        int numberOfQuestions = Integer.parseInt ( ExamnumberEt.getText ( ) );
        double minPassAverage = Double.parseDouble ( minPassEt.getText ( ) );
        System.out.println ( QuestionUtils.questions.size ( ) + QuestionUtils.yasNoQuestions.size ( ) + QuestionUtils.fillTheBlankQuestions.size ( ) );
        Toggle selectedToggle = toggleGroup.getSelectedToggle ( );

        if (selectedToggle != null) {
            RadioButton selectedRadioButton = (RadioButton) selectedToggle;
            String selectedText = selectedRadioButton.getText ( );

        } else {
            System.out.println ( "No item selected." );
        }
        QuestionsType type;

        RadioButton selectedRadioButton = (RadioButton) selectedToggle;
        String selectedText = selectedRadioButton.getText ( );
        String choice = selectedText;
        type = switch (choice) {
            case "All Type " -> QuestionsType.all;
            case "Yas no" -> QuestionsType.yasNo;
            case "Fill Blank" -> QuestionsType.FillTheBlank;
            default -> QuestionsType.multipleChoice;
        };
        exams.add ( new Exam ( name , numberOfQuestions , minPassAverage , type ) );
        QuestionUtils.setQuestionsData ( );
        int random;
        List<Question> randomQuestions;
        switch (type) {

            case all:
                System.out.println ( "Question Contents" + QuestionUtils.questions.size ( ) );
                for (int i = 0; i < numberOfQuestions + 1; i++) {
                    randomQuestions = QuestionUtils.questions;
                    random = (int) (Math.random ( ) * randomQuestions.size ( ));
                    questions.add ( randomQuestions.get ( random ) );
                }
                break;

            case yasNo:
                for (int i = 0; i < numberOfQuestions + 1; i++) {
                    random = (int) (Math.random ( ) * QuestionUtils.yasNoQuestions.size ( ));
                    questions.add ( QuestionUtils.yasNoQuestions.get ( random ) );
                }

                break;
            case FillTheBlank:
                for (int i = 0; i < numberOfQuestions; i++) {
                    random = (int) (Math.random ( ) * QuestionUtils.fillTheBlankQuestions.size ( ));
                    questions.add ( QuestionUtils.fillTheBlankQuestions.get ( random ) );
                }
            case multipleChoice:
                for (int i = 0; i < numberOfQuestions; i++) {
                    random = (int) (Math.random ( ) * QuestionUtils.multipleChoiceQuestions.size ( ));
                    questions.add ( QuestionUtils.multipleChoiceQuestions.get ( random ) );
                }

                break;
        }

        for (Question question : questions) {
            print ( question.toString ( ) );
        }
        return questions;
    }

    public static void viewAllExams() {
        for (Exam e : exams) {
            System.out.println ( e.toString ( ) );
        }
    }

    public void startExam(int examNumber ,String username,String password) {
        System.out.println ( "(startExam method) Number of questions: " + questions.size ( ) );
        System.out.println (examNumber );
        System.out.println (username );
        System.out.println (password );
        String name = username;
        String passwordUser =password;
        id=examNumber;
        System.out.println (id );
        viewAllExams ( );
        //selected exam
        Exam exam = exams.get ( id - 1 );
        retrieveQuestions ( exam , name );
    }
    private void retrieveQuestions(Exam exam , String name) {
        exam.getQuestions ();
        Scanner as = new Scanner ( System.in );
        int mark = 0;
        /* the highest mark of the exam
         * Ex: exam could consist of  30 mark and the   */
        int fullMark = 0;
        System.out.println ( "(retrieveQuestions method) Number of questions: " + questions.size ( ) );

        for (Question question : questions) {

            System.out.println ( "(retrieveQuestions method)" );
            fullMark += question.getMark ( );

            //print the question to the user
            System.out.println ( question.getQuestionText ( ) );

            //print the question object (for testing)
            System.out.println ( question.toString ( ) );

            if (checkIfRightAnswer ( question , as )) {
                mark += question.getMark ( );
            }

            //store the exam result
            resultHashMap.put ( name , new ExamResult ( name ,exam , mark , fullMark ) );
        }

        viewExamResult ( );
    }

    private boolean checkIfRightAnswer(Question question , Scanner as) {

        if (question instanceof YasNoQuestion) {

            String answer = as.nextLine ( );

            if ((question).getAnswer ( ) == Boolean.parseBoolean ( answer )) {
                return true;
            }

        } else if (question instanceof FillTheBlankQuestion) {

            String answer = as.nextLine ( );

            if (((FillTheBlankQuestion) question).getAnswerQ ( ).equals ( answer )) {
                return true;
            }

        } else if (question instanceof MatchingQuestion) {
            int answer = as.nextInt ( );

            if (((MatchingQuestion) question).getAnswerMatching ( ).equals ( answer )) {
                return true;
            }
        }
        return false;
    }


    public static void viewExamResult() {
        for (int i = 0; i < resultHashMap.size ( ); i++) {
            print ( resultHashMap.keySet ( ) + "\t" + resultHashMap.values ( ) + "\n" );
        }
    }



    public void addExamAc(ActionEvent event) {
        addExam ( );
    }

    public void start(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( HelloApplication.class.getResource ( "Scene2.SolveExam" ) );
        Scene scene =new Scene (  fxmlLoader.load ());
        Stage stage =new Stage (   );
        stage.setTitle ( "Adding Student" );
        stage.setScene ( scene );
        stage.show ( );
        List.setOnMouseClicked ( e -> {
            String selectedItem = String.valueOf ( List.getSelectionModel ( ).getSelectedItem ( ) );
            if (selectedItem != null) {
                ObservableList<Exam> observableList = FXCollections.observableArrayList ( exams );
                List = new ListView<> ( observableList );
                VBox root = new VBox ( List );
            }

            String userName =userNameTF.getText (  );
            String password =passwordTF.getText ();
            Student student=HelloController.foundStudent(userName, password);
            if (student!=null){
                startExam (1,userName,password);
            }else {

            }

        } );
    }
}
