package Ejercicio40;

public class Raizcuadrada {
    public static double[] calcraizCuadrada(double[] numeros) {
        double[] raizNumeros = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            raizNumeros[i] = Math.sqrt(numeros[i]);
        }
        return raizNumeros;
    }
}

