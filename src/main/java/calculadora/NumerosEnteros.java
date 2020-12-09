/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author profesor
 */
public class NumerosEnteros {
    
    int atributo;
    
    public void saludar(){
        System.out.println("Hola");
        this.atributo = 10;
    }
    
    public static int sumar(int a, int b){
        
        return a+b;
    }
    
    public static int restar(int a, int b){
        return a-b;
    }
    
    public static int multiplicar(int a, int b){
        return a*b;
    }
    
    public static int dividir(int a, int b){
        
        if(b == 0){
            System.out.println("Error");
            return 0;
        } else{
            return a*b;
        }
        
        
    }
}
