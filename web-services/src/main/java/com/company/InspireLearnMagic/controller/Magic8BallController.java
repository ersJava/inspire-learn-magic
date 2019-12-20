package com.company.InspireLearnMagic.controller;

import com.company.InspireLearnMagic.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Magic8BallController {

    private List<String> response = new ArrayList<String>();

    private  Random randomNum = new Random();

    public Magic8BallController() {

        response.add(0, "Valid Request");
        response.add(1,"OK");
        response.add(2, "Accepted");
        response.add(3,"Processing is Successful...");
        response.add(4, "Forbidden");
        response.add(5, "Cannot Be Fulfilled");
        response.add(6, "Bad Request");
        response.add(7, "Magic 8 Ball Timeout");
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer createMagic8BallQA(@RequestBody @Valid Answer fullQA){

        int responseSelector = randomNum.nextInt(8);

        fullQA.setAnswer(response.get(responseSelector));

        return fullQA;

    }

}


