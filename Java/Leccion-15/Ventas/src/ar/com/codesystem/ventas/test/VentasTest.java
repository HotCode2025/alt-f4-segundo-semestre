
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas. *;

public class VentasTest {
    public static void main(String[] args){
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Camisa", 18900.00);
        Producto producto4 = new Producto("Medias", 5600.00);
        Producto producto5 = new Producto("Vestido", 50000.00);
        Producto producto6 = new Producto("Buzo", 22000.00);
        Producto producto7 = new Producto("Chaleco", 35000.00);
        Producto producto8 = new Producto("Short", 1680000);
        Producto producto9 = new Producto("Sweter", 30000.00);
        Producto producto10 = new Producto("Remera", 25500.00);
        
        Orden orden1 = new Orden();
        //agregar productos a la lista
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto4);
        orden2.mostrarOrden();
        
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto10);
        
        orden3.mostrarOrden();
    }
    
}
