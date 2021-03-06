package com.company.InspireLearnMagic.service;

import com.company.InspireLearnMagic.model.Word;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class WordService {

    private static List<Word> words = new ArrayList<>();
    private Random randomNumber = new Random();

    static {
        words.add(new Word("JDK", "Java Development Kit, is a software development environment used for developing Java applications and applets. It includes, the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an achiever (jar), a documentation generator (Javadoc) and other tools needed in Java development."));
        words.add(new Word("DOM", "Document Object Model, is a programming API for HTML and XML documents."));
        words.add(new Word("API", "Application Program Interface, is a set of routines, protocols, and tools for building software applications."));
        words.add(new Word("REST", "REpresentational State Transfer, is a architectural style that specifies constraints, such as the uniform interface that if applied to a web service induce desirable properties, such as performance, scalability, and modifiability, that enable services to work best on the Web."));
        words.add(new Word("HTTP", "HyperText Transfer Protocol, is an underlying protocol used by the World Wide Web and defines how messages are formatted and transmitted, and what actions Web servers abd browsers should take in response to varies commands."));
        words.add(new Word("JSR 303", "Java Specification Request, is a set of annotations and behaviors for that define validation rules for properties in a Java object."));
        words.add(new Word("JSON", "JavaScript Object Notation, is a lightweight data-interchange format that is easy for humans to read and write and easy for machines to parse and generate."));
        words.add(new Word("MVC", "Model View Controller, is a design pattern that has become popular for designing web applications."));
        words.add(new Word("DAO", "Data access object, is an object that provides an abstract interface to some type of database or other persistence mechanism, by mapping application calls to the persistence layer it provides specific data operations without exposing details of the database."));
        words.add(new Word("CRUD", "Create, Read, Update, Delete, a term used in database management, it contains the four basic functions of a persistent database."));
        words.add(new Word("XML", "Extensible Markup Language, is a markup language that defines a set of rules for encoding documents in a format that is both human-readable and machine-readable."));
        words.add(new Word("JVM", "Java Virtual Machine, is a virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled in Java bytecode."));
        words.add(new Word("HTML", "Hypertext Markup Language, a standardized system for tagging text files to achieve font, color, graphic, and hyperlink effects on the World Wide Web pages."));
        words.add(new Word("JRE", "Java RunTime Environment, provides the minimum requirements for executing a Java application; it consists of the Java Virtual Machine (JVM), core classes, and supporting files."));
        words.add(new Word("AAA", "Arrange-Act-Assert, is a pattern for arranging and formatting code in Unit Test methods. Arrange, all necessary preconditions and inputs. Act, on the object or method under test. Assert that the expected results have occurred."));
    }

    public Word randomWordGenerator() {
        return words.get(randomNumber.nextInt(15));
    }
}
