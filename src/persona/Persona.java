package persona;

import java.time.LocalDate;
public class Persona {

    private int ID;
    private char genero;
    private String nombre, apellido, año_nac, paisNacimiento;

    public Persona(int ID, String nombre, String apellido, String año_nac, String paisNacimiento, char genero) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.año_nac = año_nac;
        this.paisNacimiento = paisNacimiento; // Corrección: inicializa con el valor pasado
        this.genero = genero;
    }

    
    public int calcularEdad() {
        try {
            int añoNacimiento = Integer.parseInt(año_nac);
            int añoActual = LocalDate.now().getYear();
            return añoActual - añoNacimiento;
        } catch (NumberFormatException e) {
            System.err.println("Error: El año de nacimiento no es un número válido.");
            return -1; // Retorna -1 para indicar un error
        }
        
    }

    public void Imprimir() {
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Año nacimiento: " + año_nac);
        System.out.println("Pais de Nacimiento: " + paisNacimiento);
        System.out.println("Genero: " + genero);

        int edad = calcularEdad();
        if (edad != -1) {
            System.out.println("Edad: " + edad);
        }
        
    }
}