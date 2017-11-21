package be.vdab.evaluationapp.repository;

import be.vdab.evaluationapp.model.Answer;
import be.vdab.evaluationapp.model.Instructor;
import be.vdab.evaluationapp.model.Question;
import be.vdab.evaluationapp.model.Trainee;

public interface EvaluationRepository {

    int addEvaluation (Trainee trainee, Instructor instructor, Question question, Answer answer);

}
