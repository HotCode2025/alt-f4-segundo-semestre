//creacion de Array y arreglos
//let autos = new Array('BMW', 'Mercedes Benz', 'Volvo'); esta es la sintaxis antigua
const autos = ['BMW', 'Mercedes Benz', 'Volvo']; //esta es la sintaxis moderna y recomendada
console.log(autos);

//Acceder a los valores del arreglo
console.log(autos[0]);
console.log(autos[1]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i + ' : ' + autos[i]);
}

//Modificar valores del arreglo
autos[1] = 'Audi';
console.log(autos[1]);

//Agregar nuevos valores al arreglo
autos.push('Cadillac'); //agrega un nuevo valor al final del arreglo
console.log(autos);

//Otra forma de agregar un nuevo valor al arreglo
autos[autos.length] = 'Porsche'; //agrega un nuevo valor al final del arreglo
console.log(autos);

//No es recomendable pero se puede
autos[6] = 'Ferrari'; //agrega un nuevo valor en la posicion 6 del arreglo, pero deja un espacio vacio en la posicion 5
console.log(autos);

//como para saber si es un arreglo o array
console.log(Array.isArray(autos)); //true Pregunta si es un arreglo

console.log(autos instanceof Array); //true Preguntamos si es una instancia de Array

