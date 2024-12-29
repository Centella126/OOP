/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vazquez_anahi.operaciones_basicas;

import java.util.Scanner;

/**
 *
 * @author Anahi Monserrat
 */
public class Operaciones_basicas {

    public static void main(String[] args) 
    {
        int num1, num2;
        Scanner sc=new Scanner(System.in);  //es un objeto para leer
        
        
        System.out.println("OPERACIONES BÁSICAS");
        
        System.out.println("Introduce un dato: "); 
        num1=sc.nextInt( );
        System.out.println("Introduce un dato: "); 
        num2=sc.nextInt( ); //es como el cin
        
        System.out.println(("El resultado de la suma es: ") + (num1+num2));
        System.out.println(("El resultado de la resta es: ") + (num1-num2));
        System.out.println(("El resultado de la multiplicación es: ") + (num1*num2));
        System.out.println(("El resultado de la división es: ") + (num1/num2));
        System.out.println(("El resultado del módulo es: ") + (num1%num2));
    }
}
