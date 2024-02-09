package com.quizapp.quizapplication.controller;

import com.quizapp.quizapplication.model.Question;
import com.quizapp.quizapplication.service.QuestionService;
import com.quizapp.quizapplication.service.QuestionServiceBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController
{
    @Autowired
    QuestionServiceBo questionServiceBo;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestion()
    {
    return questionServiceBo.getAllQuestions();
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return  questionServiceBo.addQuestion(question);
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category)
    {
        return questionServiceBo.getQuestionsByCategory(category);
    }
}
