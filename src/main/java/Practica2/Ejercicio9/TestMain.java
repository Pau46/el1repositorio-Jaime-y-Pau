package Practica2.Ejercicio9;

public class TestMain {
    public static void main(String[] args) {

        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        MyTriangle triangle2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(3, 0), new MyPoint(0, 3));


        System.out.println("Triangle 1:");
        System.out.println("Coordinates of vertices: " + triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());


        System.out.println("\nTriangle 2:");
        System.out.println("Coordinates of vertices: " + triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());
    }
}

