package be.vdab.evaluationapp.model;

import java.sql.Date;

public class Answer {
    private long id;
    private QuestionType questionTypeId;
    private AnswerType answerTypeId;
    private long instructorId;
    private long traineeId;
    private long courseId;
    private String answer;
    private Date date;

    public Answer() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public QuestionType getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(QuestionType questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public AnswerType getAnswerTypeId() {
        return answerTypeId;
    }

    public void setAnswerTypeId(AnswerType answerTypeId) {
        this.answerTypeId = answerTypeId;
    }

    public long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(long instructorId) {
        this.instructorId = instructorId;
    }

    public long getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(long traineeId) {
        this.traineeId = traineeId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", questionTypeId=" + questionTypeId +
                ", answerTypeId=" + answerTypeId +
                ", instructorId=" + instructorId +
                ", traineeId=" + traineeId +
                ", courseId=" + courseId +
                ", answer='" + answer + '\'' +
                '}';
    }
}
