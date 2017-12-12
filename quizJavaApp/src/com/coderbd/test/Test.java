/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.test;

import com.coderbd.domain.Question;
import com.coderbd.domain.QuizCategory;
import com.coderbd.domain.QuizLevel;
import com.coderbd.service.QuizCategoryService;
import com.coderbd.service.QuizLevelService;
import com.coderbd.service.QuizService;
import java.util.List;

/**
 *
 * @author Rajail Islam
 */
public class Test {

    static QuizService quizService = new QuizService();
    static QuizCategoryService quizCategoryService = new QuizCategoryService();
    static QuizLevelService quizLevelService = new QuizLevelService();

    public static void main(String[] args) {
        QuizCategoryService quizCategoryService = new QuizCategoryService();
        QuizCategory category = quizCategoryService.getCategory(1);
        int size = quizLevelService.getLevels(category).size();
        List<QuizLevel> levels = quizLevelService.getLevels(category);
        System.out.println("" + size);
        for (QuizLevel level : levels) {
            List<Question> qes = quizService.getQuestions(level.getId());

            for (Question q : qes) {
                System.out.println("Q ID: " + q.getQuestionID()
                        + " Question: " + q.getQuestion()
                        + " option A: " + q.getAnsOptionA()
                        + " option B: " + q.getAnsOptionB()
                        + " option C: " + q.getAnsOptionC()
                        + " option D: " + q.getAnsOptionD()
                        + " Correct Ans: " + q.getCorrectAns()
                        + " Level: " + q.getQuizLevel());
            }

        }
    }
    
    
    
}
