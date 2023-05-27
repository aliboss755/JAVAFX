package com.example.javefx.Questions;

import java.util.Arrays;

public class MultipleChoiceQuestion extends Question{
    private String[] choices;
    private int answer;

    public MultipleChoiceQuestion(int id ,String questionText , int mark , String image , String[] choices , int answer) {
        super ( id,questionText , mark , image );
        this.choices = choices;
        this.answer = answer;
    }
    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int getAnswerChoice() {
        return answer;
    }

    @Override
    public String toString() {
        return "MultipleChoiceQuestion{ " +"questionText='" + super.getQuestionText () + '\''  +
                ", mark=" + super.getMark () +
                ", image='" + super.getImage () + '\'' +
                ", answer=" + super.getAnswer () + "choices= "+ Arrays.stream( this.choices ).toList () +"\n"+
                "AnswerChoice"+this.getAnswerChoice ()+
                '}';
    }
}
