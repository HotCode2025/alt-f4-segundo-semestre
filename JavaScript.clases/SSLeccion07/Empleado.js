class Empleado extends Persona {
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