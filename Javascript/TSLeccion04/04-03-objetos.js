let x = 10;
console.log(x.length);
console.log('Tipos primitivos');
//Objeto
let persona = {
    nombre : 'Mariana',
    apellido : 'Lopez',
    edad : 38, 
    email : 'marlopez@gmial.com',
    nombreCompleto : function(){// método o función en javascript
        return this.nombre+' '+this.apellido;

    }

}
console.log(persona.nombre);//accedemos a las propiedades del objeto persona
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona.nombreCompleto());//Agregar metodos a los objetos, similar a agregar una propiedad
console.log('Ejecutando con un objeto');


let persona2 = new Object();//debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.dirección = 'Espinola 246';
persona2.telefono = 26178123;
console.log(persona2.dirección);
console.log('Creamos un nuevo objeto');

//Acceder a las propiedades de los objetos
console.log(persona['apellido']);//accedemos como si fuera un arreglo

//For in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

//Agregar y eliminar propiedades al objeto
console.log('Cambiamos y eliminamos un error');
persona.apellida = 'Betancud';//cambiamos dinamicamente un valor del objeto
delete persona.apellida;//eliminados el error
console.log(persona);

//Distintas formas de imprimir un objeto

//Número 1:concatenar un vlor de cada propiedad
console.log('Distintas formas de imprimir un objeto: forma 1');
console.log(persona.nombre+' '+persona.apellido);

//Número 2: a traves del ciclo for in
console.log('Distintas formas de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Número 3: la función Object.values()
//Este método regresa nuestro objeto pero como un arreglo
console.log('Distintas formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: utilzamos el método JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(persona);