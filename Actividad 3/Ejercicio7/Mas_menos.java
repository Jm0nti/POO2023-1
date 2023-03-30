package Ejercicio7;

public class Mas_menos {
    public static String calcularValor(double A, double B) {

        if (A>B) {
            return "A es mayor a B";
        } else if (B>A) {
            return "B es mayor a A";
        } else {
            return "A es igual a B";
        }
    }
}