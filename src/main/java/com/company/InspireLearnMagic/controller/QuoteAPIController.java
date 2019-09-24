package com.company.InspireLearnMagic.controller;


import com.company.InspireLearnMagic.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class QuoteAPIController {

    Map<Integer, Quote> qaList = new HashMap<>();

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote(){


        Random randomNum = new Random();
        int quoteNum = randomNum.nextInt(9)+1;
        return qaList.get(quoteNum);

    }
}
