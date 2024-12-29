package vazquez_anahi.conversiones;

import javax.swing.JOptionPane;

public class Moneda {
    //Atributos
    float cant;
    double dol, eu, yen, lib, quet;
    
    //Metodos
    public void LeerNumeros(){
        cant=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
    }    
    
    //Metodo para dolares 
    public void Dolares(){
        dol=cant*0.050;
    }  
    
    //Metodo para euros 
    public void Euros(){
        eu = cant * 0.050;
    }    
    
    //Metodo para yenes 
    public void Yenes(){
        yen = cant * 7.45;
    } 

    //Metodo para libras 
    public void Libras(){
        lib = cant * 0.044;
    } 

    //Metodo para quetzales 
    public void Quetzales(){
        quet = cant * 0.39;
    }     
    
    //Metodo para mostrar los resultados
    public void VerResultados(){
        System.out.println("\nCONVERSIONES DE MONEDAS:");
        System.out.println("Dolares = "+dol+"\nEuros = "+eu+"\nYenes = "+yen+"\nLibras = "+lib+"\nQuetzales = "+quet);
    } 
}
