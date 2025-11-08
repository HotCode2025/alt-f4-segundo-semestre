let x = 10; //variable de tipo primitivo
console.log(x.length); //undefined//Los tipos primitivos no tienen propiedades ni métodos
console.log("Tipo primitivos"); 
//Los objetos en JavaScript son colecciones de propiedades
//Un objeto se define con llaves {}
let persona = {
    nombre: 'Juan',
    apellido: 'Pérez',
    edad: 28,
    idioma: 'ES',
    email: "jperez@gmail.com",
    get lang(){ //método get para el idioma
        return this.idioma.toUpperCase(); //convierte el idioma a mayúsculas
    },
    set lang(lang){ //método set para el idioma //concepto de setter: es un método que asigna un valor a una propiedad //se define con la palabra reservada set
        this.idioma = lang.toUpperCase(); //convierte el idioma a mayúsculas y lo asigna a la propiedad idioma
    },
    nombreCompleto: function(){ //método que es una función dentro de un objeto
        return this.nombre + ' ' + this.apellido; //this hace referencia al objeto actual 
    },
    get nombreEdad(){ //método get //para obtener el valor de una propiedad //concepto de getter: es un método que obtiene el valor de una propiedad //se define con la palabra reservada get
        return 'El nombre es: ' + this.nombre + ' y la edad es: ' + this.edad; //no se usan paréntesis al llamar al método get //se accede como una propiedad //se usa para obtener un valor calculado
    }
}   
   

console.log(persona.nombre); // se accede a las propiedades con el operador punto
console.log(persona.apellido);
console.log(persona.edad);
console.log(persona.email);
console.log(persona) // muestra todo el objeto
//Si la propiedad no existe, el valor es undefined
console.log(persona.nombreCompleto()); //se llama al método con los paréntesis

console.log('Ejecutando con un objeto');
//Otra forma de crear un objeto
let persona2 = new Object(); //se crea un objeto en memoria //Object es una clase predefinida en JavaScript
persona2.nombre = 'María'; //se asignan las propiedades
persona2.direccion = 'Salada 14';
persona2.telefono = '2622456789';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); //otra forma de acceder a las propiedades //accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');
//for in para recorrer las propiedades de un objeto Y accedemos a su valor como si fuera un arreglo
for(propiedad in persona){ //propiedad es una variable que va a ir tomando el nombre de cada propiedad del objeto
    console.log(propiedad); //muestra el nombre de la propiedad
    console.log(persona[propiedad]); //muestra el valor de la propiedad
}
console.log('cambiamos y eliminamos un error');
//Agregar nuevas propiedades a un objeto
persona.apellida = 'Jauregui'; //modifica la propiedad existente
delete persona.apellida; //elimina la propiedad apellida
console.log(persona);

//Distintas formas de imprimir un objeto
//Numero 1: es la mas sencilla: concatenar cada valor de la propiedad
console.log('Distintas formas de imprimir un objeto: Forma 1');
console.log(persona.nombre + ', ' + persona.apellido);

//Numero 2: A traves del Ciclo for in
console.log('Distintas formas de imprimir un objeto: Forma 2');
for(nombrePropiedad in persona){ //nombrePropiedad va a ir tomando el nombre de cada propiedad del objeto
    console.log(persona[nombrePropiedad]); //muestra el valor de cada propiedad
}

//Numero 3: La función Object.values() //devuelve un arreglo con los valores de las propiedades del objeto // que es otra forma de recorrer un objeto
console.log('Distintas formas de imprimir un objeto: Forma 3');
let personaArray = Object.values(persona); //convierte las propiedades del objeto en un arreglo
console.log(personaArray); //muestra el arreglo

//Numero 4: La función JSON.stringify() //convierte un objeto a una cadena de texto en formato JSON //JavaScript Object Notation// muy utilizado para el intercambio de datos entre aplicaciones // y para el almacenamiento de datos // que es un formato ligero de intercambio de datos
console.log('Distintas formas de imprimir un objeto: Forma 4');
let personaString = JSON.stringify(persona); //convierte el objeto a una cadena de texto en formato JSON
console.log(personaString); //muestra la cadena de texto

