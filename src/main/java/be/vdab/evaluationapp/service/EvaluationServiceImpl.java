package be.vdab.evaluationapp.service;

import be.vdab.evaluationapp.model.Answer;
import be.vdab.evaluationapp.model.Instructor;
import be.vdab.evaluationapp.model.Question;
import be.vdab.evaluationapp.model.Trainee;
import be.vdab.evaluationapp.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class EvaluationServiceImpl implements EvaluationService {

    private final MessageSource ms;
    private final EvaluationRepository repository;


    @Autowired
    public EvaluationServiceImpl(EvaluationRepository repository, MessageSource ms) {
        this.repository = repository;
        this.ms = ms;
    }

    @Override
    public int addEvaluation(Trainee trainee, Instructor instructor, Question question, Answer answer) {
        return repository.addEvaluation(trainee, instructor, question, answer);
    }
}
