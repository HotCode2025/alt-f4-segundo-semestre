class Cliente extends Pessoa {

    static contadorClientes = 0; //*Declara un atributo estático contadorClientes para llevar un registro del número de instancias de Cliente creadas.

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
    //*template strings que permiten incrustar expresiones dentro de cadenas de texto utilizando la sintaxis ${expresión}.

}    