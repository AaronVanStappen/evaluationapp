package be.vdab.evaluationapp.repository;

import be.vdab.evaluationapp.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Repository
public class EvaluationRepositoryImpl implements EvaluationRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    EvaluationRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public int addAnswer(ArrayList<Answer> answerList) {

        int numberAnswersInserted = 0;
        int questionType;
        int answerType;
        String sql;

        System.out.println("VOOR FOR LOOP");

        for (Answer answer : answerList) {

            System.out.println("Answer: " + answer);

            questionType = (answer.getQuestionTypeId().ordinal() + 1);
            answerType = (answer.getAnswerTypeId().ordinal() + 1);


            sql = "INSERT INTO answer (answer, traineeid, questiontypeid, instructorid, courseid, answertypeid) VALUES (?,?,?,?,?,?)";


            numberAnswersInserted += jdbcTemplate.update(sql, answer.getAnswer(), answer.getTraineeId(), questionType,
                    answer.getInstructorId(), answer.getCourseId(), answerType);
        }

        return numberAnswersInserted;
    }

    @Override
    public int addAnswer(Answer answer) {
//        Integer questionType = (answer.getQuestionTypeId().ordinal() + 1);
//        Integer answerType = (answer.getAnswerTypeId().ordinal() + 1);
        String  sql = "INSERT INTO answer (answer, traineeid, questiontypeid, instructorid, courseid, answertypeid) VALUES (?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, answer.getAnswer(), answer.getTraineeId(), 2,
                answer.getInstructorId(), answer.getCourseId(), 1);
    }


//    @Override
//    @Transactional
//    public int addEvaluation(Answer answer){
//        int t = addTrainee(trainee);
//        int i = addInstructor(instructor);
//        int q = addQuestion(question);
//        int a = addAnswer((List<Answer>) answer);
//        int tot = 0;
//
//        if ((t != 0) && (i != 0) && (q != 0) && (a != 0)) {
//            tot = 1;
//        }
//
//        return tot;
//    }

//    private int addTrainee(Trainee trainee){
//
//        String sql = "INSERT INTO trainee(firstname, name, email, phone, company, jobrole) VALUES (?,?,?,?,?,?)";
//
//        return jdbcTemplate.update(sql, trainee.getFirstname(), trainee.getName(), trainee.getEmail(),
//                trainee.getPhonenumber(), trainee.getCompanyName(), trainee.getJobRole());
//    }
//
//    private int addInstructor(Instructor instructor){
//
//        String sql = "INSERT INTO instructor(firstname, name) VALUES (?,?)";
//
//        return jdbcTemplate.update(sql, instructor.getFirstname(), instructor.getName());
//    }
//
//    private int addQuestion(Question question){
//
//        System.out.println(question);
//
//        int questionType = (question.getQuestionTypeId().ordinal() + 1);
//        int answerType = (question.getAnswerTypeId().ordinal() + 1);
//
//        String sql = "INSERT INTO question(question, questionTypeId, answerTypeId) VALUES (?,?,?)";
//
//        return jdbcTemplate.update(sql, question.getQuestion(), questionType, answerType);
//    }
//
//    private int addAnswer(List<Answer> answerList){
//
//        int numberAnswersInserted = 0;
//        int questionType;
//        int answerType;
//        String sql;
//
//        for (Answer answer : answerList) {
//
//            System.out.println(answer);
//
//            questionType = (answer.getQuestionTypeId().ordinal() + 1);
//            answerType = (answer.getAnswerTypeId().ordinal() + 1);
//
//            sql = "INSERT INTO answer (answer, traineeid, questiontypeid, instructorcourseid, answertypeid) VALUES (?,?,?,?,?)";
//
//            numberAnswersInserted += jdbcTemplate.update(sql, answer.getAnswer(), answer.getTraineeId(), questionType,
//                answer.getCourseId(), answerType);
//        }
//
//        return numberAnswersInserted;
//    }
}
