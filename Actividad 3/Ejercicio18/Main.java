package Ejercicio18;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

    public static void main (String[] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel codelabel = new JLabel("Codigo");
        codelabel.setBounds(10,20,80,25);
        panel.add(codelabel);

        JTextField codeText = new JTextField();
        codeText.setBounds(100,20,165,25);
        panel.add(codeText);

        JLabel namelabel = new JLabel("Nombre");
        namelabel.setBounds(10,50,80,25);
        panel.add(namelabel);

        JTextField nameText = new JTextField();
        nameText.setBounds(100,50,165,25);
        panel.add(nameText);

        JLabel numhlabel = new JLabel("N° horas");
        numhlabel.setBounds(10,90,80,25);
        panel.add(numhlabel);

        JTextField numhText = new JTextField();
        numhText.setBounds(100,90,165,25);
        panel.add(numhText);

        JLabel valorhlabel = new JLabel("Valor hora");
        valorhlabel.setBounds(10,130,80,25);
        panel.add(valorhlabel);

        JTextField valorhText = new JTextField();
        valorhText.setBounds(100,130,165,25);
        panel.add(valorhText);

        JLabel retencionlabel = new JLabel("% Retención");
        retencionlabel.setBounds(10,170,80,25);
        panel.add(retencionlabel);

        JTextField retencionText = new JTextField();
        retencionText.setBounds(100,170,165,25);
        panel.add(retencionText);

        JButton calculateButton = new JButton("Mostrar");
        calculateButton.setBounds(10, 210, 100, 25);
        panel.add(calculateButton);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String codigo = codeText.getText();
                String nombre = nameText.getText();
                double numHoras = Double.parseDouble(numhText.getText());
                double valorHora = Double.parseDouble(valorhText.getText());
                double retencion = Double.parseDouble(retencionText.getText());
                double salarioBruto = SalarioBruto.calcularSalarioBruto(numHoras, valorHora);
                double salarioNeto = SalarioNeto.calcularSalarioNeto(salarioBruto, retencion);
                mostrarInformacionEmpleado(codigo, nombre, salarioBruto, salarioNeto);
            }
        });
    }

    public static void mostrarInformacionEmpleado(String codigo, String nombre, double salarioBruto, double salarioNeto) {
        String mensaje = "Codigo: " + codigo + "\n"
                + "Nombre: " + nombre + "\n"
                + "Salario Bruto: " + salarioBruto + "\n"
                + "Salario Neto: " + salarioNeto;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

