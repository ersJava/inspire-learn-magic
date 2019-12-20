package com.company.InspireLearnMagic.controller;

import com.company.InspireLearnMagic.model.QuestionAnswer;
import com.company.InspireLearnMagic.service.MagicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Magic8BallController {

    @Autowired
    private MagicService service;


    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public QuestionAnswer createMagic8BallQA(@RequestBody @Valid QuestionAnswer question){

        return service.getResponse(question);

    }

}


