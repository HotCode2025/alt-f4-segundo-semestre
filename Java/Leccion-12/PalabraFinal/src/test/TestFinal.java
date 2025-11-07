/*Uso de la palabra FINAL:
Tiene diferentes significados, dependiendo donde se use:
    variables: evita cambiar el valor que almcena la variable
    metodos: evita que se modifique la definicion o el comportamiento de un método, desde una subclase (hija)
    clases: evita que se creen clases hijas
otra caracteristica es que cuando trabajamos con variables se combina con el modificador de acceso estarico
para convertir una variable en una cosntante, es decir, que no se puede modificar su valor
el ejemplo de esto es Math en la cual todos sus atributos son de tipo static y final
por eso es que la vaiable pi se conoce como una constante

*/
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 36584151;
        System.out.println("miDni = " + miDni);
        //miDni = 3265462; NO SE PUEDE MODIFICAR
        
        //Persona.CONSTANTE_AQUI = 9; no se puede modificar
        System.out.println("Mi atributo constante es: "+Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); no se puede asignar una nueva referencia
        persona1.setNombre("Ariel Bentacud");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
    
}
