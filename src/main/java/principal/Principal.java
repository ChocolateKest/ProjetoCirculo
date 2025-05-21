
package principal;

import javax.swing.JOptionPane;
import model.Circulo;


public class Principal {
    
    
    public static void main(String[] args) {
        
        Circulo cir = new Circulo();
        
        cir.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do raio?? ")));
        
        JOptionPane.showMessageDialog(null,"O perimetro deste circulo é: " + cir.getPerimetro());
        
        
    }
}
