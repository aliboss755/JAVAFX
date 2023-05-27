package com.example.javefx.Questions;

public class FillTheBlankQuestion extends Question {
    String answer;
    public FillTheBlankQuestion(int id , String questionText , int mark , String image ,String answer) {
        super (id, questionText , mark , image  );
        this.answer=answer;
    }



    @Override
    public String toString() {
        return "FillTheBlankQuestion{ " +"questionText='" + super.getQuestionText () + '\''  +
                ", mark=" + super.getMark () +
                ", image='" + super.getImage () + '\'' +
                ", answer=" + this.answer +
                '}';    }


    public String getAnswerQ() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

