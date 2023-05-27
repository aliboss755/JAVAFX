package com.example.javefx.Questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public  class QuestionUtils {


    public static  ArrayList<Question> questions =new ArrayList<> (  );;
    public static  ArrayList<YasNoQuestion> yasNoQuestions =new ArrayList (  );
    public static  ArrayList<OrderQuestion> orderQuestions =new ArrayList (  );
    public static  ArrayList<FillTheBlankQuestion> fillTheBlankQuestions =new ArrayList (  );
    public static  ArrayList<MultipleChoiceQuestion> multipleChoiceQuestions =new ArrayList (  );
    public static  ArrayList<MatchingQuestion> matchingQuestions =new ArrayList<> (  );
    public static  ArrayList<Question> yNFill  =new ArrayList (  );

    public QuestionUtils() {
    }

    public    ArrayList<Question>getQuestion (){
        return questions;
    }

    public   void setQuestion (ArrayList<Question> questions){
    }


    public static void setQuestionsData (){
        yasNoQuestions.add (new YasNoQuestion ( 1,"Does Java can build GUI?",2,"null",true ));
        yasNoQuestions.add (new YasNoQuestion ( 2,"Java doesn't support OOP?",2,"null",false ));
        yasNoQuestions.add(new YasNoQuestion(1, "Is Java a programming language?", 2,"null",true));
        yasNoQuestions.add(new YasNoQuestion(2, "Are dogs mammals?", 2,"null",true));
        yasNoQuestions.add(new YasNoQuestion(3, "Is the Earth flat?", 2,"null",false));
        yasNoQuestions.add(new YasNoQuestion(4, "Do birds have feathers?", 2,"null",true));
        yasNoQuestions.add(new YasNoQuestion(5, "Is the sky green?", 2,"null",false));
        yasNoQuestions.add(new YasNoQuestion(6, "Is water wet?", 2,"null",true));
        yasNoQuestions.add(new YasNoQuestion(7, "Is the sun a planet?", 2,"null",false));
        yasNoQuestions.add(new YasNoQuestion(8, "Can fish fly?", 2,"null",false));
        yasNoQuestions.add(new YasNoQuestion(9, "Is pizza delicious?", 2,"null",true));
        yasNoQuestions.add(new YasNoQuestion(10, "Are trees stationary?", 2,"null",true));
        String[] terms = {"Class", "attribute"};
        String[] definitions = {"define a properties in real world", "define an entity in real world"};
        String[] answerMatching = {"1", "0"};
        matchingQuestions.add (  new MatchingQuestion(1, "Matching the following terms", 2, null, terms, definitions, answerMatching) );
        String[] steps = {"package", "public", "private", "protected"};
        int[] orders = {4, 2, 1, 3};
        orderQuestions.add ( new OrderQuestion(1, "Order the following access modifiers from most restrictive to low", 2, "2.jpg", steps, orders) );
        fillTheBlankQuestions.add ( new FillTheBlankQuestion(1, "What is the keyword that is used to call the super class constructor?", 2, null, "super") );
        fillTheBlankQuestions.add ( new FillTheBlankQuestion(2, "What is the keyword that is used to inherit from a class?", 2, null, "extends") );
        String[] choices1 = {"String", "int", "double", "char"};
        String[] choices2 = {"String", "Object", "number", "Exception"};
        multipleChoiceQuestions.add ( new MultipleChoiceQuestion(1, "Which Type is not primitive?", 2, null, choices1, 0) );
        multipleChoiceQuestions.add ( new MultipleChoiceQuestion(2, "Which class is super class for all classes?", 2, null, choices2, 1) );

//        questions.addAll ( matchingQuestions );
        questions.addAll ( fillTheBlankQuestions );
        questions.addAll ( multipleChoiceQuestions );
//        questions.addAll ( orderQuestions );
        questions.addAll ( yasNoQuestions );
        yNFill.addAll ( yasNoQuestions );
        yNFill.addAll ( fillTheBlankQuestions );
    }

    public static void printQuestionData(){
        setQuestionsData ();
      for (Question question : questions){
          print ( question.toString () );
      }




    }

    public static void addQuestionFromInput() {
        Scanner scanner = new Scanner ( System.in );
        print ( "Enter the type of question to add (1. Yes-No, 2. Multiple Choice, 3. Fill the Blank, 4. Order, 5. Matching): " );
        int type = scanner.nextInt ( );
        scanner.nextLine ( );
        print ( "Enter Id The Question :" );
        int id = scanner.nextInt ( );

        print ( "Enter the question text: " );
        String questionText= scanner.nextLine ( );
        questionText= scanner.nextLine ( );
        print( "Enter the marks weight: " );
        int marks = scanner.nextInt ( );

        scanner.nextLine ( );

        print ( "Enter the descriptive image filename (or press enter if none): " );
        String imageFilename = scanner.nextLine ( );
        if (imageFilename.trim ( ).isEmpty ( )) {
            imageFilename = null;
        }

        switch (type) {
            case 1 -> { // Yes-No question
                print ( "Enter the answer (true/false): " );
                boolean answer = scanner.nextBoolean ( );
                questions.add ( new YasNoQuestion ( id , questionText , marks , imageFilename , answer ) );
                print ( "Adding Question Successfully " );
            }
            case 2 -> { // Multiple Choice question
                System.out.println ( "Enter the choices (separated by commas): " );
                String choicesString = scanner.nextLine ( );
                String[] choices = choicesString.split ( "," );
                System.out.println ( "Enter the answer choice number: " );
                int answerIndex = scanner.nextInt ( );
                scanner.nextLine ( );
                questions.add ( new MultipleChoiceQuestion ( id , questionText , marks , imageFilename , choices , answerIndex ) );
                print ( "Adding Question Successfully " );
            }

            case 3 -> { // Fill the Blank question
                print ( "Enter the answer: " );
                String answerText = scanner.nextLine ( );
                questions.add ( new FillTheBlankQuestion ( id , questionText , marks , imageFilename , answerText ) );
                print ( "Adding Question Successfully " );
            }

            case 4 -> { // Order question
                print ( "Enter the steps (separated by commas): " );
                String stepsString = scanner.nextLine ( );
                String[] steps = stepsString.split ( "," );
                System.out.println ( "Enter the correct order (separated by commas): " );
                String ordersString = scanner.nextLine ( );
                String[] orders = ordersString.split ( "," );
                int[] ordersIntArray = Arrays.stream ( orders ).mapToInt ( Integer::parseInt ).toArray ( );
                questions.add ( new OrderQuestion ( id , questionText , marks , imageFilename , steps , ordersIntArray ) );
                print ( "Adding Question Successfully " );
            }

            case 5 -> { // Matching question
                System.out.println ( "Enter the terms for the Matching question (separated by commas): " );
                String[] terms = scanner.nextLine ( ).split ( "," );
                System.out.println ( "Enter the definitions for the Matching question (separated by commas): " );
                String[] definitions = scanner.nextLine ( ).split ( "," );
                System.out.println ( "Enter the correct matching for the Matching question (separated by commas): " );
                String[] answerMatching = scanner.nextLine ( ).split ( "," );
                MatchingQuestion question = new MatchingQuestion ( id , questionText , marks , imageFilename , terms , definitions , answerMatching );
                questions.add ( question );
                print ( "Adding  Question Successfully " );
            }
            default -> print ( "Invalid question type" );
        }
    }


    public static void print(String a) {
        System.out.println (a );
    }


//    public MatchingQuestion(int id,String questionText , int mark , String image , String[] terms , String[] definitions , int[] matching) {

//    public void editQuestions(Scanner scanner) {
//        System.out.println("Enter the ID of the question you want to edit:");
//        int id = scanner.nextInt();
//
//        // find the question with the given ID

//        Question question = findQuestionById(id);
//
//        if (question == null) {
//            System.out.println("Question not found!");
//            return;
//        }
//
//        // edit the properties common to all question types
//        System.out.println("Enter the new text of the question:");
//        scanner.nextLine(); // consume the remaining newline
//        String questionText = scanner.nextLine();
//        question.setQuestionText(questionText);
//
//        System.out.println("Enter the new marks weight:");
//        int marks = scanner.nextInt();
//        question.setMarks(marks);
//
//        System.out.println("Do you want to change the descriptive image? (y/n)");
//        String choice = scanner.next();
//        if (choice.equalsIgnoreCase("y")) {
//            System.out.println("Enter the new image URL:");
//            String imageUrl = scanner.next();
//            question.setImageUrl(imageUrl);
//        }
//
//        // edit the properties specific to each question type
//        if (question instanceof YesNoQuestion) {
//            // cast to the appropriate type
//            YesNoQuestion yesNoQuestion = (YesNoQuestion) question;
//
//            System.out.println("Enter the new answer (true/false):");
//            boolean answer = scanner.nextBoolean();
//            yesNoQuestion.setAnswer(answer);
//        } else if (question instanceof MultipleChoiceQuestion) {
//            MultipleChoiceQuestion mcq = (MultipleChoiceQuestion) question;
//
//            // edit the choices
//            System.out.println("Enter the new choices (one per line; enter an empty line to stop):");
//            List<String> choices = new ArrayList<>();
//            String choiceText;
//            while (!(choiceText = scanner.nextLine().trim()).isEmpty()) {
//                choices.add(choiceText);
//            }
//            mcq.setChoices(choices);
//
//            // edit the answer
//            System.out.println("Enter the new answer (choice number starting from 1):");
//            int answer = scanner.nextInt() - 1; // convert to 0-based index
//            mcq.setAnswer(answer);
//        } else if (question instanceof FillTheBlankQuestion) {
//            FillTheBlankQuestion fillQuestion = (FillTheBlankQuestion) question;
//
//            System.out.println("Enter the new answer:");
//            String answer = scanner.next();
//            fillQuestion.setAnswer(answer);
//        } else if (question instanceof OrderQuestion) {
//            OrderQuestion orderQuestion = (OrderQuestion) question;
//
//            // edit the steps
//            System.out.println("Enter the new steps (one per line; enter an empty line to stop):");
//            List<String> steps = new ArrayList<>();
//            String stepText;
//            while (!(stepText = scanner.nextLine().trim()).isEmpty()) {
//                steps.add(stepText);
//            }
//            orderQuestion.setSteps(steps);
//
//            // edit the orders
//            System.out.println("Enter the new orders (one per line; enter an empty line to stop):");
//            List<Integer> orders = new ArrayList<>();
//            int order;
//            while ((order = scanner.nextInt()) != -1) {
//                orders.add(order);
//            }
//            orderQuestion.setOrders(orders);
//        } else if (question instanceof MatchingQuestion) {
//            MatchingQuestion matchingQuestion = (MatchingQuestion) question;
//
//            // edit the terms and definitions
//            System.out.println("Enter the new terms and definitions (one pair per line; enter an empty line to stop):");
//            List<String> terms = new ArrayList<>();
//            List<String> definitions = new ArrayList<>();
//            String term, definition;
//            while (!(term = scanner.nextLine().trim()).isEmpty() &&
//
//}
//    }



    }
