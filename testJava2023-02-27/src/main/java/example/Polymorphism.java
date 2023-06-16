package example;

public class Polymorphism {
    public static class Shape {
        public void draw(){
            System.out.println("Im drawing a shape");
        }
    }

    public static class Rectangle extends Shape{
        @Override
        public void draw(){
            System.out.println("Im drawing a Rectangle");
        }

    }

    public static class Triangle extends Shape {
        @Override
        public void draw(){
            System.out.println("Im drawing a triangle");
        }
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();

        s = new Rectangle();
        s.draw();

        s = new Triangle();
        s.draw();
    }
}
