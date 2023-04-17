package Ejercicio23;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.text.NumberFormat;

public class Main {
    public static void main (String[] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel titulolabel = new JLabel("App Ecuacion");
        titulolabel.setBounds(10,5,110,25);
        panel.add(titulolabel); 

        JLabel Alabel = new JLabel("A");
        Alabel.setBounds(10,35,110,25);
        panel.add(Alabel); 

        JFormattedTextField AText = new JFormattedTextField(NumberFormat.getNumberInstance());
        AText.setValue(null);
        AText.setBounds(50,35,80,25);
        panel.add(AText);

        JLabel Blabel = new JLabel("B");
        Blabel.setBounds(10,65,110,25);
        panel.add(Blabel);

        JFormattedTextField BText = new JFormattedTextField(NumberFormat.getNumberInstance());
        BText.setValue(null);
        BText.setBounds(50,65,80,25);
        panel.add(BText);

        JLabel Clabel = new JLabel("C");
        Clabel.setBounds(10,105,110,25);
        panel.add(Clabel);

        JFormattedTextField CText = new JFormattedTextField(NumberFormat.getNumberInstance());
        CText.setValue(null);
        CText.setBounds(50,105,80,25);
        panel.add(CText);

        JButton calculateButton = new JButton("Solucionar ecuación");
        calculateButton.setBounds(10, 145, 180, 25);
        panel.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double A = ((Number) AText.getValue()).doubleValue();
                double B = ((Number) BText.getValue()).doubleValue();
                double C = ((Number) CText.getValue()).doubleValue();
                String resultado = Raiz.calcularRaiz(A,B,C);
                mostrarInformacion(resultado);
            }
        }); 
        
        frame.setVisible(true);
        }
        
        public static void mostrarInformacion(String resultado){
            String mensaje = resultado;
            JOptionPane.showMessageDialog(null, mensaje, "Soluciones ecuación", JOptionPane.INFORMATION_MESSAGE);
        }}
        




