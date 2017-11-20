package be.vdab.evaluationapp.model;

public class Answer {
    long id;
    QuestionType questionTypeId;
    AnswerType answerTypeId;
    long instructorId;
    long traineeId;
    String answer;

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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", questionTypeId=" + questionTypeId.name() +
                ", answerTypeId=" + answerTypeId.name() +
                ", instructorId=" + instructorId +
                ", traineeId=" + traineeId +
                ", answer='" + answer + '\'' +
                '}';
    }
}
