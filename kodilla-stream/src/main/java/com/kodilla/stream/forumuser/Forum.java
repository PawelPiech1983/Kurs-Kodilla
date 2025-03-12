package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {


    public Forum() {
    }

    public static List<ForumUser> getUserList() {

        final List<ForumUser> forumUser = new ArrayList<>();

        forumUser.add(new ForumUser(1,"Dylan Murphy", 'M', LocalDate.of(2020, 04, 02), 21));
        forumUser.add(new ForumUser(2,"Phoebe Pearson", 'F', LocalDate.of(2012,04,02), 4));
        forumUser.add(new ForumUser(3,"Morgan Walsh", 'M', LocalDate.of(2001,04,02), 456));
        forumUser.add(new ForumUser(4,"Aimee Murphy", 'F', LocalDate.of(2015,04,02), 12));
        forumUser.add(new ForumUser(5,"Ryan Talley", 'M', LocalDate.of(2007,04,02), 67));
        forumUser.add(new ForumUser(6,"Madelynn Carson", 'F', LocalDate.of(2007,04,02), 0));
        forumUser.add(new ForumUser(7,"Giancarlo Guerrero", 'M', LocalDate.of(2009,04,02), 77));


        return new ArrayList<>(forumUser);

    }
}
