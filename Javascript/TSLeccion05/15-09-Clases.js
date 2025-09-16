
class Persona{//clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

}

class Empleado extends Persona {//clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }

} 


let persona1 = new Persona('Mariana', 'Perez')
console.log(persona1._nombre);

persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);

persona1.apellido = 'Sanchez';
console.log(persona1.apellido);
//console.log(persona1);


let persona2 = new Persona('Carlos', 'Gonzales');
console.log(persona2._nombre);

persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);

persona2.apellido = 'Morales';
console.log(persona2.apellido);
//console.log(persona2);

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1._nombre);