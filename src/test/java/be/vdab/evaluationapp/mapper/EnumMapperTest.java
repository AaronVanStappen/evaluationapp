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
        AnswerType a = EnumMapper.mapToAnswerType(2);
        assertThat(a).isEqualTo(AnswerType.OPEN);
        assertThat(a.name()).isEqualToIgnoringCase("open");
        assertThat(a.ordinal()).isEqualTo(2);
    }

   @Test(expected = RuntimeException.class)
    public void testMapToAnswerTypeWithException() {
        AnswerType notFound = EnumMapper.mapToAnswerType(666);
    }

    @Test
    public void testMapToQuestionType() {
        //1 = GENERAL
        QuestionType q = EnumMapper.mapToQuestionType(0);
        assertThat(q).isEqualTo(QuestionType.HEADER);
        assertThat(q.name()).isEqualToIgnoringCase("header");
        assertThat(q.ordinal()).isEqualTo(0);

    }

    @Test(expected = RuntimeException.class)
    public void testMapToQuestionTypeWithException() {
        QuestionType notFound = EnumMapper.mapToQuestionType(666);
    }

    @Test
    public void testMapToCourseTopic() {
        //6 = METHODOLOGY
        CourseTopic c = EnumMapper.mapToCourseTopic(6);
        assertThat(c).isEqualTo(CourseTopic.SAP);
        assertThat(c.name()).isEqualToIgnoringCase("sap");
        assertThat(c.ordinal()).isEqualTo(6);
        assertThat(c.getString()).isEqualToIgnoringCase("sap");
    }

    @Test(expected = RuntimeException.class)
    public void testMapToCourseTopicWithException() {
        CourseTopic notFound = EnumMapper.mapToCourseTopic(666);
    }
}
