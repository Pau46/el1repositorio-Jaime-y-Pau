package Practica2.Ejercicio8;

public class TestMain {

        public static void main(String[] args) {
            // Crear un círculo con centro en (0, 0) y radio 5
            MyCircle circle1 = new MyCircle(0, 0, 5);

            // Mostrar el centro y el radio del círculo
            System.out.println("Círculo 1:");
            System.out.println("Centro: (" + circle1.getCenterX() + ", " + circle1.getCenterY() + ")");
            System.out.println("Radio: " + circle1.getRadius());

            // Calcular y mostrar el área y la circunferencia del círculo
            System.out.println("Área: " + circle1.getArea());
            System.out.println("Circunferencia: " + circle1.getCircumference());

            // Crear otro círculo con centro en (3, 4) y radio 6
            MyPoint center2 = new MyPoint(3, 4);
            MyCircle circle2 = new MyCircle(center2, 6);

            // Mostrar el centro y el radio del segundo círculo
            System.out.println("\nCírculo 2:");
            System.out.println("Centro: (" + circle2.getCenterX() + ", " + circle2.getCenterY() + ")");
            System.out.println("Radio: " + circle2.getRadius());

            // Calcular y mostrar el área y la circunferencia del segundo círculo
            System.out.println("Área: " + circle2.getArea());
            System.out.println("Circunferencia: " + circle2.getCircumference());

            // Calcular y mostrar la distancia entre los dos círculos
            System.out.println("\nDistancia entre los dos círculos: " + circle1.distance(circle2));
        }
    }

