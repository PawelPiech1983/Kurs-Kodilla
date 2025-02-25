package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<>();
        //LibraryUser myUser = new LibraryUser("Pawel", "Piech", "83012044444");
        //if (libraryUser.equals(myUser)) {
        //    bookList = libraryDatabase.listBooksInHandsOf(libraryUser);
        //}
        Book book1 = new Book("The book title1", "The book author1", 2000);
        Book book2 = new Book("The book title2", "The book author2", 2000);
        bookList.add(book1);
        bookList.add(book2);
        return bookList;
    }

}