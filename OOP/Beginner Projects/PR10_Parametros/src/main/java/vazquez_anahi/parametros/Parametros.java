package vazquez_anahi.parametros;

import javax.swing.JOptionPane;

public class Parametros {

    public static void main(String[] args) {
        Empleados empl = new Empleados();
        
        //Asignación de valores al objeto
        empl.setNombre("Rasputia");
        empl.setCategoria('C');
        empl.calculosueldo();
        
        //JOptionPane.showMessageDialog(null, "Su sueldo semanal es: \n" + empl.getSueldo());
        empl.puesto("Gerente");
        
        String opc = empl.mensaje();
        JOptionPane.showInternalMessageDialog(null,"Los datos capturados son: "+opc);
        
        double promedio = empl.calculopromedio(1200, 900, 1500, 1000);
        JOptionPane.showMessageDialog(null,"Su promedio mensual del sueldo: "+promedio);
    }
}

/*
Generar un metodo que nos pida un numero por teclado y se pase como parametro para que nos indique si es un numero primo
tiene que devolver la palabra verdadero, sino que devuelva la palabra falso
Generar un metodo al que se le pase un numero pedido por teclado como parametro que calcule el factorial de dicho numero
Generar un metodo que cuente el numero de cifras de un numero positivo pedido desde teclado 
Generar el metodo que realice esta accion (con o sin parametros, con retorno o sin retorno)

INVESTIGACION UNIDAD 6
*/
