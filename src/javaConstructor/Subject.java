package javaConstructor;

public class Subject {
    String name;
    int age;

    public Subject(String name) {
        this.name = name;
    }

    public Subject(int age) {
        this.age = age;
    }

    public Subject(String name, int age) {
        System.out.println("This is constructor");
        this.age = age;
        this.name = name;
    }

}
