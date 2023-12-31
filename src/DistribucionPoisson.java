
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class DistribucionPoisson {
    double mediaN;
    double p;
    int [] probabilidadVariableAleatoria;
    double resultadoPoisson=0;
    
    public void EntradaPoisson(){
        Scanner input = new Scanner(System.in);
        System.out.print("Media: ");
        mediaN=input.nextDouble();
    }
    
    
    
    public void Entrada(String variableAleatoriaRango){
        int numero;
        String temp;
        if(variableAleatoriaRango.charAt(0) == '<' && variableAleatoriaRango.charAt(1) == '='){
           ParametroMenorIgual(variableAleatoriaRango); 
        }else if(variableAleatoriaRango.charAt(0) == '<'){
            ParametroMenor(variableAleatoriaRango);
        }else if(variableAleatoriaRango.charAt(0) == '>' && variableAleatoriaRango.charAt(1) == '='){
             ParametroMayorIgual(variableAleatoriaRango);
        }else if(variableAleatoriaRango.charAt(0) == '>'){
            ParametroMayor(variableAleatoriaRango);
        }else{
            ParametroSoloNumero(variableAleatoriaRango);
        }
        
    }

    public void ParametroSoloNumero(String variableAleatoriaRango) {
        
        int numero = Integer.parseInt(variableAleatoriaRango);
        if (numero < 0) {
            return;
        }
        probabilidadVariableAleatoria = new int[1];
        probabilidadVariableAleatoria[0] = numero;
        System.out.println("Exito");
        
    }

    public void ParametroMenorIgual(String variableAleatoriaRango) {
        int numero;
        String temp;
        
        temp = variableAleatoriaRango.substring(2, variableAleatoriaRango.length());
        System.out.println(temp);
        numero = Integer.parseInt(temp);
        if (numero < 0) {
            return;
        }
        probabilidadVariableAleatoria = new int[numero + 1];
        for (int i = 0; i < probabilidadVariableAleatoria.length; i++) {
            probabilidadVariableAleatoria[i] = i;
        }
        
    }
    public void ParametroMenor(String variableAleatoriaRango){
        int numero;
        String temp;
        
        temp = variableAleatoriaRango.substring(1, variableAleatoriaRango.length());
        System.out.println(temp);
        numero = Integer.parseInt(temp);
        if (numero < 0) {
            return;
        }
        probabilidadVariableAleatoria = new int[numero];
        for (int i = 0; i < probabilidadVariableAleatoria.length; i++) {
            probabilidadVariableAleatoria[i] = i;
        }
    }

    public void ParametroMayorIgual(String variableAleatoriaRango) {
        int numero;
        String temp;

        temp = variableAleatoriaRango.substring(2, variableAleatoriaRango.length());
        System.out.println(temp);
        numero = Integer.parseInt(temp);
        if (numero < 0) {
            return;
        }
        probabilidadVariableAleatoria = new int[numero];
        for (int i = 0; i < probabilidadVariableAleatoria.length; i++) {
            probabilidadVariableAleatoria[i] = i;
        }
    }
    public void ParametroMayor(String variableAleatoriaRango) {
        int numero;
        String temp;

        temp = variableAleatoriaRango.substring(1, variableAleatoriaRango.length());
        System.out.println(temp);
        numero = Integer.parseInt(temp);
        if (numero < 0) {
            return;
        }
        probabilidadVariableAleatoria = new int[numero+1];
        for (int i = 0; i < probabilidadVariableAleatoria.length; i++) {
            probabilidadVariableAleatoria[i] = i;
        }
    }
    
    
    public void mediaEntrada(String n){
        mediaN=Double.parseDouble(n);
        
    }
    
    public void mandarDatosAMetodoCalculo(){
        int numeroTemporal;
        double exponencialNegativo=1/Math.exp(mediaN);
        BigInteger factorialX;
        for(int i=0;i<probabilidadVariableAleatoria.length;i++){
            numeroTemporal=probabilidadVariableAleatoria[i];
            System.out.println(numeroTemporal);
            factorialX=Factorial(numeroTemporal);
            resultadoPoisson +=exponencialNegativo*((Math.pow(mediaN,numeroTemporal)/factorialX.doubleValue()));
            
        }
    }
    public BigInteger Factorial(int x){
        BigInteger resultado=BigInteger.ONE;
        if(x==0){
            return resultado;
        }else{
            for(int i=1;i<=x;i++){
                resultado=resultado.multiply(BigInteger.valueOf(i));
            }
            return resultado;
        }
    }
    
    public void Salida(){
        System.out.println("El resultado es: "+resultadoPoisson);
    }
    
    public void CalcularN(){
        
    }
    
}
