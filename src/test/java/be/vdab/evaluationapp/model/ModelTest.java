package be.vdab.evaluationapp.model;

import org.junit.Test;

import java.sql.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class ModelTest {

    @Test
    public void testOrdinals() {
        Answer answer = new Answer();
        answer.setAnswer("This is the answer my friend");
        answer.setAnswerTypeId(AnswerType.OPEN);
        answer.setCourseId(1L);
        answer.setInstructorId(1L);
        answer.setQuestionTypeId(QuestionType.CONTENT);
        answer.setDate(Date.valueOf("1985-10-20"));
        answer.setTraineeId(1L);
        answer.setId(1L);
        assertThat(answer.getQuestionTypeId().ordinal() + 1).isEqualTo(6);
    }
}
