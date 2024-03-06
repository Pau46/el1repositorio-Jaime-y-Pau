package Practica2.Ejercicio7;

public class TestMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line = new MyLine(p1, p2);

        System.out.println("Line coordinates: " + line);
        System.out.println("Line length: " + line.getLength());
    }
}
