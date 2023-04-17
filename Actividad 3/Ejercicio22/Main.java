package Ejercicio22;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.text.NumberFormat;
import javax.swing.JTextField;

public class Main {
    public static void main (String[] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel titulolabel = new JLabel("App Empleado");
        titulolabel.setBounds(10,5,110,25);
        panel.add(titulolabel); 

        JLabel nombrelabel = new JLabel("Nombre Empleado");
        nombrelabel.setBounds(10,35,110,25);
        panel.add(nombrelabel); 

        JTextField nombreText = new JTextField();
        nombreText.setBounds(130,35,150,25);
        panel.add(nombreText);

        JLabel sallabel = new JLabel("Salario por hora");
        sallabel.setBounds(10,65,110,25);
        panel.add(sallabel);

        JFormattedTextField salText = new JFormattedTextField(NumberFormat.getNumberInstance());
        salText.setValue(null);
        salText.setBounds(130,65,150,25);
        panel.add(salText);

        JLabel nhlabel = new JLabel("N° de horas");
        nhlabel.setBounds(10,100,110,25);
        panel.add(nhlabel);

        JFormattedTextField nhText = new JFormattedTextField(NumberFormat.getNumberInstance());
        nhText.setValue(null);
        nhText.setBounds(130,100,150,25);
        panel.add(nhText);

        JButton calculateButton = new JButton("Mostrar Salario");
        calculateButton.setBounds(10, 150, 150, 25);
        panel.add(calculateButton);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreText.getText();
                double salario_hora = ((Number) salText.getValue()).doubleValue();
                double n_horas = ((Number) nhText.getValue()).intValue();
                double salario = Salario.calcularSalario(salario_hora, n_horas);
                
                if (salario > 450000) {
                    mostrarInformacion(nombre, salario);
                } else {
                    mostrarInformacion(nombre);
                }
            }

        });
        frame.setVisible(true);
    };
        
        public static void mostrarInformacion(String nombre, double salario) {
            String mensaje = "Nombre: " + nombre + "\n"
                    + "Salario: " + salario;
            JOptionPane.showMessageDialog(null, mensaje, "Información Empleado", JOptionPane.INFORMATION_MESSAGE);
        }
        
        public static void mostrarInformacion(String nombre) {
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre, "Información Empleado", JOptionPane.INFORMATION_MESSAGE);
        }}
        



        
