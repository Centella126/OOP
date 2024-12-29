package vazquez_anahi.parametros;

import javax.swing.JOptionPane;

public class Empleados {
    //Atributos
    private String nombre;
    private double sueldo;
    private char categoria;
    
    //Métodos
    //Método sin retorno de valor y sin parámetros
    public void calculosueldo(){
        switch (getCategoria()){
            case 'A': 
                setSueldo(500);
                break;
            
            case 'B':
                setSueldo(400);
                break;
                
            case 'C':
                setSueldo(300);
                break;
        }
    }
    
    //Método sin retorno de valor, pero con parámetros
    public void puesto(String p){
        JOptionPane.showMessageDialog(null,"El puesto del empleado es: \n"+p);
    }
    
    //Método con retorno de valor, y sin parámetros
    public String mensaje(){
        String msj;
        msj = "\nLa empleada: "+getNombre()+"\ntiene un puesto de categoría: "+getCategoria()+"\ncon un sueldo de: "+getSueldo();
        return msj;
    }
    
    //Método con retorno de valo, pero con parámetros
    public double calculopromedio(int w, int x, int y, int z){
        double promedio;
        promedio = (w+x+y+z)/4;
        return promedio;
    }
    
    //Encapsulamiento de datos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
}
