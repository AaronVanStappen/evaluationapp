package be.vdab.evaluationapp.service;

import be.vdab.evaluationapp.EvaluationappApplication;
import be.vdab.evaluationapp.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = EvaluationappApplication.class)
public class EvaluationServiceTest {

    @Autowired
    private EvaluationService service;

    @Test
    public void testAddAnswer(){
        List<Answer> testAnswers = new ArrayList<>();
        Answer answer1 = new Answer();
        answer1.setQuestionTypeId(QuestionType.GENERAL);
        answer1.setAnswerTypeId(AnswerType.OPEN);
        answer1.setInstructorId(1L);
        answer1.setTraineeId(2L);
        answer1.setCourseId(1L);
        answer1.setAnswer("Antwoord op de vraag");
        testAnswers.add(answer1);
    }

//    @Test
//    public void testAddEvaluation(){
//        Trainee trainee = new Trainee();
//        trainee.setFirstname("John");
//        trainee.setName("Doe");
//        trainee.setEmail("John@Doe.com");
//        trainee.setPhonenumber("+3211234567");
//        trainee.setCompanyName("OAK3");
//        trainee.setJobRole("CEO");
//
//        Instructor instructor = new Instructor();
//        instructor.setFirstname("Koen");
//        instructor.setName("Buyse");
//
//        Question question = new Question();
//        question.setQuestion("Waar is dat feestje ?");
//        question.setQuestionTypeId(QuestionType.FORM);
//        question.setAnswerTypeId(AnswerType.OPEN);
//
//        Answer answer = new Answer();
//        answer.setQuestionTypeId(QuestionType.FORM);
//        answer.setAnswerTypeId(AnswerType.OPEN);
//        answer.setInstructorId(3L);
//        answer.setTraineeId(3L);
//        answer.setInstructorCourseId(1L);
//        answer.setAnswer("Wij weten - zoals gewoonlijk - weer van niks ! :-(");
//
//        int i = service.addEvaluation(List<Answer> answer);
//        assertThat(i).isEqualTo(1);
//    }

}