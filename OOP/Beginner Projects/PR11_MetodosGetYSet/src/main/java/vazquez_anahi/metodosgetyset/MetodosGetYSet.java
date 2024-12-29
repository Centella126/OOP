package vazquez_anahi.metodosgetyset;

import javax.swing.JOptionPane;

public class MetodosGetYSet {

    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));                
        
        Metodos num = new Metodos(numero);

        //Asignación de valores  
        num.primo(numero);
        num.factorial(numero);
        num.cifras(numero);
    }
}
