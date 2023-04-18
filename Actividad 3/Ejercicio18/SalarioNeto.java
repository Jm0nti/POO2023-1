package Ejercicio18;

public class SalarioNeto {
    public static double calcularSalarioNeto(double salarioBruto, double retencion) {
        return salarioBruto * (1 - retencion / 100);
    }
}
