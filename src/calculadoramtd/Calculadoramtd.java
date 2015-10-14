/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramtd;

import java.util.Scanner;

/**
 *
 * @author lab
 */
public class Calculadoramtd {
   public static int suma(int num1, int num2) {
     int sumar ;   
    sumar =num1 +num2 ;
       
    return sumar ;  
    }
   public static int resta(int num1, int num2) {
     int resta ;   
    resta =num1- num2 ;
       
    return resta ;  
    }
   public static int multiplicacion(int num1, int num2) {
     int multi ;   
    multi =num1 +num2 ;
       
    return multi ;  
    }
   public static double divicion( double num1, double num2) {
     double divi ;   
    divi = num1/num2 ;
       
    return  divi ;  
    }
 
    public static void menu (){
        System.out.println("menu ");
        System.out.println("elije una opcion");
        System.out.println("sumar 2 numeros ..1");
        System.out.println("restar 2 numeros..2");
        System.out.println("multiplicar 2 numeros..3");
        System.out.println("dividir 2 numeros .....4");
        System.out.println("mostrar mayor de 2 numeros--5");
        System.out.println("calcular potencia de 2 nuemros....6");
        System.out.println("salir.......7");
    
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String opcion ;  
     int num1 , num2 ; 
  
        Scanner entrada = new Scanner(System.in) ; 
    menu();
        System.out.println("Ingrese opcion que desea");  
    
        opcion=entrada.nextLine();
       
       int opc=Integer.parseInt(opcion);
   
       if (opc>0||opc<8) {
        System.out.println("Ingrese  numero 1");
        num1 = entrada.nextInt() ;
        System.out.println("Ingrese  numero 2");
        num2 = entrada.nextInt() ; 
       
        switch (opc) {
       
            case 1 :
                suma(num1, num2) ; 
                System.out.println("" + sumar);
                break;
       
            case 2 :
                resta(num1, num2) ; 
                break;
       
            case 3 :
                multiplicacion(num1, num2) ; 
                break;
       
            case 4 :
                divicion(num1, num2); 
                break;
       
            case 5 :
                break;
        default:
               
    } 
    
        
    }
            
    
    }
}
