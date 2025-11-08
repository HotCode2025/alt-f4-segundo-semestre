//hosting
miFuncion(4, 6); // Llamada a la función antes de su declaración

function miFuncion(a, b) { // Declaración de la función
    //console.log("Suma: " + (a + b)); // Cuerpo de la función
    return a + b; // Valor de retorno
}
miFuncion(2, 3); // Llamada a la función con argumentos 2 y 3

let resultado = miFuncion(5, 7); // Llamada a la función y almacenamiento del resultado
console.log("Resultado: " + resultado); // Imprime el resultado

//Declaración de función de expresión
let x = function(a, b){return a + b}; // Asignación de una función anónima a la variable x //Necesita el punto y coma al final
  resultado = x(3, 5); // al llamarla se pone la variable y paréntesis
console.log("Resultado de la función de expresión: " + resultado); // Imprime el resultado

//Funciones de tipo self y invoking
(function(a, b){ // Función anónima autoejecutable
    console.log("Ejecutando la función: " + (a + b));
})(9, 6); // Paréntesis al final para invocar la función

console.log(typeof miFuncion); // Imprime 'function' // Tipo de dato de la función
function miFuncionDos(a, b){ // Declaración de otra función
    console.log(arguments.length); // Imprime el número de argumentos pasados 
}

miFuncionDos(5, 7, 3, 6); // Llamada a la función con múltiples argumentos

//toString
var miFuncionTexto = miFuncionDos.toString(); // Convierte la función a una cadena de texto
console.log(miFuncionTexto); // Imprime el código fuente de la función

//Funciones flecha (arrow functions) ES6 esta es una forma más corta de escribir funciones
const sumarFuncionFlecha = (a, b) => a + b; // Función flecha que suma dos números
resultado = sumarFuncionFlecha(3, 7); // Llamada a la función flecha
console.log("Resultado función flecha: " + resultado); // Imprime el resultado  

//Funcion tipo expresión con argumentos y valores por defecto
let sumar = function(a = 4, b = 8){ // Función con valores por defecto
  console.log(arguments[0]); // Imprime el primer argumento
  console.log(arguments[1]); // Imprime el segundo argumento
  console.log(arguments[2]); // Imprime el tercer argumento
  console.log(arguments[3]); // Imprime el cuarto argumento
  console.log(arguments[4]); // Imprime el quinto argumento
  return a + b + arguments[2]; // Retorna la suma de a, b y el tercer argumento
}
resultado = sumar(1, 2, 3, 4, 5); // Llamada a la función con múltiples argumentos
console.log("Resultado sumar: " + resultado); // Imprime el resultado (undefined porque la función no retorna nada)

//Ejemplo sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9); // Llamada a la función con múltiples argumentos
console.log("Resultado sumar todo: " + respuesta); // Imprime el resultado
function sumarTodo(){ // Función que suma todos los argumentos
  let suma = 0;
  for(let i = 0; i < arguments.length; i++){ // Itera sobre todos los argumentos
      suma += arguments[i]; // Suma cada argumento
  }
  return suma; // Retorna la suma total
}

//Tipos primitivos
let k = 10; // Variable k con valor primitivo
function cambiarValor(a){ // Función que intenta cambiar el valor de a //Paso por valor //no afecta a k
    a = 20; // Cambia el valor de a
}
cambiarValor(k); // Llamada a la función con k
console.log(k); // Imprime el valor de k (10, porque los tipos primitivos se pasan por valor)

//Paso por referencia (objetos) definición: los objetos se pasan por referencia, es decir, se pasa la referencia de memoria del objeto
const persona = { // Objeto persona
  nombre: 'Juan', // Propiedades del objeto
  apellido: 'Perez' // Propiedades del objeto
} 
console.log(persona); // Imprime el objeto persona original (nombre: 'Juan', apellido: 'Perez')
function cambiarValorObjeto(p1){ // Función que cambia una propiedad del objeto //Paso por referencia //afecta a persona
  p1.nombre = 'Carlos'; // Cambia la propiedad nombre del objeto
  p1.apellido = 'Lara'; // Cambia la propiedad apellido del objeto
}
cambiarValorObjeto(persona); // Llamada a la función con el objeto persona
console.log(persona); // Imprime el objeto persona modificado (nombre: 'Carlos', apellido: 'Lara')
