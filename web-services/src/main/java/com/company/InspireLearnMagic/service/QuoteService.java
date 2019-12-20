package com.company.InspireLearnMagic.service;

import com.company.InspireLearnMagic.model.Quote;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuoteService {

    private static List<Quote> quotes = new ArrayList<>();
    private Random randomNumber = new Random();

    static  {
        quotes.add(new Quote("Our only limitations are those we set up in our own minds.", "Napoleon Hill"));
        quotes.add(new Quote("You are never too old, never too bad, never too late, never too sick to start from scratch once again.", "Bikram Choudhury"));
        quotes.add(new Quote("You learn more from failure than from success. Don’t let it stop you. Failure builds character.", "Unknown"));
        quotes.add(new Quote("It's not whether you get knocked down, it's whether you get back up.", "Vince Lombardi"));
        quotes.add(new Quote("If you're always trying to be normal, you will never know how amazing you can be.", "Maya Angelou"));
        quotes.add(new Quote("Try not to become a person of success, but rather try to become a person of value.", "Albert Einstein"));
        quotes.add(new Quote("The successful warrior is the average man, with laserlike focus.", "Bruce Lee"));
        quotes.add(new Quote("It never gets easier, you just get better", "Jordan Hoechlin"));
        quotes.add(new Quote("You may have to fight a battle more than once to win it.", "Margaret Thatcher"));
        quotes.add(new Quote("Life begins at the end of your comfort zone.", "Neale Donald Walsch "));
    }

    public Quote randomQuoteGenerator() {
       return quotes.get(randomNumber.nextInt(10));
    }
}
