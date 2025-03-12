package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String name;
    private final char gender;
    private final LocalDate birthdate;
    private int postsQuantity;

    public ForumUser(int id, String name, char gender, LocalDate birthdate, int postsQuantity) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", gender='" + gender + '\'' +
                ", posts writed='" + postsQuantity + '\'' +
                '}';
    }
}
