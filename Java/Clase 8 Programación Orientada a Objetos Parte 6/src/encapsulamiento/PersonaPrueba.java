package encapsulamiento;

public class PersonaPrueba {
    public static void main(String[] args) {

        // Crear primer objeto de tipo Persona
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("persona1 su nombre es: " + persona1.getNombre());

        // Modificar a través de los métodos
        persona1.setNombre("Juan Ignacio");

        System.out.println("persona1 con su nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());

        //Crear otro objeto de tipo Persona
    
        Persona persona2 = new Persona("María", 85.000, true);

        System.out.println("\n--- Datos iniciales de persona2 ---");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Sueldo: " + persona2.getSueldo());
        System.out.println("¿Está eliminada?: " + persona2.isEliminado());

        // Modificar los valores usando los setters
        persona2.setNombre("Carolina");
        persona2.setSueldo(95.500);
        persona2.setEliminado(false);

        System.out.println("\n--- Datos modificados de persona2 ---");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Sueldo: " + persona2.getSueldo());
        System.out.println("¿Está eliminada?: " + persona2.isEliminado());
    }
}
