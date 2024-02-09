package com.quizapp.quizapplication.service;

import com.quizapp.quizapplication.model.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionServiceBo
{
    public ResponseEntity<List<Question>> getAllQuestions();
    public ResponseEntity<String> addQuestion(Question question);
    public ResponseEntity<List<Question>> getQuestionsByCategory(String category);

}
