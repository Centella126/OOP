//Programa donde se crea una clase, y se generan objetos con atributos

package vazquez_anahi.motos;

public class Motos {
    //Declaración de atributos
    String marca;
    String modelo;
    String color;
    int cc;
    int km;
    String precio;
    

    //Declaración del main
    public static void main(String[] args) {
        Motos moto1=new Motos();
        Motos moto2=new Motos();
        Motos moto3=new Motos();
        Motos moto4=new Motos();
        Motos moto5=new Motos();
        
        //Asignación de los valores de los atributos 
        moto1.marca="Yamaha";
        moto1.modelo="R6";
        moto1.color="Azul";
        moto1.cc=600;
        moto1.km=0;
        moto1.precio="$230,000";
        
        moto2.marca="BMW";
        moto2.modelo="S 1000RR";
        moto2.color="Rojo";
        moto2.cc=999;
        moto2.km=0;
        moto2.precio="€23,070";
        
        moto3.marca="Ducati";
        moto3.modelo="Multistrada V4 Rally";
        moto3.color="Rojo";
        moto3.cc=1158;
        moto3.km=0;
        moto3.precio="€30,190";
        
        moto4.marca="Honda";
        moto4.modelo="Gold Wing Tour";
        moto4.color="Gris";
        moto4.cc=1833;
        moto4.km=0;
        moto4.precio="€31,190";
        
        moto5.marca="Italika";
        moto5.modelo="Vitalia";
        moto5.color="Azul con blanco";
        moto5.cc=150;
        moto5.km=0;
        moto5.precio="$33,990";
        
        //Imprimir los atributos
        System.out.println("Catálogo de motocicletas\n");
        System.out.println("Moto1");
        System.out.println("Marca: "+moto1.marca);
        System.out.println("Modelo: "+moto1.modelo);
        System.out.println("Color: "+moto1.color);
        System.out.println("Cilindrada: "+moto1.cc);
        System.out.println("Kilometraje: "+moto1.km);
        System.out.println("Precio: "+moto1.precio);
        
        System.out.println("\nMoto2");
        System.out.println("Marca: "+moto2.marca);
        System.out.println("Modelo: "+moto2.modelo);
        System.out.println("Color: "+moto2.color);
        System.out.println("Cilindrada: "+moto2.cc);
        System.out.println("Kilometraje: "+moto2.km);
        System.out.println("Precio: "+moto2.precio);
        
        System.out.println("\nMoto3");
        System.out.println("Marca: "+moto3.marca);
        System.out.println("Modelo: "+moto3.modelo);
        System.out.println("Color: "+moto3.color);
        System.out.println("Cilindrada: "+moto3.cc);
        System.out.println("Kilometraje: "+moto3.km);
        System.out.println("Precio: "+moto3.precio);
        
        System.out.println("\nMoto4");
        System.out.println("Marca: "+moto4.marca);
        System.out.println("Modelo: "+moto4.modelo);
        System.out.println("Color: "+moto4.color);
        System.out.println("Cilindrada: "+moto4.cc);
        System.out.println("Kilometraje: "+moto4.km);
        System.out.println("Precio: "+moto4.precio);
        
        System.out.println("\nMoto5");
        System.out.println("Marca: "+moto5.marca);
        System.out.println("Modelo: "+moto5.modelo);
        System.out.println("Color: "+moto5.color);
        System.out.println("Cilindrada: "+moto5.cc);
        System.out.println("Kilometraje: "+moto5.km);
        System.out.println("Precio: "+moto5.precio);
    }
}
