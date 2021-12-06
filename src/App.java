import java.lang.System;

public class App {

    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void changeAddress(Person p) {
        p = new Person("改变不了p指向的对象");
    }

    public static void changeName(Person p) {
        p.setName("可以改名");

    }

    public static void main(String[] args) {
        Person p = new Person("小红");
        changeAddress(p);
        System.out.println(p.getName());
        changeName(p);
        System.out.println(p.getName());
    }
}
