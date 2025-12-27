package P;

import java.util.*;

abstract class Shape {
    int a, b;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void printArea() {
        System.out.println("Rectangle Area: " + (a * b));
    }
}

class Triangle extends Shape {
    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void printArea() {
        System.out.println("Triangle Area: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    Circle(int a) {
        this.a = a;
    }
    void printArea() {
        System.out.println("Circle Area: " + (Math.PI * a * a));
    }
}

public class LabShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt(), b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);
        r.printArea();
        System.out.print("Enter base and height of triangle: ");
        int base = sc.nextInt(), h = sc.nextInt();
        Triangle t = new Triangle(base, h);
        t.printArea();
        System.out.print("Enter radius of circle: ");
        int rad = sc.nextInt();
        Circle c = new Circle(rad);
        c.printArea();
        sc.close();
    }
}