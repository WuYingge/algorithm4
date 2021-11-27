import java.lang.System;

public class App {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "aaa";
        s.eat();
    }

    public static class Student {
        String name;
        int age;
        float height;

        public void eat() {
            System.out.printf("");
        }
    }
}