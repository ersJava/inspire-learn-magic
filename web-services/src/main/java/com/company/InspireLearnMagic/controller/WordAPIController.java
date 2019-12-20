package com.company.InspireLearnMagic.controller;

import com.company.InspireLearnMagic.model.Word;
import com.company.InspireLearnMagic.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class WordAPIController {

    @Autowired
    private WordService service;

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getWord() {

        return service.randomWordGenerator();
        }
    }