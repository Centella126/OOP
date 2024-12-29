package vazquez_anahi.empresa;

public class Persona {
    //Atributos
    private String Nombre;
    private String Apellidos;
    private String Curp;
    private int edad;
    
    //Constructor
    public Persona(String Nombre, String Apellidos, String Curp, int edad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Curp = Curp;
        this.edad = edad;
    }
    
    //Getter para obtener valores
    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getCurp() {
        return Curp;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
}
