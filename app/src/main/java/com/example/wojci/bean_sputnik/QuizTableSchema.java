//package beanmm.beanquiz;
package com.example.wojci.bean_sputnik; //musiałem zmienić nazwę pakietu żeby to pasowało do mojej paczki //SYROP


import android.provider.BaseColumns;

public class QuizTableSchema {
    private QuizTableSchema(){}

    public static class QuestionTable implements BaseColumns{
        public static final String TABLE_NAME="quiz_questions";
        public static final String COLUMN_QUESTION="question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_ANSWER_NR = "answer_nr";
    }
}
