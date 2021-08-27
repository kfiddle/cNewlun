package com.example.demo.enums;

public enum Schedule {
    CLASSICS("A Schedule");

    private final String stringVersion;

    Schedule(String stringVersion) {
        this.stringVersion = stringVersion;
    }

    public String toString() {
        return stringVersion;
    }

}
