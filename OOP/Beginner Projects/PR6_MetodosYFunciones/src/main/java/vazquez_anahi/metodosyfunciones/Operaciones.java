package vazquez_anahi.metodosyfunciones;

import javax.swing.JOptionPane;

public class Operaciones {
      //ATRIBUTOS
    float num1, num2;
    float suma, resta, multiplicacion, division, modulo;
    
    
    //METODOS   
    //Metodo para solicitar y leer los datos
    public void LeerNumeros(){
        num1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
        num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
    }
    
    //Metodo para sumar los numeros
    public void Sumar(){
        suma = num1 + num2;
    }
    
    //Metodo para restar los numeros
    public void Restar(){
        resta = num1 - num2;
    }
    
    //Metodo para dividir los numeros
    public void Dividir(){
        division = num1 / num2;
    }

    //Metodo para multiplicar los numeros
    public void Multiplicar(){
        multiplicacion = num1 * num2;
    }    
 
    //Metodo para el modulo 
    public void Residuo(){
        modulo = num1 % num2;
    }    
    
    //Metodo para mostrar los resultados
    public void VerResultados(){
        System.out.println("\nOPERACIONES BASICAS POR MEDIO DE METODOS:");
        System.out.println("Suma = "+suma+"\nResta = "+resta+"\nDivision = "+division+"\nMultiplicacion = "+multiplicacion+"\nModulo = "+modulo);
    }   
}
