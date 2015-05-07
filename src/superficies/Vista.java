package superficies;

/**
 *
 * @author rfernandezgonzalez
 */
public class Vista {

    public void imprimir(Modelo mod) {
        if (mod.getShapeType().equalsIgnoreCase("square")) {
            System.out.println("El area de tu cuadrado es: " + mod.getSquareArea());
        }
        if (mod.getShapeType().equalsIgnoreCase("rectangle")) {
            System.out.println("El area de tu rectangulo es: " + mod.getRectangleArea());
        }
        if (mod.getShapeType().equalsIgnoreCase("triangle")) {
            System.out.println("El area de tu triangulo es: " + mod.getTriangleArea());
        }
        if (mod.getShapeType().equalsIgnoreCase("circle")) {
            System.out.println("El area de tu circulo es:" + mod.getCircleArea());
        }

    }
}
