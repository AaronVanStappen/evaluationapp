package be.vdab.evaluationapp.controller;

import be.vdab.evaluationapp.model.Answer;
import be.vdab.evaluationapp.model.Instructor;
import be.vdab.evaluationapp.model.Question;
import be.vdab.evaluationapp.model.Trainee;
import be.vdab.evaluationapp.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evaluations")
public class EvaluationController {

    private final EvaluationService service;

    @Autowired
    public EvaluationController(EvaluationService service) {
        this.service= service;
    }

    @PostMapping
    public ResponseEntity addEvaluation(@RequestBody Trainee trainee, @RequestBody Instructor instructor, @RequestBody Question question, @RequestBody Answer answer) {
        return ResponseEntity.ok(service.addEvaluation(trainee, instructor, question, answer));
    }

//    for test purposes only !!!
    @GetMapping
    public ResponseEntity getEvaluation(){
        return ResponseEntity.ok("Hello World !!!");
    }
}
