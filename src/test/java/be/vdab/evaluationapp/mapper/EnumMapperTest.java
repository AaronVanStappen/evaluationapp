package be.vdab.evaluationapp.mapper;

import be.vdab.evaluationapp.model.AnswerType;
import be.vdab.evaluationapp.model.CourseTopic;
import be.vdab.evaluationapp.model.QuestionType;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EnumMapperTest {

    @Test
    public void testMapToAnswerType() {
        //0 = OPEN
        AnswerType a = EnumMapper.mapToAnswerType(0);
        assertThat(a).isEqualTo(AnswerType.OPEN);
        assertThat(a.name()).isEqualToIgnoringCase("open");
        assertThat(a.ordinal()).isEqualTo(0);
    }

   @Test(expected = RuntimeException.class)
    public void testMapToAnswerTypeWithException() {
        AnswerType notFound = EnumMapper.mapToAnswerType(666);
    }

    @Test
    public void testMapToQuestionType() {
        //1 = GENERAL
        QuestionType q = EnumMapper.mapToQuestionType(1);
        assertThat(q).isEqualTo(QuestionType.GENERAL);
        assertThat(q.name()).isEqualToIgnoringCase("general");
        assertThat(q.ordinal()).isEqualTo(1);
    }

    @Test(expected = RuntimeException.class)
    public void testMapToQuestionTypeWithException() {
        QuestionType notFound = EnumMapper.mapToQuestionType(666);
    }

    @Test
    public void testMapToCourseTopic() {
        //6 = METHODOLOGY
        CourseTopic c = EnumMapper.mapToCourseTopic(6);
        assertThat(c).isEqualTo(CourseTopic.METHODOLOGY);
        assertThat(c.name()).isEqualToIgnoringCase("methodology");
        assertThat(c.ordinal()).isEqualTo(6);
        assertThat(c.getString()).isEqualToIgnoringCase("methodology");
    }

    @Test(expected = RuntimeException.class)
    public void testMapToCourseTopicWithException() {
        CourseTopic notFound = EnumMapper.mapToCourseTopic(666);
    }
}
