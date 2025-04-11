package com.kodilla.patterns.singleton;

public enum LoggerSingleton {
    LOG;

    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("LOG: ["+log+"]");
    }
    public String getLastLog() {
        return lastLog;
    }

}
