
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
public class Pantalla {

    private JFrame ventana1;
    private JLabel etiqueta1;
    private JButton variableDiscreta;
//    private JButton variableContinua;
    private JButton distribucionBinomial;
    private JButton distribucionHiperGeometrica;
    private JButton distribucionPoisson;
    private JButton volverMenu;
    private DistribucionBinomialGUI pantalla2;
    private DistribucionHipergeometricaGUI pantalla3;

    public Pantalla() {
        ventana1 = new JFrame("Calculadora Distribuciones");
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setSize(500, 300);

        // Establecer el BorderLayout para el JFrame
        ventana1.setLayout(new BorderLayout());

        // Agregar la etiqueta al norte (parte superior)
        etiqueta1 = new JLabel("Haga click en una opcion");
        ventana1.add(etiqueta1, BorderLayout.NORTH);

        // Crear un panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Iniciar los botones
        variableDiscreta = new JButton("Variable Discreta");
//        variableContinua = new JButton("Variable Continua");
        volverMenu = new JButton("Regresar Inicio");

        // Agregar los botones al panel
        buttonPanel.add(variableDiscreta);
//        buttonPanel.add(variableContinua);
        buttonPanel.add(volverMenu);
        distribucionBinomial = new JButton("Distribucion Binomial");
        distribucionHiperGeometrica = new JButton("Distribucion Hipergeometrica");
        distribucionPoisson = new JButton("Distribucion Poisson");

        // Agregar el panel con los botones al centro
        ventana1.add(buttonPanel, BorderLayout.CENTER);
        volverMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Elimina los botones de distribuciones si existen
                if (distribucionBinomial != null) {
                    buttonPanel.remove(distribucionBinomial);
                    buttonPanel.remove(distribucionHiperGeometrica);
                    buttonPanel.remove(distribucionPoisson);
                    // Establece los botones de Variable Discreta y Variable Continua nuevamente
                    buttonPanel.add(variableDiscreta);
//                    buttonPanel.add(variableContinua);
                    // Refresca el panel
                    buttonPanel.revalidate();
                    buttonPanel.repaint();
                }
            }
        });

        variableDiscreta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Elimina los botones previos si existen
                buttonPanel.remove(variableDiscreta);
//                buttonPanel.remove(variableContinua);
//                buttonPanel.remove(distribucionPoisson);

                // Crea los nuevos botones
                

                // Agrega los nuevos botones al panel
                buttonPanel.add(distribucionBinomial);
                buttonPanel.add(distribucionHiperGeometrica);
                buttonPanel.add(distribucionPoisson);

                // Refresca el panel
                buttonPanel.revalidate();
                buttonPanel.repaint();
            }
        });
        distribucionBinomial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                ventana1.dispose();
                pantalla2 = new DistribucionBinomialGUI();
            }
        });
        
        distribucionHiperGeometrica.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla3 = new DistribucionHipergeometricaGUI();
            }
            
        });

        ventana1.setVisible(true);
    }
    
    
    
    
}
