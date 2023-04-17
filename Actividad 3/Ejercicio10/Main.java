package Ejercicio10;
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

        JLabel numlabel = new JLabel("N° de inscripcion:");
        numlabel.setBounds(10,20,110,25);
        panel.add(numlabel); 

        JTextField numText = new JTextField();
        numText.setBounds(130,20,150,25);
        panel.add(numText);

        JLabel nombreslabel = new JLabel("Nombres");
        nombreslabel.setBounds(10,50,110,25);
        panel.add(nombreslabel); 

        JTextField nombresText = new JTextField();
        nombresText.setBounds(130,50,150,25);
        panel.add(nombresText);

        JLabel patlabel = new JLabel("Patrimonio:");
        patlabel.setBounds(10,80,110,25);
        panel.add(patlabel);

        JFormattedTextField patText = new JFormattedTextField(NumberFormat.getNumberInstance());
        patText.setValue(null);
        patText.setBounds(130,80,150,25);
        panel.add(patText);

        JLabel estlabel = new JLabel("Estrato:");
        estlabel.setBounds(10,110,110,25);
        panel.add(estlabel);

        JFormattedTextField estText = new JFormattedTextField(NumberFormat.getNumberInstance());
        estText.setValue(null);
        estText.setBounds(130,110,150,25);
        panel.add(estText);

        JButton calculateButton = new JButton("Calcular matrícula");
        calculateButton.setBounds(10, 150, 150, 25);
        panel.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String n_inscripcion = numText.getText();
                String nombres = nombresText.getText();
                double patrimonio = ((Number) patText.getValue()).doubleValue();
                double estrato = ((Number) estText.getValue()).intValue();
                double matricula = Matricula.calcularMatricula(patrimonio, estrato);
                String matriculaStr = String.valueOf(matricula);
                mostrarInformacion(n_inscripcion, nombres, matriculaStr);  
            }
        });

        frame.setVisible(true);

}

public static void mostrarInformacion(String n_inscripcion, String nombres, String matricula){
    String mensaje = "N° de inscripcion: " + n_inscripcion + "\n"
    + "Nombre: " + nombres + "\n" 
    + "Matricula: " + matricula;
    JOptionPane.showMessageDialog(null, mensaje, "Información de matrícula", JOptionPane.INFORMATION_MESSAGE);
}}

