package com.company.InspireLearnMagic.controller;


import com.company.InspireLearnMagic.model.Quote;
import com.company.InspireLearnMagic.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class QuoteAPIController {

    @Autowired
    private QuoteService service;

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getInspirationalQuote(){

        return service.randomQuoteGenerator();

    }
}
