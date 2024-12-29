package vazquez_anahi.metodosgetyset;

import javax.swing.JOptionPane;

public class Metodos {
    //Atributos
    private boolean bandera;
    private int n;
    private double fac;
    
    //Constructor 
    public Metodos(int n) {
        this.n = n;
    }

    //Método setter
    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setFac(double fac) {
        this.fac = fac;
    }

    //Método getter
    
    public boolean isBandera() {
        return bandera;
    }
    

    public int getN() {
        return n;
    }

    public double getFac() {
        return fac;
    }
    
    
    //Método números primos
    public void primo(int n){
        int modulo, i;     
        
        JOptionPane.showInternalMessageDialog(null,"¿PRIMO?");
        if(n==1 || n==2){
            setBandera(true);
            JOptionPane.showInternalMessageDialog(null,"\nVerdadero");            
        }
        else{
            for(i=2; i<n; i++){
                modulo=n%i;
                if((modulo==0)){
                    setBandera(false);
                    JOptionPane.showInternalMessageDialog(null,"\nFalso");
                    i=n;//Para truncar el for
                }            
                else{
                    setBandera(true);
                    JOptionPane.showInternalMessageDialog(null,"\nVerdadero");
                    i=n;
                }
            }            
        }
    }    
    

    //Método para factorial
    public void factorial(int n){
        int i;
        setFac(1);
        
        for (i=1; i<=n; i++){
            fac=fac*i;
        }   
        
        JOptionPane.showInternalMessageDialog(null,"\nEl factorial de "+n+" es: "+getFac());
    }
    
    
    //Método número de cifras
    public void cifras(int n){
        if(n<10){
            JOptionPane.showInternalMessageDialog(null,"Es un numero de 1 cifra");
        }
        if(n>=10 && n<100){
            JOptionPane.showInternalMessageDialog(null,"Es un numero de 2 cifras");
        }
        if(n>=100 && n<1000){
            JOptionPane.showInternalMessageDialog(null,"Es un numero de 3 cifras");
        }
        if(n>=1000 && n<10000){
            JOptionPane.showInternalMessageDialog(null,"Es un numero de 4 cifras");
        }
    }    
}
