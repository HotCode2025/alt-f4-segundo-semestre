
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(5.1, 5);//al menos uno de los dos numeros debe ser double
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = Operaciones.sumar(8, 6L);//el 6 es de tipo long
        System.out.println("resultado3 = " + resultado3);//ejecuta el metodo double
    }
    
}
