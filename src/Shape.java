public class Shape {
    public void draw(){
        System.out.println("Drawing something");
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle now");
    }
}