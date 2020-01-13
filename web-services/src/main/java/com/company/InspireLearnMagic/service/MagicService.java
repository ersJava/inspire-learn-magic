package com.company.InspireLearnMagic.service;

import com.company.InspireLearnMagic.model.QuestionAnswer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MagicService {

    private static List<String> response = new ArrayList<String>();
    private Random randomNumber = new Random();

    static {
        response.add("Valid Request");
        response.add("OK");
        response.add("Accepted");
        response.add("Processing is Successful...");
        response.add("Forbidden");
        response.add("Cannot Be Fulfilled");
        response.add("Bad Request");
        response.add("Magic 8 Ball Timeout");
    }

    public QuestionAnswer getResponse(String question){

        QuestionAnswer questionAnswer = new QuestionAnswer();
        questionAnswer.setQuestion(question);

        int responseSelector = randomNumber.nextInt(8);
        questionAnswer.setAnswer(response.get(responseSelector));

        return questionAnswer;
    }
}
