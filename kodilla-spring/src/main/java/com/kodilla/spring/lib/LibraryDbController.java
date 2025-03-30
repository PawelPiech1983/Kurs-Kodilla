package com.kodilla.spring.lib;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class LibraryDbController {

    public void saveData() {
        System.out.println("Saving data to the database");
    }

    public void loadData() {
        System.out.println("Loading data from the database");
    }
}

