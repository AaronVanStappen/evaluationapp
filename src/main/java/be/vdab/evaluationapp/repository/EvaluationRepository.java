package be.vdab.evaluationapp.repository;

import be.vdab.evaluationapp.model.Answer;

import java.util.ArrayList;

public interface EvaluationRepository {

    int addAnswer(ArrayList<Answer> answerList);

    int addAnswer(Answer answer);
}
