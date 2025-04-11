package com.kodilla.patterns.singleton;

public enum SettingsFileEngineSingletonEnum {

    INSTANCE;

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening settings file: " + fileName);
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing settings file: " + fileName);
    }

    public boolean loadSettings() {
        System.out.println("Loading settings file: " + fileName);
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings file: " + fileName);
        return true;
    }
}
