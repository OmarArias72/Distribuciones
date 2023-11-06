
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class DistribucionBinomialGUI {
    private JFrame ventanaDistribucion; 
    private JLabel numeroEnsayos;
    private JLabel probabilidadExtito;
    private JLabel probabilidadVariableAleatoria;
    private JTextField numeroEntero;
    private JTextField probabilidad;
    private JTextField Rango;
    private JButton calcular;
    private JTextArea resultado;
    
    public DistribucionBinomialGUI() {
        ventanaDistribucion = new JFrame("Distribucion Binomial");
        ventanaDistribucion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaDistribucion.setSize(500, 300);
        ventanaDistribucion.setLayout(new BorderLayout());

        // Crear un panel para los componentes en un GridLayout
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        numeroEnsayos = new JLabel("Número de ensayos (n):");
        probabilidadExtito = new JLabel("Probabilidad de éxito (p):");
        probabilidadVariableAleatoria = new JLabel("Variable aleatoria (k):");

        numeroEntero = new JTextField(10);
        probabilidad = new JTextField(10);
        Rango = new JTextField(10);

        calcular = new JButton("Calcular");
        resultado = new JTextArea(5, 20);

        // Agregar componentes al panel
        panel.add(numeroEnsayos);
        panel.add(numeroEntero);
        panel.add(probabilidadExtito);
        panel.add(probabilidad);
        panel.add(probabilidadVariableAleatoria);
        panel.add(Rango);
        panel.add(new JLabel("")); // Espacio en blanco
        panel.add(calcular);
        panel.add(new JLabel("")); // Espacio en blanco
        panel.add(resultado);

        // Agregar el panel al centro de la ventana
        ventanaDistribucion.add(panel, BorderLayout.CENTER);

        // Agregar oyente al botón de cálculo
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DistribucionBinomial op1=new DistribucionBinomial();
                String tempNumber=numeroEntero.getText();
                String tempEnsayos =probabilidad.getText();
                String variableAleatoriaRango=Rango.getText();
                int NumberN=Integer.parseInt(tempNumber);
                op1.n=NumberN;
                double NumberP=Double.parseDouble(tempEnsayos);
                op1.p=NumberP;
                op1.entrada2(variableAleatoriaRango);
                op1.mandarDatosAMetodoCalculo();
                op1.salida();
                
                
                
                

            }
        });

        ventanaDistribucion.setVisible(true);
    }
}
