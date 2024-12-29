package vazquez_anahi.empresa_agroalimentaria;

public class Congelados extends Productos{
    //Atributos
    private String fecha_envasado;
    private String pais;
    private String temperatura;
    
    //constructor
    public Congelados(String fecha_envasado, String pais, String temperatura, String caducidad, int lote) {
        super(caducidad, lote);
        this.fecha_envasado = fecha_envasado;
        this.pais = pais;
        this.temperatura = temperatura;
    }
   
    public void DatosCongelados() {
        System.out.println("\nProductos Congelados");
        System.out.println("\nFecha de envasado: "+fecha_envasado+"\nPaís: "+pais+"\nTemperatura de mantenimiento recomendada: "+temperatura+"\nFecha caducidad: "+getCaducidad()+"\nNúmero de lote: "+getLote());
    }      
}
