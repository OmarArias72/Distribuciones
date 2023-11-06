
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
    
    public void entrada(){
        String variableAleatoriaRango;
        int numero;
        String temp;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de unidades (N): ");
        N=input.nextInt();
        System.out.print("Ingrese la canitdad de unidades que se consideran como exitos (o fracasos R): ");
        R=input.nextInt();
        System.out.print("Ingrese la cantidad de unidades extraidas (n): ");
        n=input.nextInt();
        input.nextLine();
        System.out.print("Ingrese la probabildad de la variable aleatoria: ");
        variableAleatoriaRango=input.nextLine();
        if(variableAleatoriaRango.length()==3 || variableAleatoriaRango.length()==1 ||variableAleatoriaRango.length()==2){
            if((variableAleatoriaRango.length()==3 ||variableAleatoriaRango.length()>=3)&& variableAleatoriaRango.charAt(0)=='<' &&variableAleatoriaRango.charAt(1)=='='){
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
                    probabilidadVariableAleatoria=null;
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
    
    
    public void mandarDatosAMetodoCalculo(){
        int numeroTemporal;
        for(int i=0;i<probabilidadVariableAleatoria.length;i++){
            numeroTemporal=probabilidadVariableAleatoria[i];
            calcularDistribucionHipergeomretica(numeroTemporal);
        }
    }
    
    public void calcularDistribucionHipergeomretica(int a){
        double resultFacto1, resultFacto2, resultFacto3;
       
        //Combinacion de R y x
        long RFacto=1;
        long XFacto1=1;
        int XFacto2=R-a;
        long XFacto21=1;
        
        for(int i=1;i<=R;i++){
            RFacto *=i;
        }
        for(int i=1;i<=a;i++){
            XFacto1 *=i;
        }
        if (XFacto2 == 0) {
            XFacto21 = 1;
        } else {
            for (int i = 1; i <= XFacto2; i++) {
                XFacto21 *= i;
            }
        }

        resultFacto1 = RFacto / (XFacto1 * XFacto21);

        
        //Combinacion de N y n
        long FactoN=1;
        long nFacto1=1;
        long nFacto2;
        int nFacto3=N-n;
        
        for(int i=1;i<=N;i++){
            FactoN *= i;
        }
        if (n == 0) {
            nFacto1 = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                nFacto1 *= i;
            }
        }
        
//        System.out.println("Valor de N-n (antes de facotrial: "+nFacto3);
        if(nFacto3==0){
            nFacto2 = 1;
        } else{
            nFacto2 = 1;
            for (int i = 1; i <= N-n; i++) {
                nFacto2 *= i;
            }
        }

//        System.out.println("Factorial de n: "+nFacto1);
//        System.out.println("Factorial de N-n: "+nFacto2);
        resultFacto2=FactoN/(nFacto1*nFacto2);
        
        //Combinacion de N-R y n-x
        int FactoN2=N-R;
        int Facton2=n-a;
//        int FactoNn=FactoN2-Facton2;
        long FactoN3=1;
        long Facton3=1;
        long Facton4=1;
        
        for(int i=1;i<=FactoN2;i++){
            FactoN3 *=i;
        }
        for(int i=1;i<=Facton2;i++){
            Facton3 *=i;
        }
        if(n-a<0){
            resultadoHipergeometrica +=0;
            return;
        }
        for(int i=1;i<=FactoN2-Facton2;i++){
            Facton4 *=i;
        }
        
        resultFacto3=FactoN3/(Facton3*Facton4);
        
        resultadoHipergeometrica +=(resultFacto1*resultFacto3)/resultFacto2;
        
    }
    
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
    }
}
