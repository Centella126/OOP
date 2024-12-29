package vazquez_anahi.empresa_agroalimentaria;

public class Refrigerados extends Productos{
    //Atributos
    private String codigo;
    private String fecha_envasado;
    private String temperatura;
    private String pais;
    
    //constructor
    public Refrigerados(String codigo, String fecha_envasado, String temperatura, String pais, String caducidad, int lote) {
        super(caducidad, lote);
        this.codigo = codigo;
        this.fecha_envasado = fecha_envasado;
        this.temperatura = temperatura;
        this.pais = pais;
    }
   
    public void DatosRefrigerados() {
        System.out.println("\nProductos Refrigerados");
        System.out.println("\nCódigo de organismo de supervisión alimentaria: "+codigo+"\nFecha de envasado: "+fecha_envasado+"\nTemperatura de mantenimiento recomendada: "+temperatura+"\nPaís: "+pais+"\nFecha caducidad: "+getCaducidad()+"\nNúmero de lote: "+getLote());
    }    
}
