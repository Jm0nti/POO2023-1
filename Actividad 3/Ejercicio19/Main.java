package Ejercicio19;
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
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel ladolabel = new JLabel("Lado");
        ladolabel.setBounds(10,20,80,25);
        panel.add(ladolabel);

        JTextField ladoText = new JTextField();
        ladoText.setBounds(100,20,165,25);
        panel.add(ladoText);

        JButton calculateButton = new JButton("Calcular");
        calculateButton.setBounds(10, 60, 100, 25);
        panel.add(calculateButton);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double lado = Double.parseDouble(ladoText.getText());
                double perimetro = Perimetro.calcularPerimetro(lado);
                double area = Area.calcularArea(lado);
                double altura = Altura.calcularAltura(lado);
                mostrarInformacion(altura, area, perimetro); 

}
});
} 

public static void mostrarInformacion(double altura, double area, double perimetro) {
    String mensaje = "Altura: " + altura + "\n"
            + "Area: " + area + "\n"
            + "Perimetro: " + perimetro;
    JOptionPane.showMessageDialog(null, mensaje);
}
}