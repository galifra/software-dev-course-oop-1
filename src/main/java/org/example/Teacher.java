package org.example;

public class Teacher {

    // Fields
    private String name;
    private String className;

    // Constructor
    public Teacher(String name, String className) {
        this.name = name;
        this.className = className;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // toString Method
    @Override
    public String toString() {
        return name + " (" + className + ")";
    }
}
