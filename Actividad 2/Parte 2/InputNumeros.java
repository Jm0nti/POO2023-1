public class InputNumeros{
    public static void main(String args[]){
        Circulo circulo=new Circulo(2);
        Rectangulo rectangulo=new Rectangulo(1,2);
        Cuadrado cuadrado=new Cuadrado(3);
        TrianguloRectangulo triangulo=new TrianguloRectangulo(3,5);
        System.out.println("El area del circulo es: "+circulo.area());
        System.out.println("El perimetro del circulo es: "+circulo.perimetro());
        System.out.println();        
        System.out.println("El area del rectangulo es: "+rectangulo.area());
        System.out.println("El perimetro del rectangulo es: "+rectangulo.perimetro());
        System.out.println();
        System.out.println("El area del cuadrado es: "+cuadrado.area());
        System.out.println("El perimetro del cuadrado es: "+cuadrado.perimetro());
        System.out.println();
        System.out.println("El area del triangulo rectangulo es: "+triangulo.area());
        System.out.println("El perimetro del triangulo rectangulo es: "+triangulo.perimetro());
        triangulo.determinarTipo();
    }
}