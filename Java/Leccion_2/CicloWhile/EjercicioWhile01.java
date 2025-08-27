package Leccion_2.CicloWhile;

public class EjercicioWhile01 {

    public static void main(String[] args) {
        var conteo = 0; //Inferencia de tipos
        while (conteo < 3) {
            System.out.println("Conteo: " + conteo);
            conteo++; //Vamos aumentando en uno la variable
        }

        var contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 7); 

        // Uso de las palabras break y continue junto a las etiquetas labels
        for(var contando = 0; contando < 7; contando++) {
            if(contando % 2 == 0) {
                System.out.println("Contando: " + contando);
                break;
            }
        }
        inicio:
        for(var contando = 0; contando < 7; contando++) {
            if(contando % 2 != 0) {
                continue inicio; // Vamos a la siguiente iteracion
            }
            System.out.println("Contando: " + contando);
        }

    }

}
