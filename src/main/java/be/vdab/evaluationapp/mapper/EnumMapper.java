package be.vdab.evaluationapp.mapper;

import be.vdab.evaluationapp.model.AnswerType;
import be.vdab.evaluationapp.model.CourseTopic;
import be.vdab.evaluationapp.model.QuestionType;

public class EnumMapper {
    public static AnswerType mapToAnswerType(int answer) {
        for(AnswerType a: AnswerType.values()) {
            if(a.ordinal() == answer) {
                return a;
            }
        }
        throw new RuntimeException("Answer type not found");
    }

    public static QuestionType mapToQuestionType(int question) {
        for(QuestionType q : QuestionType.values()) {
            if(q.ordinal() == question) {
                return q;
            }
        }
        throw new RuntimeException("Question type not found");
    }

    public static CourseTopic mapToCourseTopic(int courseTopic) {
        for(CourseTopic c : CourseTopic.values()) {
            if(c.ordinal() == courseTopic) {
                return c;
            }
        }
        throw new RuntimeException("Course topic not found");
    }
}
