public class triangulo {
    
    public static Float base;
    public static Float altura;
    public static Float area;

    public Float getBase() {
        return base;
    }
    public void setBase(Float base) {
        triangulo.base = base;
    }
    public Float getAltura() {
        return altura;
    }
    public void setAltura(Float altura) {
        triangulo.altura = altura;
    }
    public Float getArea() {
        return area;
    }

    public Float areaTriangulo(Float base, Float altura) {
        area = (altura*base)/2;
        return area;
    }

}
