package vazquez_anahi.empresa_agroalimentaria;

public class Empresa_Agroalimentaria {

    public static void main(String[] args) {
        //declaracion de objeto
        Frescos pfresco = new Frescos("06/11/2022", "México", "15/03/2030", 12);       
        Refrigerados prefrigerado = new Refrigerados("123A", "10/10/2010", "35 Grados Celsius", "Francia", "10/10/2020", 5);
        Congelados pcongelado = new Congelados("05/03/2003", "Alemania", "12 Grados Celsius", "05/03/2023", 15);
        
        //mostrar datos
        System.out.println("EMPRESA AGROALIMENTARIA");
        pfresco.DatosFrescos();
        prefrigerado.DatosRefrigerados();
        pcongelado.DatosCongelados();  
    }
}
/*
Se desea desarrollar un programa que permita la gestion de una empresa agroalimentaria que trabaja con 3 tipos de productos:
productos frescos, productos refrigerados y productos congelados. 
Todos los productos llevan esta información común:
    *fecha de caducidad 
    *número de lote.
A su vez, cada tipo de producto lleva alguna información específica. 
Los productos frescos:
        *fecha de envasado
        *país de origen
Los productos refrigerados 
        *código de organismo de supervisión alimentaria
        *fecha de envasado
        *la temperatura de mantenimiento recomendada    
        *país de origen
los productos congelados    
        *fecha de envasado
        *pais de origen 
        *temperatura de mantenimiento recomendada 
*/