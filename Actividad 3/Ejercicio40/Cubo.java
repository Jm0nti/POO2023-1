package Ejercicio40;

public class Cubo {
    public static double[] calcCubo(double[] numeros) {
        double[] cuboNumeros = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            cuboNumeros[i] = Math.pow(numeros[i], 3);
        }
        return cuboNumeros;
    }
}
