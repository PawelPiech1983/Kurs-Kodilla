package com.kodilla.patterns.singleton;

public class Logger {

    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("LOG: ["+log+"]");
    }
    public String getLastLog() {
        return lastLog;
    }
}
