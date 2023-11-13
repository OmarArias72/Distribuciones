
import java.awt.BorderLayout;
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
public class DistribucionPoissonGUI {
    private JFrame ventanaPoisson;
    private JButton calcular;
    private JLabel mediaNP;
    private JLabel variableAleatoria;
    private JLabel result;
    private JTextField medNPDatos;
    private JTextField vAleatoriaValor;
    private JTextArea resultado;
    
    
    public DistribucionPoissonGUI(){
        ventanaPoisson = new JFrame("Distribucion Poisson");
        ventanaPoisson.setSize(450, 350);
        ventanaPoisson.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaPoisson.setLayout(new BorderLayout());
        ventanaPoisson.setVisible(true);
        
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        JPanel panelEtiquetas= new JPanel(new GridLayout(0, 1, 10, 0));
        JPanel panelCampos = new JPanel(new GridLayout(0, 1, 20, 10));
        
        mediaNP = new JLabel("Media (np): ");
        variableAleatoria = new JLabel("Variable Aleatoria (X): ");
        result= new JLabel("Resultado: ");
        
        panelEtiquetas.add(mediaNP);
        panelEtiquetas.add(variableAleatoria);
        panelEtiquetas.add(new JLabel(""));
        panelEtiquetas.add(result);
        
        
        
        medNPDatos = new JTextField(10);
        vAleatoriaValor= new JTextField(10);
        calcular = new JButton("Calcular");
        resultado = new JTextArea();
        
        panelCampos.add(medNPDatos);
        panelCampos.add(vAleatoriaValor);
        panelCampos.add(calcular);
        panelCampos.add(resultado);
        
        
        panelPrincipal.add(panelEtiquetas,BorderLayout.WEST);
        panelPrincipal.add(panelCampos,BorderLayout.CENTER);
        ventanaPoisson.add(panelPrincipal);
        
        calcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String datoNp =medNPDatos.getText();
                String variableAleatoria=vAleatoriaValor.getText();
                DistribucionPoisson op3= new DistribucionPoisson();
                op3.Entrada(variableAleatoria);
                op3.mediaEntrada(datoNp);
                op3.mandarDatosAMetodoCalculo();
                resultado.append(String.format("El resultado es: %.6f", op3.resultadoPoisson));
                
            }
            
        });
 
    }
}
