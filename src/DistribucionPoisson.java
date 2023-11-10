
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
    
    
    
    public void entrada2(String variableAleatoriaRango){
        int numero;
        String temp;
        if(variableAleatoriaRango.length()==3 || variableAleatoriaRango.length()==1 ||variableAleatoriaRango.length()==2){
            if(variableAleatoriaRango.length()==3 && variableAleatoriaRango.charAt(0)=='<' &&variableAleatoriaRango.charAt(1)=='='){
                temp=variableAleatoriaRango.substring(2, 3);
                System.out.println(temp);
                numero=Integer.parseInt(temp);
                if(numero<0){
                    return;
                }
                probabilidadVariableAleatoria = new int[numero+1];
                for(int i=0;i<probabilidadVariableAleatoria.length;i++){
                    probabilidadVariableAleatoria[i]=i;
                }
                
            } else if(variableAleatoriaRango.length()==2 && variableAleatoriaRango.charAt(0)=='<'){
                temp=variableAleatoriaRango.substring(1, 2);
                numero=Integer.parseInt(temp);
                if(numero<0){
                    return;
                }
                probabilidadVariableAleatoria = new int[numero];
                for(int i=0;i<probabilidadVariableAleatoria.length;i++){
                    probabilidadVariableAleatoria[i]=i;
                }
            } else if(variableAleatoriaRango.length()==1 || variableAleatoriaRango.length()>=2){
                numero=Integer.parseInt(variableAleatoriaRango);
                if(numero < 0) {
                    return;
                }
                probabilidadVariableAleatoria = new int[1];
                probabilidadVariableAleatoria[0] = numero;
                
            } else if(variableAleatoriaRango.length()==3 && variableAleatoriaRango.charAt(0)=='>'&&variableAleatoriaRango.charAt(1)=='='){
                temp=variableAleatoriaRango.substring(2, 3);
                numero=Integer.parseInt(temp);
//                if(numero == 0) {
//                    return;
//                }
                numero=numero-1;
                
                if(numero==0){
                    probabilidadVariableAleatoria = new int[numero+1];
                    probabilidadVariableAleatoria[0]=0;
                    return;
                }
                probabilidadVariableAleatoria = new int[numero+1];
                for(int i=0;i<probabilidadVariableAleatoria.length;i++){
                    probabilidadVariableAleatoria[i]=i;
                }
            } else if (variableAleatoriaRango.length() == 2 && variableAleatoriaRango.charAt(0) == '>') {
                temp = variableAleatoriaRango.substring(1, 2);
                numero = Integer.parseInt(temp);
                if (numero == 1) {
                    probabilidadVariableAleatoria = new int[numero + 1];
                    for (int i = 0; i < probabilidadVariableAleatoria.length; i++) {
                        probabilidadVariableAleatoria[i] = i;
                    }
                    return;
                }
            }
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
