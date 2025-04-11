package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;


import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    public void libraryGetBooksTest(){
        //Given
        //Creating Library and Books
        Library library = new Library("Library number 1");
        Book book1 = new Book("Title 1", "Author 1", now());
        Book book2 = new Book("Title 2", "Author 2", now());
        Book book3 = new Book("Title 3", "Author 3", now());
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //Making shallowCopy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned Library with shallowCopy()");
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Making deepCopy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Cloned Library with deepCopy()");
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
