package Practica2.Ejercicio9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void getPerimeter() {
        MyTriangle triangle = new MyTriangle(0, 0, 3, 0, 0, 4);
        assertEquals(12.0, triangle.getPerimeter());
    }

    @Test
    void getType() {
        MyTriangle equilateralTriangle = new MyTriangle(0, 0, 3, 0, 1, (int) Math.sqrt(3));
        assertEquals("Scalene", equilateralTriangle.getType());

        MyTriangle isoscelesTriangle = new MyTriangle(0, 0, 2, 0, 1, (int) Math.sqrt(3));
        assertEquals("Isosceles", isoscelesTriangle.getType());

        MyTriangle scaleneTriangle = new MyTriangle(0, 0, 3, 0, 0, 4);
        assertEquals("Scalene", scaleneTriangle.getType());
    }

    @Test
    void testToString() {
        MyTriangle triangle = new MyTriangle(0, 0, 3, 0, 0, 4);
        assertEquals("MyTriangle[v1=(0,0), v2=(3,0), v3=(0,4)]", triangle.toString());
    }

    @Test
    void main() {
        // Crear triángulos y probar los métodos
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("Triangle 1:");
        System.out.println("Coordinates of vertices: " + triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());

        MyTriangle triangle2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(3, 0), new MyPoint(0, 3));
        System.out.println("\nTriangle 2:");
        System.out.println("Coordinates of vertices: " + triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());
    }
}