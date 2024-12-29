package vazquez_anahi.empresa_agroalimentaria;

public class Productos {
    //atributos
    private String caducidad;
    private int lote;
    
    //constructor
    public Productos(String caducidad, int lote) {
        this.caducidad = caducidad;
        this.lote = lote;
    }

    //Getter para obtener valores
    public String getCaducidad() {
        return caducidad;
    }

    public int getLote() {
        return lote;
    }   
}
