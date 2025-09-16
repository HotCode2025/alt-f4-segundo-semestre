//let persona3 = new Persona('Carla', 'Ponce');
//no se puede crear un objeto antes de crear una clase
//aca no se aplica el concepto de hosting, porque primero debo definir la clase 
//y luego crear el objeto con su constructor
class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

}