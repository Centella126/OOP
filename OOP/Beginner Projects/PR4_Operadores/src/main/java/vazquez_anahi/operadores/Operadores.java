/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vazquez_anahi.operadores;

import java.util.Scanner;

/**
 *
 * @author Anahi Monserrat
 */
public class Operadores {

 public static void main(String[] args) 
    {
        int num1, num2, op;
        Scanner sc=new Scanner(System.in);  //es un objeto para leer
        
        System.out.println("Introduce un dato: "); 
        num1=sc.nextInt( );
        System.out.println("Introduce un dato: "); 
        num2=sc.nextInt( ); //es como el cin
        
        System.out.println("[1] Operadores aritméticos");
        System.out.println("[2] Operadores lógicos");
        System.out.println("[3] Operadores relacionales");
        System.out.println("Elije una opción");
        op=sc.nextInt( );
        
        switch(op){
            case 1 -> {
                System.out.println("OPERADORES ARITMÉTICOS");
                System.out.println(("El resultado de la suma es: ") + (num1+num2));
                System.out.println(("El resultado de la resta es: ") + (num1-num2));
                System.out.println(("El resultado de la multiplicación es: ") + (num1*num2));
                System.out.println(("El resultado de la división es: ") + (num1/num2));
                System.out.println(("El resultado del módulo es: ") + (num1%num2));
         }
                
            case 2 -> {
                System.out.println("OPERADORES LÓGICOS");  
                if(num1>0 && num2>0){
                    System.out.println((num1) + " y " + (num2) + " son mayores que cero.");
                }
                if(num1>0 || num2>0){
                    System.out.println("Alguno de los números son mayores que cero");
                }
         }
                
            case 3 -> {
                System.out.println("OPERADORES RELACIONALES");
                if(num1>num2){
                    System.out.println(("El número ")+(num1)+(" es el número mayor"));
                }
                if(num1<num2){
                    System.out.println(("El número ")+(num2)+(" es el número mayor"));
                }
                if(num1>=num2){
                    System.out.println(("El número ")+(num1)+(" es mayor que ")+(num2));
                }
                if(num1<=num2){
                    System.out.println(("El número ")+(num2)+(" es mayor que ")+(num1));
                }
                if(num1==num2){
                    System.out.println((num1) + " y " + (num2) + " son iguales.");
                }
                if(num1!=num2){
                    System.out.println((num1) + " y " + (num2) + " son diferentes.");
                }
         }
                
            default -> System.out.println("Opción incorrecta");          
        }                                    
    }
}
