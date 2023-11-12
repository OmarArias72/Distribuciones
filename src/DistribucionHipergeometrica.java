
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class DistribucionHipergeometrica {
    int N; //Cantidad de unidades
    int R; //Representa las unidades clasificadas como exito
    int n; //cantidad de unidades extraidas
    int [] probabilidadVariableAleatoria;
    double resultadoHipergeometrica=0;
    BigDecimal resultado2=BigDecimal.ZERO;

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
    
    public void mandarDatosAMetodoCalculo(){
        int numeroTemporal;
        for(int i=0;i<probabilidadVariableAleatoria.length;i++){
            numeroTemporal=probabilidadVariableAleatoria[i];
//            calcularDistribucionHiper(numeroTemporal);
            calcularDistribucionHepergeometrica(numeroTemporal);
        }
    }
    
    public void calcularDistribucionHepergeometrica(int x){
        BigInteger factorial1,factorial2,factorial3;
        
        //Combinacion de R y x
        BigInteger RFacto=Factorial(R);
        BigInteger XFacto=Factorial(x);
        BigInteger X1Facto=Factorial(R-x);
        BigInteger result1=XFacto.multiply(X1Facto);
        
        factorial1=RFacto.divide(result1);
        System.out.println("fActorial1 "+factorial1);
        //Combinacion de N y n
        BigInteger NFacto=Factorial(N);
        BigInteger nFacto=Factorial(n);
        BigInteger n1Facto=Factorial(N-n);
        BigInteger result2=nFacto.multiply(n1Facto);
        
        factorial2=NFacto.divide(result2);
        System.out.println("fActorial2 "+factorial2);
        //Combinacion de N-R y n-x
        BigInteger NRFacto=Factorial(N-R);
        if(NFacto==null){
            return;
        }
        BigInteger nXFacto=Factorial(n-x);
        if(nXFacto==null){
            return;
        }
        BigInteger nX1Facto=Factorial((N-R)-(n-x));
        
        BigInteger result3=nXFacto.multiply(nX1Facto);
        factorial3=NRFacto.divide(result3);
        System.out.println("fActorial3 "+factorial3);
        
        BigInteger result4=factorial1.multiply(factorial3);
        System.out.println("Resultado1: "+result4);
        System.out.println("Resultado2: "+factorial2);
        
        BigDecimal resultFinal1 = new BigDecimal(result4);
        BigDecimal resultFinal2= new BigDecimal(factorial2);
        BigDecimal result5Decimal = resultFinal1.divide(resultFinal2, 50, RoundingMode.HALF_UP);
        
//        BigInteger result5=result4.divide(factorial2);
//        BigDecimal result5Decimal=new BigDecimal(result4.divide(factorial2));
//        System.out.println("Resultado2: "+result5Decimal);
//        BigDecimal result5Decimal = new BigDecimal(result5);
//        resultadoHipergeometrica +=resultadoHipergeometrica.add(result5Decimal);
        resultado2 =resultado2.add(result5Decimal);
        
    }
    public BigInteger Factorial(int a){
        BigInteger resultado=BigInteger.ONE;
        
        if(a==0){
            return resultado;
        }else if(a>0){
            for(int i=1;i<=a;i++){
                resultado =resultado.multiply(BigInteger.valueOf(i));
            }
            return resultado;
        }
        return null;
    }
    
//    public void calcularDistribucionHiper(int x){
//        long resultFacto1, resultFacto2, resultFacto3;
//        
//        //Combinacion de R y x
//        long RFacto=Factorial(R);
//        long XFacto=Factorial(x);
//        long X1Facto=Factorial(R-x);
//        
//        
//        resultFacto1=(RFacto)/(XFacto*X1Facto);
//        
//        //Combinacion de N y n
//        long NFacto=Factorial(N);
//        long nFacto=Factorial(n);
//        long n1Facto=Factorial(N-n);
//        
//        
//        resultFacto2=NFacto/(nFacto*n1Facto);
//        
//        //Combinacion de N-R y n-x
//        long NRFacto=Factorial(N-R);
//        if(NFacto==0){
//            return;
//        }
//        long nXFacto=Factorial(n-x);
//        if(nXFacto==0){
//            return;
//        }
//        int factoNX=(N-R)-(n-x);
//        System.out.println("2. "+factoNX);
//        long nX1Facto=Factorial(factoNX);
//        
//        resultFacto3=(NRFacto)/(nXFacto*nX1Facto);
//        System.out.println("Factorial de R y x "+resultFacto1);
//        System.out.println("Factorial de N y n "+resultFacto2);
//        System.out.println("Factorial de N-R y n-x "+resultFacto3);
//        
//        long result4=resultFacto1*resultFacto3;
//        resultadoHipergeometrica +=result4/resultFacto2;
//
////        resultadoHipergeometrica +=(double)((resultFacto1*resultFacto3)/resultFacto2);
//    }
//    
//    public long Factorial(int a){
//        long result=1;
//        if(a==0){
//            return result;
//        }else{
//            for(int i=1;i<=a;i++){
//                result *=i;
//            }
//            return result;
//        }
//        
//    }
    
    
   
    
    public void Salida(){
        System.out.println("Numero de unidades: "+N);
        System.out.println("Unidades de exito (o fracaso: "+R);
        System.out.println("Unidades extraidas: "+n);
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
        System.out.println("\nEl resultado es: "+resultadoHipergeometrica);
        System.out.println("\nEl resultado es: "+resultado2);
    }
}
