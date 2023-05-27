package com.example.javefx.Questions;

import java.util.Arrays;

public class OrderQuestion extends Question {
    private String[] steps;
    private int[] orders;

    public OrderQuestion(int id , String questionText , int mark , String image , String[] steps , int[] orders) {
        super ( id , questionText , mark , image );
        this.steps = steps;
        this.orders = orders;
    }

    public String[] getSteps() {
        return steps;
    }


    public int[] getOrders() {
        return orders;
    }


    @Override
    public String toString() {
        return "OrderQuestion{ " + "questionText='" + super.getQuestionText ( ) + '\'' +
               ", mark=" + super.getMark ( ) +
               ", image='" + super.getImage ( ) + '\'' +
               ", answer=" + super.getAnswer ( ) + "steps" + Arrays.stream( this.steps ).toArray () + "\n"
               + "orders" + Arrays.stream( this.orders ).toArray () +
               '}';
    }
}



