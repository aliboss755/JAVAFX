package com.example.javefx.Questions;

import java.util.ArrayList;

public class MatchingQuestion extends Question{
    private ArrayList<String> terms;
    private ArrayList<String> definitions;
    private ArrayList<Integer> answerMatching;

    public MatchingQuestion(int id,String questionText , int mark , String image , String[] terms , String[] definitions , String[] matching) {
        super ( id,questionText , mark , image );
        this.terms = new ArrayList<>();
        this.definitions = new ArrayList<>();
        this.answerMatching = new ArrayList<>();

    }

    public ArrayList<String> getTerms() {
        return terms;
    }

    public void setTerms(ArrayList<String> terms) {
        this.terms = terms;
    }

    public ArrayList<String> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(ArrayList<String> definitions) {
        this.definitions = definitions;
    }

    public ArrayList<Integer> getAnswerMatching() {
        return answerMatching;
    }
    public void setAnswerMatching(ArrayList<Integer> answerMatching) {
        this.answerMatching = answerMatching;
    }


    @Override
    public String toString() {
        return "MatchingQuestion{ " +"questionText='" + super.getQuestionText () + '\''  +
                ", mark=" + super.getMark () +
                ", image='" + super.getImage () + '\'' +
                ", answer=" + super.getAnswer () + "terms"+ this.terms+"\n"
                +"definitions"+this.definitions.stream( ).toList ()+"\n"+
                "AnswerMatching"+this.answerMatching.stream( ).toList ()+
                '}';
    }
}
