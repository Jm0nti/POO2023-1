package Ejercicio40;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel titleLabel = new JLabel("squareCubeApp");
        titleLabel.setBounds(10, 5, 110, 25);
        panel.add(titleLabel);

        JLabel numLabel = new JLabel("Inserte los números separados por un espacio:");
        numLabel.setBounds(10, 25, 400, 25);
        panel.add(numLabel);

        JFormattedTextField numField = new JFormattedTextField(NumberFormat.getNumberInstance());
        numField.setColumns(10);
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

double[] raizNumeros = Raizcuadrada.calcraizCuadrada(numeros);
double[] cuadradoNumeros = Cuadrado.calcCuadrado(numeros);
double[] cuboNumeros = Cubo.calcCubo(numeros);

String[] columnas = {"Numero", "Raíz cuadrada", "Cuadrado", "Cubo"};
Object[][] data = new Object[numeros.length][4];
for (int i = 0; i < numeros.length; i++) {
    data[i][0] = numeros[i];
    data[i][1] = raizNumeros[i];
    data[i][2] = cuadradoNumeros[i];
    data[i][3] = cuboNumeros[i];
}

mostrarInformacion(columnas, data);
            }
        });
    }

    public static void mostrarInformacion(String[] columnas, Object[][] data) {
        JTable table = new JTable(data, columnas);
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        JOptionPane.showMessageDialog(null, panel);
    }
}
