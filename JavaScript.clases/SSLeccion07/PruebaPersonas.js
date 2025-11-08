class   Persona {

    static contadorPersonas = 0;

    constructor(nombre, apellido, edad, domicilio) {
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;   
    } 
    get idPersona() {
        return this._idPersona;
    }
    get nombre() {
        return this._nombre;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }
    get apellido() {
        return this._apellido;
    }
    set apellido(apellido) {
        this._apellido = apellido;
    }
    get edad() {
        return this._edad;
    }
    set edad(edad) { 
        this._edad = edad;
    }
    
    toString() {
        return `ID Persona: ${this._idPersona} , Nombre: ${this._nombre} , Apellido: ${this._apellido} , Edad: ${this._edad}`; //devuelve una representación en cadena de texto del objeto Persona.
    }
}  

class   Empleado extends Persona {

    static contadorEmpleados = 0; //*Declara un atributo estático contadorEmpleados para llevar un registro del número de instancias de Empleado creadas. 

    constructor(nombre, apellido, edad, sueldo) { //*El constructor de la clase Empleado recibe los parámetros nombre, apellido, edad y sueldo.
        super(nombre, apellido, edad); //*Llama al constructor de la clase padre (Persona) utilizando super() para inicializar los atributos heredados.
        this._idEmpleado = ++Empleado.contadorEmpleados; //*Incrementa el contador estático contadorEmpleados y asigna el valor al atributo _idEmpleado.
        this._sueldo = sueldo; //*Inicializa el atributo _sueldo con el valor proporcionado.
    }
    get idEmpleado() { //*Define un método getter para el atributo _idEmpleado.
        return this._idEmpleado;
    }
    get sueldo() { //*Define un método getter para el atributo _sueldo.
        return this._sueldo;
    }
    set sueldo(sueldo) { //*Define un método setter para el atributo _sueldo.
        this._sueldo = sueldo;
    }
    toString() { //*Sobrescribe el método toString() de la clase padre para incluir información específica del empleado.
        return `${super.toString()} , ID Empleado: ${this._idEmpleado} , Sueldo: ${this._sueldo}`; //*Llama al método toString() de la clase padre utilizando super.toString() y agrega los detalles del empleado.
    }
} 

class   Cliente extends Persona {

    static contadorClientes = 0; //*Declara un atributo estático contadorClientes para llevar un registro del número de instancias de Cliente creadas.\

    constructor(nombre, apellido, edad, fechaRegistro) { //*El constructor de la clase Cliente recibe los parámetros nombre, apellido, edad y fechaRegistro.
        super(nombre, apellido, edad); //*Llama al constructor de la clase padre (Persona) utilizando super() para inicializar los atributos heredados.
        this._idCliente = ++Cliente.contadorClientes; //*Incrementa el contador estático contadorClientes y asigna el valor al atributo _idCliente.
        this._fechaRegistro = fechaRegistro; //*Inicializa el atributo _fechaRegistro con el valor proporcionado.
    }
    get idCliente() { //*Define un método getter para el atributo _idCliente.
        return this._idCliente;
    }
    get fechaRegistro() { //*Define un método getter para el atributo _fechaRegistro.   
        return this._fechaRegistro;
    }
    set fechaRegistro(fechaRegistro) { //*Define un método setter para el atributo _fechaRegistro.
        this._fechaRegistro = fechaRegistro;
    }
    toString() { //*Sobrescribe el método toString() de la clase padre para incluir información específica del cliente.
        return `${super.toString()} , ID Cliente: ${this._idCliente} , Fecha de Registro: ${this._fechaRegistro}`; //*Llama al método toString() de la clase padre utilizando super.toString() y agrega los detalles del cliente.
    }
}//*template strings que permiten incrustar expresiones dentro de cadenas de texto utilizando la sintaxis ${expresión}.  

// *Prueba de las clases Persona
let persona1 = new Persona('Juan', 'Pérez', 30);
console.log(persona1.toString());

let persona2 = new Persona('Ana', 'Gómez', 25);
console.log(persona2.toString());

// *Prueba de la clase Empleado
let empleado1 = new Empleado('Luis', 'Martínez', 28, 50000);
console.log(empleado1.toString());

let empleado2 = new Empleado('María', 'Rodríguez', 32, 60000);
console.log(empleado2.toString());

// *Prueba de la clase Cliente
let cliente1 = new Cliente('Carlos', 'Sánchez', 40, new Date());
console.log(cliente1.toString());   

let cliente2 = new Cliente('Lucía', 'Fernández', 35, new Date());
console.log(cliente2.toString());

