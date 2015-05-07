package superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Examen de MVC 3ª Avaliación
 *
 * * Descripcion : Este programa, el cual está configurado sobre el modelo MVC,
 * pedirá el nombre de una figura para calcular su área (Cuadrado, Rectángulo,
 * írculo o Triángulo)
 *
 * @author damian
 */
public class Superficies {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Constructores de la clase Modelo y Vista
        Modelo contenedor = new Modelo();
        Vista vis = new Vista();

        String shapeType;

        sc = new Scanner(System.in);

        //Preguntamos que área se desea obtener
        System.out.println("Cual es el area que desea obtener? (Cuadrado, Circulo, Triangulo, Rectangulo):");
        shapeType = sc.nextLine();
        //Se envía la elección de shapeType a la clase Modelo.
        contenedor.setShapeType(shapeType);
        //Se enseña la elección escogida 
        System.out.println("Tu eliges: " + shapeType);

        //Mediante un "if" se pocederá a calcular el área de la figura escogida
        if (shapeType.equals("Cuadrado")) {
            //add area calculations for square
            float squareArea;
            float sideLength;

            //Preguntamos el lado del cuadrado
            System.out.println("Cual es el area del cuadrado?");
            sideLength = sc.nextFloat();
            //Mandamos el lado a la clase Modelo
            contenedor.setSideLength(sideLength);
            squareArea = sideLength * sideLength;
            //Mandamos el area a la clase Modelo
            contenedor.setSquareArea(squareArea);
            vis.imprimir(contenedor);

        }
        if (shapeType.equals("Rectangulo")) {
            //add area calculations for rectangle here
            float sideLength;
            float sideHeight;
            float rectangleArea;

            //Preguntamos la altura del rectángulo
            System.out.println("Cual es la altura del rectangulo?");
            sideLength = sc.nextFloat();
            contenedor.setSideLength(sideLength);
            //Preguntamos el base del rectángulo
            System.out.println("Cual es la base del rectangulo");
            sideHeight = sc.nextFloat();
            contenedor.setSideHeight(sideHeight);
            //Mandamos los datos a la clase Modelo
            rectangleArea = sideLength * sideHeight;
            contenedor.setRectangleArea(rectangleArea);
            vis.imprimir(contenedor);

        }
        if (shapeType.equals("triangulo")) {
            //add area calculations for triangle here
            float baseLength;
            float height;
            float triangleArea;
            //Preguntamos la base del triangulo
            System.out.println("Cual el la base del triangulo");
            baseLength = sc.nextFloat();
            contenedor.setBaseLength(baseLength);
            //Preguntamos la altura del triangulo
            System.out.println("Cual es la altura de triangulo?");
            height = sc.nextFloat();
            contenedor.setHeight(height);
            //Mandamos los datos a la clase Modelo
            triangleArea = (float) (0.5 * baseLength * height);
            contenedor.setTriangleArea(triangleArea);
            vis.imprimir(contenedor);

        }
        if (shapeType.equals("Circulo")) {
            //add area calculations for a circle here
            float radius;
            float circleArea;

            //Preguntamos el radio del circulo
            System.out.println("Cual es el radio del circulo?");
            radius = sc.nextFloat();
            contenedor.setRadius(radius);
            circleArea = radius * radius;
            //Mandamos los datos a la clase Modelo
            circleArea = (float) (3.14159265 * circleArea);
            contenedor.setCircleArea(circleArea);
            vis.imprimir(contenedor);
        }

    }
}
