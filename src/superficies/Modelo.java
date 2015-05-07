package superficies;

/**
 *
 * @author rfernandezgonzalez
 */
public class Modelo {

    float areaCuadrado;
    float lado;
    float altura;
    float areaRectangulo;
    float base;
    float areaTriangulo;
    float radio;
    float areaCirculo;

    public Modelo() {
    }

    public Modelo(float areaCuadrado, float lado, float altura, float areaRectangulo, float base, float areaTriangulo, float radio, float areaCirculo) {
        this.areaCuadrado = areaCuadrado;
        this.lado = lado;
        this.altura = altura;
        this.areaRectangulo = areaRectangulo;
        this.base = base;
        this.areaTriangulo = areaTriangulo;
        this.radio = radio;
        this.areaCirculo = areaCirculo;
    }

    public float getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setAreaCuadrado(float areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAreaRectangulo() {
        return areaRectangulo;
    }

    public void setAreaRectangulo(float areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(float areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAreaCirculo() {
        return areaCirculo;
    }

    public void setAreaCirculo(float areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

}
