package Parte2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Figuras {

    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();     
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel radioLabel = new JLabel("Radio del círculo");  
        radioLabel.setBounds(10,20,200,25);        
        panel.add(radioLabel);
        
        JTextField radioEspacio = new JTextField();
        radioEspacio.setBounds(150,20,50,25);
        panel.add(radioEspacio);
        
        JLabel baserectanguloLabel = new JLabel("Base del rectángulo");  
        baserectanguloLabel.setBounds(10,100,200,25);        
        panel.add(baserectanguloLabel);
        
        JTextField baserectanguloEspacio = new JTextField();
        baserectanguloEspacio.setBounds(150,100,50,25);
        panel.add(baserectanguloEspacio);
        
        JLabel alturarectanguloLabel = new JLabel("Altura del rectángulo");  
        alturarectanguloLabel.setBounds(10,180,200,25);        
        panel.add(alturarectanguloLabel);
        
        JTextField alturarectanguloEspacio = new JTextField();
        alturarectanguloEspacio.setBounds(150,180,50,25);
        panel.add(alturarectanguloEspacio);
        
        JLabel cuadradoLabel = new JLabel("Lado del cuadrado");  
        cuadradoLabel.setBounds(10,260,200,25);        
        panel.add(cuadradoLabel);
        
        JTextField cuadradoEspacio = new JTextField();
        cuadradoEspacio.setBounds(150,260,50,25);
        panel.add(cuadradoEspacio);
        
        JLabel basetrianguloLabel = new JLabel("Base del triángulo");  
        basetrianguloLabel.setBounds(10,340,200,25);        
        panel.add(basetrianguloLabel);
        
        JTextField basetrianguloEspacio = new JTextField();
        basetrianguloEspacio.setBounds(150,340,50,25);
        panel.add(basetrianguloEspacio);
        
        JLabel alturatrianguloLabel = new JLabel("Altura del triángulo");  
        alturatrianguloLabel.setBounds(10,420,200,25);        
        panel.add(alturatrianguloLabel);
        
        JTextField alturatrianguloEspacio = new JTextField();
        alturatrianguloEspacio.setBounds(150,420,50,25);
        panel.add(alturatrianguloEspacio);
        
        JButton aceptarBoton = new JButton("Calcular");        
        aceptarBoton.setBounds(120,480,100,25);
        panel.add(aceptarBoton);
        aceptarBoton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    double radio = Double.parseDouble(radioEspacio.getText());
                    double baserectangulo = Double.parseDouble(baserectanguloEspacio.getText());                   
                    double alturarectangulo = Double.parseDouble(alturarectanguloEspacio.getText());
                    double cuadrado = Double.parseDouble(cuadradoEspacio.getText());
                    double basetriangulo = Double.parseDouble(basetrianguloEspacio.getText());
                    double alturatriangulo = Double.parseDouble(alturatrianguloEspacio.getText());
                    
                    Circulo circulo1 = new Circulo((int) radio);
                    Rectangulo rectangulo1 = new Rectangulo((int)baserectangulo, (int)alturarectangulo);
                    Cuadrado cuadrado1 = new Cuadrado((int) cuadrado);
                    TrianguloRectangulo triangulo1 = new TrianguloRectangulo((int)basetriangulo, (int)alturatriangulo);
                                        
                    double areacirculo = circulo1.calcularArea();
                    double perimetrocirculo = circulo1.calcularPerimetro();
                    double arearectangulo = rectangulo1.calcularArea();
                    double perimetrorectangulo = rectangulo1.calcularPerimetro();
                    double areacuadrado = cuadrado1.calcularArea();
                    double perimetrocuadrado = cuadrado1.calcularPerimetro();
                    double areatriangulo = triangulo1.calcularArea();
                    double perimetrotriangulo = triangulo1.calcularPerimetro();   
                    String tipotriangulo = triangulo1.determinarTipoTriangulo();
                    
                    mostrarInformacion(areacirculo,perimetrocirculo,arearectangulo,perimetrorectangulo,areacuadrado,perimetrocuadrado,areatriangulo,perimetrotriangulo,tipotriangulo);
                }
            }
        );        
    }
public static void mostrarInformacion(double areacirculo,double perimetrocirculo,double arearectangulo,double perimetrorectangulo,double areacuadrado,double perimetrocuadrado,double areatriangulo,double perimetrotriangulo,String tipotriangulo){
    String mensaje ="El área del círculo es: "+areacirculo+"\n"
            +"El perímetro del círculo es: "+perimetrocirculo+"\n\n"
            +"El área del rectángulo es: "+arearectangulo+"\n"
            +"El perímetro del rectángulo es: "+perimetrorectangulo+"\n\n"
            +"El área del cuadrado es: " +areacuadrado+"\n"
            +"El perímetro del cuadrado es: "+perimetrocuadrado+"\n\n"
            +"El área del triángulo es: "+areatriangulo+"\n"
            +"El perímetro del triángulo es: "+perimetrotriangulo+"\n"
            +tipotriangulo;       
            
    JOptionPane.showMessageDialog(null, mensaje);
}
}