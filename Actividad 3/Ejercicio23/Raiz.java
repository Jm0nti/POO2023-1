package Ejercicio23;

public class Raiz {
    public static String calcularRaiz(double A, double B, double C){
        double discriminante = Math.pow(B, 2) - 4 * A * C;
        if (discriminante < 0) {
            return "No hay soluciones";
        } else if (discriminante == 0) {
            double raiz = -B / (2 * A);
            return "Raiz: " + Math.round(raiz * 100.0) / 100.0;
        } else {
            double r1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double r2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            return "Las soluciones son: "+ "\n" 
            + "Raíz 1: " + Math.round(r1 * 100.0) / 100.0 + "\n" 
            + "Raiz 2: " + Math.round(r2 * 100.0) / 100.0;
        }
    }
}

