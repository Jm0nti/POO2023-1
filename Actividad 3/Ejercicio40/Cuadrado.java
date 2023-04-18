package Ejercicio40;

public class Cuadrado {
    public static double[] calcCuadrado(double[] numeros) {
        double[] cuadradoNumeros = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            cuadradoNumeros[i] = Math.pow(numeros[i], 2);
        }
        return cuadradoNumeros;
    }
}
