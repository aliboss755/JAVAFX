package com.example.javefx.Questions;

public class YasNoQuestion extends Question {
    public YasNoQuestion(int id , String questionText , int mark , String image , boolean answer) {
        super ( id , questionText , mark , image , answer );
    }



    @Override
    public String toString() {
        return "YasNoQuestion{ " +"questionText='" + super.getQuestionText () + '\''  +
                ", mark=" + super.getMark () +
                ", image='" + super.getImage () + '\'' +
                ", answer=" + super.getAnswer () +
                '}';
    }
}

