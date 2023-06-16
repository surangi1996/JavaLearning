package example;

public class Abstraction {

    abstract static class Animal {
        abstract void sound();
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("baw baw");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("kchaw kchaw");
        }
    }

    interface Person {
        abstract void learn();
    }

    public static class Student implements Person {
        @Override
        public void learn() {
            System.out.println("student");
        }
    }

    public static class Child implements Person {
        @Override
        public void learn() {
            System.out.println("child");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        c.sound();
        d.sound();
        System.out.println("---------------------------------");
        Student st = new Student();
        Child ch = new Child();
        st.learn();
        ch.learn();

    }
}
