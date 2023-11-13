
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
public class DistribucionBinomial {
    int n;
    double p;
    int [] probabilidadVariableAleatoria;
    double resultadoBinomial=0;
    
    
    
//    public void entrada2(String variableAleatoriaRango){
//        int numero;
//        String temp;
//        if(variableAleatoriaRango.length()==3 || variableAleatoriaRango.length()==1 ||variableAleatoriaRango.length()==2){
//            if(variableAleatoriaRango.length()==3 && variableAleatoriaRango.charAt(0)=='<' &&variableAleatoriaRango.charAt(1)=='='){
//                temp=variableAleatoriaRango.substring(2, 3);
//                System.out.println(temp);
//                numero=Integer.parseInt(temp);
//                if(numero<0){
//                    return;
//                }
//                probabilidadVariableAleatoria = new int[numero+1];
//                for(int i=0;i<probabilidadVariableAleatoria.length;i++){
//                    probabilidadVariableAleatoria[i]=i;
//                }
//                
//            } else if(variableAleatoriaRango.length()==2 && variableAleatoriaRango.charAt(0)=='<'){
//                temp=variableAleatoriaRango.substring(1, 2);
//                numero=Integer.parseInt(temp);
//                if(numero<0){
//                    return;
//                }
//                probabilidadVariableAleatoria = new int[numero];
//                for(int i=0;i<probabilidadVariableAleatoria.length;i++){
//                    probabilidadVariableAleatoria[i]=i;
//                }
//            } else if(variableAleatoriaRango.length()==1 || variableAleatoriaRango.length()>=2){
//                numero=Integer.parseInt(variableAleatoriaRango);
//                if(numero < 0) {
//                    return;
//                }
//                probabilidadVariableAleatoria = new int[1];
//                probabilidadVariableAleatoria[0] = numero;
//                
//            } else if(variableAleatoriaRango.length()==3 && variableAleatoriaRango.charAt(0)=='>'&&variableAleatoriaRango.charAt(1)=='='){
//                temp=variableAleatoriaRango.substring(2, 3);
//                numero=Integer.parseInt(temp);
////                if(numero == 0) {
////                    return;
////                }
//                numero=numero-1;
//                
//                if(numero==0){
//                    probabilidadVariableAleatoria = new int[numero+1];
//                    probabilidadVariableAleatoria[0]=0;
//                    return;
//                }
//                probabilidadVariableAleatoria = new int[numero+1];
//                for(int i=0;i<probabilidadVariableAleatoria.length;i++){
//                    probabilidadVariableAleatoria[i]=i;
//                }
//            } else if (variableAleatoriaRango.length() == 2 && variableAleatoriaRango.charAt(0) == '>') {
//                temp = variableAleatoriaRango.substring(1, 2);
//                numero = Integer.parseInt(temp);
//                if (numero == 1) {
//                    probabilidadVariableAleatoria = new int[numero + 1];
//                    for (int i = 0; i < probabilidadVariableAleatoria.length; i++) {
//                        probabilidadVariableAleatoria[i] = i;
//                    }
//                    return;
//                }
//            }
//        }
//    }
    
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
    
    
    public void calcularDistribucion(int a){
//        int nFacto=1;
//        int x1Facto=1;
//        int xFacto=1;
//        double resultFacto;
        double probabilidadExito2;
        //Calculo de Factorial de la variable n!
//        for (int i = 1; i <= n; i++) {
//                nFacto *= i;
//            }
        
        BigInteger nFacto=Factorial(n);
        
        //Calculo de Factorial de la variable aleatoria (n-X)!
//        for(int i=1;i<=n-a;i++){
//            x1Facto *=i;
//        }
        
        BigInteger x1Facto=Factorial(n-a);
        //Calculo de Factorial de la variable aleatoria X!
        BigInteger XFacto=Factorial(a);
        
//        if (a == 0) {
//            xFacto = 1;
//        } else {
//            for (int i = 1; i <= a; i++) {
//                xFacto *= i;
//            }
//        }
        
        //calculo de (n!)/X!(n-X)!
        BigInteger X2Facto = XFacto.multiply(x1Facto);
        BigInteger X3Facto = nFacto.divide(X2Facto);
//        resultFacto=nFacto/(xFacto*x1Facto);
        
        //calculo de (1-p)^n-x
        probabilidadExito2=Math.pow(1-p,n-a);
        //operacion final
//        resultadoBinomial +=resultFacto*probabilidadExito2*(Math.pow(p,a));
        
        resultadoBinomial +=X3Facto.doubleValue()*probabilidadExito2*(Math.pow(p,a));
        
    }
    public void mandarDatosAMetodoCalculo(){
        int numeroTemporal;
        for(int i=0;i<probabilidadVariableAleatoria.length;i++){
            numeroTemporal=probabilidadVariableAleatoria[i];
            calcularDistribucion(numeroTemporal);
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
    public void salida(){
        System.out.println("Numero de ensayos: "+n);
        System.out.println("Probabilidad de p: "+p);
        if(probabilidadVariableAleatoria.length==0){
            System.out.println("No ingreso un valor de la variable aleatoria");
        }else if(probabilidadVariableAleatoria.length>0){
            System.out.print("Probabilidad aleatoria: ");
            for(int i=0;i<probabilidadVariableAleatoria.length;i++){
                System.out.print(probabilidadVariableAleatoria[i]+ " ");
            }
        } else if(probabilidadVariableAleatoria==null){
            System.out.println("No existe");
        }
        System.out.println("\nEl resultado es: "+resultadoBinomial);
    }
}
