package com.quizapp.quizapplication.service;

import com.quizapp.quizapplication.model.QuestionWrapper;
import com.quizapp.quizapplication.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizServiceBo
{
    public ResponseEntity<String> createQuiz(String category, int numQ, String title);
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id);
    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses);
}
