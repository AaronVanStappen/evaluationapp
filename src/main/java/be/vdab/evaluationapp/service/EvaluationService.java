package be.vdab.evaluationapp.service;

import be.vdab.evaluationapp.model.Answer;
import be.vdab.evaluationapp.model.Instructor;
import be.vdab.evaluationapp.model.Question;
import be.vdab.evaluationapp.model.Trainee;

import java.util.ArrayList;
import java.util.List;

public interface EvaluationService {

    int addAnswer (ArrayList<Answer> answerList);

}
