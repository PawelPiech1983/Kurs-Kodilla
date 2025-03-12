package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender sender = new MessageSender();

        try {
            sender.sendMessage(user, "Hello!");
        }
        catch (MessageNotSentException e) {
            System.out.println("Message is not send, " +
                    "but my program still running very well!");
        }

        System.out.println("Processing other logic!");
    }
}
