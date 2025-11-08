// =========================
// Clase Producto
// =========================
class Producto {
  // Contador estático para asignar IDs automáticos
  static contadorProductos = 0;

  constructor(nombre, precio) {
    this._idProducto = ++Producto.contadorProductos; // autoincremental
    this._nombre = nombre;
    this._precio = Number(precio);
  }

  // Getters
  get idProducto() {
    return this._idProducto;
  }
  get nombre() {
    return this._nombre;
  }
  get precio() {
    return this._precio;
  }

  // Setters
  set nombre(n) {
    this._nombre = n;
  }
  set precio(p) {
    this._precio = Number(p);
  }

  // Representación como texto (para mostrar en Orden)
  toString() {
    // Ej: [idProducto:1, nombre:'Café', precio: 1500.00]
    return `[idProducto:${this._idProducto}, nombre:'${this._nombre}', precio:${this._precio.toFixed(2)}]`;
  }
}

// =========================
// Clase Orden
// =========================
class Orden {
  // Contador estático de órdenes creadas
  static contadorOrdenes = 0;

  // Constante de clase para el máximo de productos por orden
  static get MAX_PRODUCTOS() {
    return 5;
  }

  constructor() {
    this._idOrden = ++Orden.contadorOrdenes; // autoincremental
    this._productos = [];                    // arreglo de Producto
    this._contadorProductosAgregados = 0;    // opcional (para seguir el diagrama)
  }

  get idOrden() {
    return this._idOrden;
  }

  // Agregar un producto si no se superó el máximo permitido
  agregarProducto(producto) {
    if (!(producto instanceof Producto)) {
      throw new TypeError('Solo se pueden agregar instancias de Producto.');
    }
    if (this._productos.length < Orden.MAX_PRODUCTOS) {
      this._productos.push(producto);
      this._contadorProductosAgregados++;
    } else {
      console.warn(
        `No se puede agregar más productos. Máximo permitido: ${Orden.MAX_PRODUCTOS}`
      );
    }
  }

  // Suma los precios de todos los productos
  calcularTotal() {
    return this._productos.reduce((acc, prod) => acc + prod.precio, 0);
  }

  // Muestra la orden en consola (podrías retornarlo como string si preferís)
  mostrarOrden() {
    const total = this.calcularTotal().toFixed(2);
    const detalle = this._productos.map(p => p.toString()).join(', ');
    console.log(`\n===== ORDEN #${this._idOrden} =====`);
    console.log(`Productos agregados (${this._contadorProductosAgregados}): ${detalle || '—'}`);
    console.log(`Total: $ ${total}`);
    console.log('=========================\n');
  }
}

// =========================
// VentasTest (no es clase, solo prueba)
// =========================
(function VentasTest() {
  // Crear productos
  const p1 = new Producto('Café', 1500);
  const p2 = new Producto('Medialuna', 700);
  const p3 = new Producto('Jugo', 1200);
  const p4 = new Producto('Tostado', 2500);
  const p5 = new Producto('Agua', 900);
  const p6 = new Producto('Brownie', 1600); // este excederá el máximo si se intenta agregar

  // Crear orden y agregar productos
  const orden1 = new Orden();
  orden1.agregarProducto(p1);
  orden1.agregarProducto(p2);
  orden1.agregarProducto(p3);
  orden1.agregarProducto(p4);
  orden1.agregarProducto(p5);
  orden1.agregarProducto(p6); // muestra advertencia por MAX_PRODUCTOS

  // Mostrar
  orden1.mostrarOrden();

  // Otra orden
  const orden2 = new Orden();
  orden2.agregarProducto(new Producto('Sandwich Veggie', 3400));
  orden2.agregarProducto(new Producto('Latte', 1800));
  orden2.mostrarOrden();
})();
