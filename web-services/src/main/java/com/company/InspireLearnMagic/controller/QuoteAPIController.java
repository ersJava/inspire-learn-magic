package com.company.InspireLearnMagic.controller;


import com.company.InspireLearnMagic.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class QuoteAPIController {

    private Map<Integer, Quote> quoteList = new HashMap<>();
    private Random randomNum = new Random();

    public QuoteAPIController() {

        quoteList.put(0, new Quote("Our only limitations are those we set up in our own minds.", "Napoleon Hill"));
        quoteList.put(1, new Quote("You are never too old, never too bad, never too late, never too sick to start from scratch once again.", "Bikram Choudhury"));
        quoteList.put(2, new Quote("You learn more from failure than from success. Don’t let it stop you. Failure builds character.", "Unknown"));
        quoteList.put(3, new Quote("It's not whether you get knocked down, it's whether you get back up.", "Vince Lombardi"));
        quoteList.put(4, new Quote("If you're always trying to be normal, you will never know how amazing you can be.", "Maya Angelou"));
        quoteList.put(5, new Quote("Try not to become a person of success, but rather try to become a person of value.", "Albert Einstein"));
        quoteList.put(6, new Quote("The successful warrior is the average man, with laserlike focus.", "Bruce Lee"));
        quoteList.put(7, new Quote("It never gets easier, you just get better", "Jordan Hoechlin"));
        quoteList.put(8, new Quote("You may have to fight a battle more than once to win it.", "Margaret Thatcher"));
        quoteList.put(9, new Quote("Life begins at the end of your comfort zone.", "Neale Donald Walsch "));

    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote(){

        return quoteList.get(randomNum.nextInt(10));

    }
}
