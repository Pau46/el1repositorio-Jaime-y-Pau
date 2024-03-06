package Practica2.Ejercicio6;

public class TestMain {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version?
        System.out.println(p2.distance(p1)); // which version?
        System.out.println(p1.distance(5, 6)); // which version?
        System.out.println(p1.distance()); // which version?

        // Instantiate an array of 10 MyPoint objects
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Display the matrix of distances between all points
        System.out.println("Matrix of distances:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                System.out.printf("%.2f\t", points[i].distance(points[j]));
            }
            System.out.println();
        }
    }
}
