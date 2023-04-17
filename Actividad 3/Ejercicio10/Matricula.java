package Ejercicio10;

public class Matricula {
    public static double calcularMatricula(double patrimonio, double estrato){

        if (patrimonio>2000000 && estrato >3){
            return 50000 + ((patrimonio*3)/100);
        }
        else {
            return 50000;
        }
    }

}
