package Ejercicio7;
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
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel Alabel = new JLabel("A:");
        Alabel.setBounds(10,20,80,25);
        panel.add(Alabel);

        JFormattedTextField AText = new JFormattedTextField(NumberFormat.getNumberInstance());
        AText.setValue(null);
        AText.setBounds(100,20,165,25);
        panel.add(AText);

        JLabel Blabel = new JLabel("B:");
        Blabel.setBounds(10,60,80,25);
        panel.add(Blabel);

        JFormattedTextField BText = new JFormattedTextField(NumberFormat.getNumberInstance());
        BText.setValue(null);
        BText.setBounds(100,60,165,25);
        panel.add(BText);

        JButton calculateButton = new JButton("Determinar");
        calculateButton.setBounds(10, 100, 100, 25);
        panel.add(calculateButton);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double A = ((Number) AText.getValue()).doubleValue();
                double B = ((Number) BText.getValue()).doubleValue();
                String mas_menos = Mas_menos.calcularValor(A,B);
                mostrarInformacion(mas_menos);

}
});
}
public static void mostrarInformacion(String mas_menos) {
    String mensaje = mas_menos;
    JOptionPane.showMessageDialog(null, mensaje);
}
}