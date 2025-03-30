package com.kodilla.spring.lib;

import com.kodilla.spring.lib.LibraryDbController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class Library {
    private final List<String> books = new ArrayList<>();
    @Autowired
    private LibraryDbController libraryDbController;

    public void saveToDb() {
        libraryDbController.saveData();
    }
    public void loadFromDb() {
        libraryDbController.loadData();
    }
}

