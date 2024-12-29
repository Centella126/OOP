package vazquez_anahi.empresa_agroalimentaria;

public class Frescos extends Productos{
    //Atributos
    private String fecha_envasado;
    private String pais;
    
    //constructor

    public Frescos(String fecha_envasado, String pais, String caducidad, int lote) {
        super(caducidad, lote);
        this.fecha_envasado = fecha_envasado;
        this.pais = pais;
    }
    
    public void DatosFrescos() {
        System.out.println("\nProductos Frescos");
        System.out.println("\nFecha de envasado: "+fecha_envasado+"\nPaís: "+pais+"\nFecha caducidad: "+getCaducidad()+"\nNúmero de lote: "+getLote());
    }
}
