
package superficies;

/**
 *
 * @author rfernandezgonzalez
 */
public class Vista {

    public void imprimir(Modelo contenedor) {
        if (contenedor.getShapeType().equalsIgnoreCase("square")) {
            System.out.println("El area de tu cuadrado es: " + contenedor.getSquareArea());
        }
        if (contenedor.getShapeType().equalsIgnoreCase("rectangle")) {
            System.out.println("El area de tu rectangulo es: " + contenedor.getRectangleArea());
        }
        if (contenedor.getShapeType().equalsIgnoreCase("triangle")) {
            System.out.println("El area de tu triangulo es: " + contenedor.getTriangleArea());
        }
        if (contenedor.getShapeType().equalsIgnoreCase("circle")) {
            System.out.println("El area de tu circulo es:" + contenedor.getCircleArea());
        }

    }
}

//Terminada
