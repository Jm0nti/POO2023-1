package Ejercicio41;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Main {
    public static void main (String[] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel titulolabel = new JLabel("Hallar máximo valor");
        titulolabel.setBounds(10,5,160,25);
        panel.add(titulolabel); 

        JLabel numlabel = new JLabel("Inserte los números separados por un espacio:"); 
        numlabel.setBounds(10,25,400,25);
        panel.add(numlabel); 

        JTextField numField = new JTextField();
        numField.setColumns(25);
        numField.setBounds(10, 50, 180, 30);
        panel.add(numField);

        JButton calculateButton = new JButton("Calcular");
        calculateButton.setBounds(10, 100, 110, 25);
        panel.add(calculateButton);

        frame.setVisible(true);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numString = numField.getText();
                String[] numArray = numString.split(" ");
                double[] numeros = new double[numArray.length];
                for (int i = 0; i < numArray.length; i++) {
                    numeros[i] = Double.parseDouble(numArray[i]);
                }
                double max = Valormax.findMax(numeros);
                mostrarInformacion(max);
            }
        });
    }
    
    public static void mostrarInformacion(double max){
        String mensaje = "El mayor número es:" + "\n" + max;
        JOptionPane.showMessageDialog(null, mensaje); 
    }
}
