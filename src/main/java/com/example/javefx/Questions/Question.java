package com.example.javefx.Questions;

public class Question {
    private String questionText;
    private int mark;
    private String image;
    private boolean answer;
    private int id;


    public Question( int id ,String questionText, int mark, String image, boolean answer) {
        this.questionText = questionText;
        this.mark = mark;
        this.id=id;
        this.image = image;
        this.answer = answer;
    }

    public Question(String questionText , int mark , boolean answer , int id) {
        this.questionText = questionText;
        this.mark = mark;
        this.answer = answer;
        this.id = id;
    }

    public Question(int id , String questionText, int mark, String image) {
        this.questionText = questionText;
        this.mark = mark;
        this.image = image;
        this.id=id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }



    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionText='" + questionText + '\'' +
                ", mark=" + mark +
                ", image='" + image + '\'' +
                ", answer=" + answer +
                '}';
    }

    public double size() {
        return 0;
    }
}

