abstract class Shape {
    abstract void draw();
}


class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}


public class AbstractClas {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw();
    }
}
