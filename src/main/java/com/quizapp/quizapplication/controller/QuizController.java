package com.quizapp.quizapplication.controller;

import com.quizapp.quizapplication.model.QuestionWrapper;
import com.quizapp.quizapplication.model.Response;
import com.quizapp.quizapplication.service.QuizService;
import com.quizapp.quizapplication.service.QuizServiceBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController
{
    @Autowired
    QuizServiceBo quizServiceBo;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title)
    {
        return quizServiceBo.createQuiz(category,numQ,title);
    }
    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id)
    {
        return quizServiceBo.getQuizQuestions(id);
    }
    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> response)
    {
        return  quizServiceBo.calculateResult(id, response);
    }
}
