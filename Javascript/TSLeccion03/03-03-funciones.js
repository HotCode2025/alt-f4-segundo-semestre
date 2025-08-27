//Funciones, dentro de la funcion puede tener parametros

miFuncion(8, 2)//Esto se lo conoce como hosting

function miFuncion(a, b){
    //console.log("Sumamos: "+(a + b))
    return a + b;//palabra reservada return
}
//Llamamos a la función
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado)

//Funciones de tipo Expresión o funcione anonima
let x = function(a, b){return a + b};//necesita cierre con punto y coma
resultado = x(5, 6);//al llamarla se pone la variable y parentesis
console.log(resultado);//reutilzamos la variable resultado

//Funciones de tipo self y invoking
(function(a, b){
    console.log("Ejecutamos la función: "+ (a + b));
})(9, 6);

// Propiedad Arguments
console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments.length)
}
miFuncionDos(5, 7);   

//Metodo toString
var miFunciontexto = miFuncionDos.toString();
console.log(miFunciontexto);

//Funciones Flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7);//Asiganamos el valor a una variable
console.log(resultado);

//Funcion de tipo expresion
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]);//muestra el parametro de : a
    console.log(arguments[1]);//muestra el parametro de : b
    return a + b + arguments[2];
}
resultado = sumar(3, 2, 9);
console.log(resultado);

//Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i];//arguments es para arreglos

    }
    return suma;
}

//Tipos primitivos-Paso por valor
let k = 10;
function cambioValor(a){//paso por valor
a = 20;
}
cambioValor(k);
console.log(k);

//Paso por Referencia
const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
}
console.log(persona);
function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}
cambiarValorObjeto(persona);
console.log(persona);