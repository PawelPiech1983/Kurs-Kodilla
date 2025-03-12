package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.itereate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.forumuser.Forum;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");
        System.out.println("Modul 7.1");
        //1. Object example
        SaySomething saySomething = new SaySomething();
        saySomething.say();

        //Lambda example
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is lambda example"));

        //Lambda calculator
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Task 7.1 Poem beautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("My poem", (poem) -> "ABC" + poem + "DEF");
        poemBeautifier.beautify("My poem", (poem) -> poem.toUpperCase());

        System.out.println("Modul 7.2");
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println("Modul 7.3 - transform and filtern operations");
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println("Modul 7.3 - Stream on objects - toMap");
        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYear() > 2005)
                .collect(Collectors.toMap(Book::getIsbn, book -> book));

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println("Modul 7.3 - Stream on objects - joining");
        BookDirectory theBookDirectory2 = new BookDirectory();
        String theResultListOfBooks2 = theBookDirectory2.getList().stream()
                .filter(book -> book.getYear() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining("\n","<<",">>"));

        System.out.println(theResultListOfBooks2);

        System.out.println("Task 7.3 Forum");
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUser =  forum.getUserList().stream()
                .filter(s -> s.getGender() == 'M')
                .filter(s -> s.getBirthdate().getYear() < 2005)
                .filter(s -> s.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getId, s -> s));

        forumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}
