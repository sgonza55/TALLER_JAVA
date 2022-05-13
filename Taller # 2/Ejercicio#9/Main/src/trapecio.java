public class trapecio {

    public static Float baseMayor;
    public static Float baseMenor;
    public static Float altura;
    public static Float area;

    public Float getbaseMayor() {
        return baseMayor;
    }

    public void setbaseMayor(Float baseMayor) {
        trapecio.baseMayor = baseMayor;
    }

    public Float getbaseMenor() {
        return baseMenor;
    }

    public void setbaseMenor(Float baseMenor) {
        trapecio.baseMenor = baseMenor;
    }
    
    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        trapecio.altura = altura;
    }

    public Float getArea() {
        return area;
    }

    public Float areaTrapecio(Float ladoMayor, Float baseMenor, Float altura) {
        area = altura*((baseMenor + ladoMayor)/2);
        return area;
    }
}
