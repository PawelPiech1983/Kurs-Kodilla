package com.kodilla.spring.libraryWithoutAutowired;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }
    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
