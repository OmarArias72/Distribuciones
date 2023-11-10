
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
public class DistribucionHipergeometricaGUI {
    private JFrame ventanaDistribuciongeometrica;
    private JLabel numeroUnidadesN;
    private JLabel unidadesExitoR;
    private JLabel unidadesExtraidasn;
    private JLabel probabilidadVariableAleatoria;
    private JLabel Resultado;
    private JTextField numeroEnteroN;
    private JTextField unidadesDeExitoR;
    private JTextField unidadesExtraidas;
    private JTextField probabilidad;
    private JButton calcular;
    private JTextArea resultado;
    
    public DistribucionHipergeometricaGUI() {
        ventanaDistribuciongeometrica = new JFrame("Distribucion HiperGeometrica");
        ventanaDistribuciongeometrica.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaDistribuciongeometrica.setSize(500, 400);
        ventanaDistribuciongeometrica.setLayout(new BorderLayout());
        ventanaDistribuciongeometrica.setVisible(true);

        // Panel principal con BorderLayout
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Panel para las etiquetas (columna 1)
        JPanel panelEtiquetas = new JPanel(new GridLayout(0, 1, 30, 20));
        numeroUnidadesN = new JLabel("Numero de Unidades (N):");
        unidadesExitoR = new JLabel("Unidades Exito(R)");
        unidadesExtraidasn = new JLabel("Unidades Extraidas (n)");
        probabilidadVariableAleatoria = new JLabel("Variable aleatoria(x):");
        Resultado = new JLabel("Resultado:");
        panelEtiquetas.add(numeroUnidadesN);
        panelEtiquetas.add(unidadesExitoR);
        panelEtiquetas.add(unidadesExtraidasn);
        panelEtiquetas.add(probabilidadVariableAleatoria);
        panelEtiquetas.add(new JLabel(""));
        panelEtiquetas.add(Resultado);

        // Panel para los campos de entrada, botón y área de texto (columna 2)
        JPanel panelCampos = new JPanel(new GridLayout(0, 1, 10, 10));
        numeroEnteroN = new JTextField(10);
        unidadesDeExitoR = new JTextField(10);
        unidadesExtraidas = new JTextField(10);
        probabilidad = new JTextField(10);
        calcular = new JButton("Calcular");
        resultado = new JTextArea(5, 20);
        panelCampos.add(numeroEnteroN);
        panelCampos.add(unidadesDeExitoR);
        panelCampos.add(unidadesExtraidas);
        panelCampos.add(probabilidad);
        panelCampos.add(calcular);
        panelCampos.add(resultado);

        // Agregar los paneles al panel principal
        panelPrincipal.add(panelEtiquetas, BorderLayout.WEST);
        panelPrincipal.add(panelCampos, BorderLayout.CENTER);

        // Agregar el panel principal al centro del JFrame
        ventanaDistribuciongeometrica.add(panelPrincipal, BorderLayout.CENTER);
        
        calcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               DistribucionHipergeometrica op2 = new DistribucionHipergeometrica();
               String valorN = numeroEnteroN.getText();
               String valorR = unidadesDeExitoR.getText();
               String valorn = unidadesExtraidas.getText();
               String valorVariableAleatoria = probabilidad.getText();
               
                System.out.println("Valor de N: "+valorN);
                System.out.println("Valor de N: "+valorR);
                System.out.println("Valor de N: "+valorn);
                System.out.println("Valor de N: "+valorVariableAleatoria);
               int N=Integer.parseInt(valorN);
               op2.N=N;
              
               int R=Integer.parseInt(valorR);
               op2.R=R;
               
               int n=Integer.parseInt(valorn);
               op2.n=n;
               
               op2.entrada2(valorVariableAleatoria);
               op2.mandarDatosAMetodoCalculo();
               op2.Salida();
               
               resultado.append(String.format("El resultado es: %.5f", op2.resultado2));
               
               
            }
            
        });
    }
    
}
