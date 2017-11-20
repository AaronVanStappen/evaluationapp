package be.vdab.evaluationapp.model;

public class Question {
    private int id;
    private String question;
    private QuestionType questionTypeId;
    private AnswerType answerTypeId;

    public Question() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
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

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", questionTypeId=" + questionTypeId +
                ", answerTypeId=" + answerTypeId +
                '}';
    }
}
