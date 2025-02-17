package pk01;
import javax.swing.*;
public class Principal {

    public static void main(String[] args) {
        Conteo contar = new Conteo();
        
        try { 
            
        
        contar.setPalabra(JOptionPane.showInputDialog("Digite la palabra"));
        contar.calcularPalabra();

        JOptionPane.showMessageDialog(null, "Vocales: " + contar.getNumeroVocal() + "\n Consonantes: " + contar.getNumeroConsonantes());
  } 
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

