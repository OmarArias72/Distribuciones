/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraDistribuciones {
    public CalculadoraDistribuciones(){
        // Crear un marco principal
        JFrame frame = new JFrame("Calculadora de Distribuciones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Etiqueta de instrucciones
        JLabel instructionsLabel = new JLabel("Selecciona una opción:");
        frame.add(instructionsLabel, BorderLayout.NORTH);

        // Panel para botones
        JPanel buttonPanel = new JPanel();
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Botón para Variables Discretas
        JButton discreteButton = new JButton("Variables Discretas");
        buttonPanel.add(discreteButton);

        // Botón para Variables Continuas
        JButton continuousButton = new JButton("Variables Continuas");
        buttonPanel.add(continuousButton);

        // Acción para el botón de Variables Discretas
        discreteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDiscreteDialog();
            }
        });

        // Acción para el botón de Variables Continuas
        continuousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createContinuousDialog();
            }
        });
        // Mostrar el marco principal
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        CalculadoraDistribuciones pantalla1 = new CalculadoraDistribuciones();
        

        
    }

    private static void createDiscreteDialog() {
        // Crear un diálogo para Variables Discretas
        JDialog discreteDialog = new JDialog();
        discreteDialog.setTitle("Variables Discretas");
        discreteDialog.setSize(400, 300);
        discreteDialog.setLayout(new GridLayout(4, 2));

        // Agregar etiquetas y campos de texto
        JLabel label1 = new JLabel("Valor 1:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Valor 2:");
        JTextField textField2 = new JTextField(10);

        discreteDialog.add(label1);
        discreteDialog.add(textField1);
        discreteDialog.add(label2);
        discreteDialog.add(textField2);

        // Botón de calcular
        JButton calculateButton = new JButton("Calcular");
        JTextArea resultTextArea = new JTextArea(5, 20);

        // Acción para el botón de calcular
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementa la lógica de cálculo aquí
                // Puedes usar los valores de textField1 y textField2
                // para realizar cálculos y mostrar resultados en resultTextArea
                resultTextArea.setText("Resultado: ");
            }
        });

        discreteDialog.add(calculateButton);
        discreteDialog.add(resultTextArea);

        discreteDialog.setVisible(true);
    }

    private static void createContinuousDialog() {
        // Crear un diálogo para Variables Continuas (similar a createDiscreteDialog)
    }
}
