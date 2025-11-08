//*let persona3 = new Persona("Pedro", "Ramírez", 40); esto da error porque la clase Persona no está definida aún.
//*Primero se define la clase y luego se crean las instancias de la clase.
class Persona{ //* Definición de una clase // clase significa molde o plantilla. // Una clase es una plantilla para crear objetos.
    
    static contadorPersonas = 0; // *Atributo estático // Los atributos estáticos no se heredan // Se accede desde la clase, no desde las instancias.
    //email = 'valor default email'; // *Atributo no estatico // Los atributos de instancia se crean en el constructor.

    static get MAX_OBJ(){ // *Definición de un método estático get // Los métodos estáticos no se heredan // Se llaman desde la clase, no desde las instancias.
        return 5;

    }
    constructor(nombre, apellido, edad){ //* El constructor es un método especial para crear e inicializar un objeto creado a partir de una clase.
        this._nombre = nombre; // *El this hace referencia a la instancia de la clase.
        this._apellido = apellido;
        this._edad = edad;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
             this.idPersona = ++Persona.contadorPersonas; // *Atributo de instancia único para cada objeto.
            //console.log("Se incrementa el contador: " + Persona.contadorObjetoPersonas);
            }
            else{
                console.log("Se ha superado el máximo de objetos permitidos: " + Persona.MAX_OBJ);  
            }
        //Persona.contadorPersonas++; // *Incrementa el contador de objetos cada vez que se crea una nueva instancia de la clase Persona.
       
    }
    get nombre(){ // *Método get para obtener el valor de nombre.
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }
    get edad(){
        return this._edad;
    }
    set nombre(nombre){ // *Método set para modificar el valor de nombre.
        this._nombre = nombre; 
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    set edad(edad){
        this._edad = edad;
    }

    nombreCompleto(){ // *Método para obtener el nombre completo.
        return this.idPersona+' '+this._nombre + ' ' + this._apellido;
    }
    //*Sobreescribimos el método toString de la clase padre (Object)
    toString(){ // *Método toString() // Sobrescribe el método toString() de la clase Object.//regresa una cadena de texto con el nombre completo y la edad.
        //*se applica el polimorfismo (multiples formas en tiempo de ejecución)
        //*El método que se ejecuta depende si es una instancia de la clase Persona(padre) o de la clase Empleado(Hija).
        return this.nombreCompleto() + ', ' + this._edad + ' años.';
    }

    static saludar(){ // *Método estático // Los métodos estáticos no se heredan // Se llaman desde la clase, no desde las instancias.
        console.log("Saludos desde el método estático");
    }
    static saludar2(persona){ // *Método estático que recibe un objeto de la clase Persona.
        console.log(persona.nombre + ' ' + persona.apellido);
    }
}

class Empleado extends Persona{ //* clase hija // La clase Empleado hereda de la clase Persona. // La palabra reservada extends indica que la clase Empleado es una subclase de la clase Persona.
    constructor(nombre, apellido, edad, departamento){
        super(nombre, apellido, edad); //* Llamada al constructor de la clase padre. // Es obligatorio llamar a super() en el constructor de una clase hija antes de usar this.    
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }  
    
    //*Sobrescritura de métodos (Override) // La clase hija puede modificar el comportamiento de un método heredado de la clase padre.
    nombreCompleto(){ // *Método para obtener el nombre completo.
        return super.nombreCompleto() + ', ' + this._departamento; // *Llamada al método nombreCompleto() de la clase padre.
    }

} 
let persona1 = new Persona("Juan", "Pérez", 30); // *Crear una instancia de la clase Persona.
console.log(persona1.nombre); //* Acceder al valor de nombre a través del método get.
persona1.nombre = "Carlos"; // *Modificar el valor de nombre a través del método set.
console.log(persona1.nombre);
console.log(persona1.apellido);
persona1.apellido = "López";
console.log(persona1.apellido);
console.log(persona1.edad);
persona1.edad = 35;
console.log(persona1.edad);
//console.log(persona1);
let persona2 = new Persona("María", "Gómez", 25);
console.log(persona2.nombre);
persona2.nombre = "Ana";
console.log(persona2.nombre);
console.log(persona2.apellido);
persona2.apellido = "Martínez";
console.log(persona2.apellido);
console.log(persona2.edad);
persona2.edad = 28;
console.log(persona2.edad);
//console.log(persona2);

let empleado1 = new Empleado("Maria",'Gimenez','35','Sistemas'); //* Crear una instancia de la clase Empleado. por que? Porque la clase Empleado hereda de la clase Persona.
console.log(empleado1);
console.log(empleado1.nombre); //* Acceder al valor de nombre a través del método get heredado de la clase Persona.
console.log(empleado1.nombreCompleto()); //* Acceder al método nombreCompleto() heredado de la clase Persona.


//Object.prototype.toString //* Todas las clases heredan de la clase Object, que es la clase padre de todas las clases en JavaScript.
console.log(empleado1.toString()); //* Llamada al método toString() sobrescrito en la clase Persona.
console.log(persona1.toString()); //* Llamada al método toString() sobrescrito en la clase Persona.

//persona1.saludar(); //* Esto da error porque los métodos estáticos no se llaman desde las instancias.
Persona.saludar(); //* Llamada al método estático de la clase Persona.
Persona.saludar2(persona1); //* Llamada al método estático de la clase Persona que recibe un objeto de la clase Persona.
//*EL metodo estatico si iniciamos QUOKKA solo se puede ver en la consola. no en el codigo. porque es estatico.
Empleado.saludar(); //* Llamada al método estático de la clase Persona desde la clase Empleado (heredado).
Empleado.saludar2(empleado1); //* Llamada al método estático de la clase Persona desde la clase Empleado (heredado) que recibe un objeto de la clase Empleado.

console.log(Persona.contadorPersonas); // *Acceso al atributo estático de la clase Persona.
console.log(Empleado.contadorPersonas); // *Acceso al atributo estático de la clase Persona desde la clase Empleado (heredado).

console.log(persona1.email); // *Acceso al atributo no estático de la instancia empleado1.//acceder desde la clase padre
console.log(empleado1.email); // *Acceso al atributo no estático de la instancia empleado1.//acceder desde la clase hija
//console.log(Persona.email); // *Esto da undefined porque los atributos no estáticos no se acceden desde la clase.
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);

let persona3 = new Persona("Pedro", "Ramírez", 40);
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log("Maximo de objetos permitidos: " + Persona.MAX_OBJ); //* Acceso al método estático
// Persona.MAX_OBJ = 10;
console.log(Persona.MAX_OBJ)

let persona4 = new Persona("Luisa", "Fernández", 22);
console.log(persona4.toString());
console.log(Persona.contadorPersonas);

let persona5 = new Persona("Ana", "García", 29);
console.log(persona5.toString());
console.log(Persona.contadorPersonas);
