package vazquez_anahi.empresa;

public class Trabajador extends Persona { //AL PONER EXTENDS SE APLICA LA HERENCIA
    //Atributos
    private String direccion;
    private String RFC;
    private int sueldo;
    
    //Constructor
    public Trabajador(String direccion, String RFC, int sueldo, String Nombre, String Apellidos, String Curp, int edad) {
        super(Nombre, Apellidos, Curp, edad);  //ES LA HERENCIA
        this.direccion = direccion;
        this.RFC = RFC;
        this.sueldo = sueldo;
    }

    public void mostarDatos(){
        System.out.println("HERENCIA DE DATOS");
        System.out.println("\nNombre: "+getNombre()+"\nApellidos: "+getApellidos()+"\nCURP: "+getCurp()+"\nEdad: "+getEdad()+"\nDirección: "+direccion+"\nRFC: "+RFC+"\nSueldo: "+sueldo);
    }
    
}