console.log('Usamos el método get');
console.log(persona.nombreEdad); //llamamos al método get como si fuera una propiedad, sin paréntesis
//persona.nombreEdad(); //no se usa paréntesis al llamar al método get //da error si se usan paréntesis

console.log('Usamos el método get y set para idiomas'); 
persona.lang = 'en'; //llamamos al método set como si fuera una propiedad, sin paréntesis //asignamos un nuevo valor al idioma  
console.log(persona.lang); //llamamos al método get como si fuera una propiedad, sin paréntesis

function Persona3(nombre, apellido, email){ //Función constructora //se usa la convención de poner la primera letra en mayúscula
    this.nombre = nombre; //se asignan las propiedades
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){ //método // si agregamos un método al constructor, cada objeto creado con el constructor tendrá su propia copia del método
        return this.nombre + ' ' + this.apellido;
    } 
}
let padre = new Persona3('Leo', 'Lopez', 'Llopez@gmail.com '); //se crea un nuevo objeto con la función constructora// que la funcion constructora es una plantilla para crear objetos
padre.nombre = 'Leonardo'; //se modifica una propiedad del objeto
padre.telefono = '2622454523'; //se agrega una nueva propiedad al objeto //una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); //se llama al método del objeto
let madre = new Persona3('Laura', 'Contreras', 'Lcontreras@gmail.com'); //se crea un nuevo objeto con la función constructora
console.log(madre);
console.log(madre.telefono); //undefined, porque no se le asignó un valor a la propiedad teléfono
console.log(madre.nombreCompleto()); //se llama al método del objeto

//Distintas formas de crear objetos en JavaScript
let miObjeto1 = new Object(); //forma formal
let miObjeto2 = {}; //forma literal, es la más utilizada y recomendada

//casos strings
let miCadena1 = new String('Hola'); //forma formal
let miCadena2 = 'Hola'; //forma literal //forma recomendada

//casos números
let miNumero1 = new Number(1); //forma formal
let miNumero2 = 1; //forma literal //forma recomendada

//casos booleanos
let miBoolean1 = new Boolean(true); //forma formal
let miBoolean2 = true; //forma literal //forma recomendada

//casos arreglos
let miArreglo1 = new Array(); //forma formal
let miArreglo2 = []; //forma literal //forma recomendada

//casos funciones
let miFuncion1 = new Function(); //forma formal
let miFuncion2 = function(){}; //forma literal //forma recomendada
// Todo despues de new es considerado un objeto

//Uso de prototype
Persona3.prototype.telefono = '2622456789'; //se agrega una nueva propiedad a la función constructora   
console.log(padre); //el objeto padre tiene la propiedad teléfono
console.log(madre.telefono); //el objeto madre también tiene la propiedad teléfono
madre.telefono = '2622557890'; //se modifica la propiedad teléfono del objeto madre
console.log(madre.telefono); //si modificamos la propiedad teléfono del objeto madre, no se modifica la propiedad teléfono de la función constructora

//Uso de call
let persona4 = { //objeto literal
    nombre: 'Carlos',
    apellido: 'Lara',
    nombreCompleto2: function(titulo,telefono){ //método que recibe parámetros
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ', ' + telefono; //this hace referencia al objeto actual
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = { //otro objeto literal
    nombre: 'Ana',
    apellido: 'Lara'
}
console.log(persona4.nombreCompleto2('Lic.', '2622567890')); //se llama al método del objeto persona4
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '2622454321')); //se llama al método del objeto persona4 pero con los datos del objeto persona5 //call es un método que permite llamar a una función con un objeto diferente al que pertenece //el primer parámetro es el objeto que se va a usar como this //los siguientes parámetros son los parámetros de la función

//Método apply
let arreglo = ['Ing.', '2622565890']; //arreglo con los parámetros
console.log(persona4.nombreCompleto2.apply(persona5, arreglo)); //se llama al método del objeto persona4 pero con los datos del objeto persona5 //apply es un método que permite llamar a una función con un objeto diferente al que pertenece //el primer parámetro es el objeto que se va a usar como this //el segundo parámetro es un arreglo con los parámetros de la función

//Diferencia entre call y apply
//call: los parámetros se pasan de forma individual
//apply: los parámetros se pasan en un arreglo

