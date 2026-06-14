class Shape {
    double radius;
    int length, breadth;
    int side;

    Shape(double radius) {
        this.radius = radius;
    }

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int side) {
        this.side = side;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        super(radius);
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    double getArea() {
        return length * breadth;
    }
}

class Square extends Shape {
    Square(int side) {
        super(side);
    }

    double getArea() {
        return side * side;
    }
}

public class inherit1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.println("Circle Area: " + c1.getArea());

        Rectangle r1 = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + r1.getArea());

        Square s1 = new Square(15);
        System.out.println("Square Area: " + s1.getArea());
    }
}