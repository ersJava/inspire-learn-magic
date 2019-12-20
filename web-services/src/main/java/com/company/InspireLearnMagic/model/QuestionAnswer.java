package com.company.InspireLearnMagic.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class QuestionAnswer {

    @Size(min = 10, message= "You must ask a question")
    @NotEmpty(message = "You must ask a question")
    private String question;
    private String answer;

    public QuestionAnswer() {
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
