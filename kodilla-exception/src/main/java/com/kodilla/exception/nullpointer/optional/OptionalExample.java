package com.kodilla.exception.nullpointer.optional;

import com.kodilla.exception.nullpointer.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("Kodilla");

        Optional<User> optionalUser = Optional.ofNullable(user);

//        orElse Example
//        String ususerName = optionalUser.orElse(new User("")).getName();
//        System.out.println(ususerName);

//        ifPresent Example
        optionalUser.ifPresent( u -> System.out.println(user.getName()));
    }
}
