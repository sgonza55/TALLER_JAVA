public class rectangulo {

    public static Float ladoMayor;
    public static Float ladoMenor;
    public static Float area;

    public Float getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(Float ladoMayor) {
        rectangulo.ladoMayor = ladoMayor;
    }

    public Float getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(Float ladoMenor) {
        rectangulo.ladoMenor = ladoMenor;
    }
    
    public Float getArea() {
        return area;
    }

    public Float areaRectangulo(Float ladoMayor, Float ladoMenor) {
        area = ladoMenor * ladoMayor;
        return area;
    }
}
