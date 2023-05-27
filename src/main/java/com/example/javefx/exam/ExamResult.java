package com.example.javefx.exam;

import com.example.javefx.Exam;

public class ExamResult {
        Exam exam;
        String userName;
        int result;
     int countExam;

    public ExamResult(String name , Exam exam  , int result, int countExam) {
        this.exam = exam;
        this.result = result;
        this.countExam=countExam;
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "exam=" + exam +
                ", userName='" + userName + '\'' +
                ", result=" + result +
                ", countExam=" + countExam +
                '}';
    }
}
