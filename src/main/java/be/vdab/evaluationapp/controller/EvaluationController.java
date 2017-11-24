package be.vdab.evaluationapp.controller;

import be.vdab.evaluationapp.model.Answer;
import be.vdab.evaluationapp.model.Instructor;
import be.vdab.evaluationapp.model.Question;
import be.vdab.evaluationapp.model.Trainee;
import be.vdab.evaluationapp.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/evaluations")
public class EvaluationController {

    private final EvaluationService service;

    @Autowired
    public EvaluationController(EvaluationService service) {
        this.service= service;
    }

    @PostMapping
    public ResponseEntity addEvaluation(@RequestBody ArrayList<Answer> answerList) {
        return ResponseEntity.ok(service.addAnswer(answerList));
    }

//    for test purposes only !!!
    @GetMapping
    public ResponseEntity getEvaluation(){
        return ResponseEntity.ok("Hello World !!!");
    }
}
