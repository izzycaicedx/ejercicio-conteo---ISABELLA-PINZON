
import pk01.Conteo;
import javax.swing.*;
public class Principal {

    public static void main(String[] args) {
        Conteo contar = new Conteo();
        contar.setPalabra(JOptionPane.showInputDialog("Digite la palabra"));
        contar.calcularPalabra();

        JOptionPane.showMessageDialog(null, "Vocales: " + contar.getNumeroVocal() + "\n Consonantes: " + contar.getNumeroConsonantes());
 
    }
}

