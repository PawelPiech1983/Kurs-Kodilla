package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessage(User user, String message) throws MessageNotSentException{
        if(user != null) {
            System.out.println("Sending to: " + user.getName() + " : " + message);
        }
        else {
            throw new MessageNotSentException("Object User was null");
        }
    }
}
