
package persona;

public class Principal {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona(555001, "Isabella", "Pinzon", "2003", "Colombia", 'F');
        Persona  persona2 = new Persona (44551, "Gabriela", "Pinzon", "2002", "Colombia", 'F');

        System.out.println("Informacion personal de persona1: ");
        persona1.Imprimir();

        System.out.println("\nInformacion personal de persona2: ");
        persona2.Imprimir();
    }
}