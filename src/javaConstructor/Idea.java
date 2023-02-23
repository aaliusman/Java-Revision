package javaConstructor;


import JavaRevision.Encapsulation;

public class Idea extends EncapExample {

    public static void main(String[] args) {

        Subject sub = new Subject("Usman", 4);
        System.out.println(sub.name + ":" + sub.age);
    }
}