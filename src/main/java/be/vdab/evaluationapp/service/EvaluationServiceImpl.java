package be.vdab.evaluationapp.service;

import be.vdab.evaluationapp.model.Answer;
import be.vdab.evaluationapp.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public int addAnswer(List<Answer> answerList) {
       return repository.addAnswer(answerList);
    }
}
