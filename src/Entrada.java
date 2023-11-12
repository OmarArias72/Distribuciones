/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Entrada {
   int [] probabilidadVariableAleatoria;
    
    
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
    
    

    public void salida(){
        
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
        
    }

    
}
