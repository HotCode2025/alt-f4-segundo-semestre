// Array-diferentes formas de declarar un arreglo
//let autos = new Array('Ferrari', 'Renault', 'BMW');// sintaxis vieja
//console.log(autos);

const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);

//Recorrer los elementos de la array, de forma manual

console.log(autos[0]);
console.log(autos[2]);

//usamos el ciclo for para recorrer los elementos del array

for(let i = 0; i < autos.length; i ++){
    console.log(autos[i]);
}

for(let i = 0; i < autos.length; i ++){
    console.log(i + ' : '+ autos[i]);
}

//Modificamos los elementos del array, vamos iterar

autos[1] = 'volvo';
console.log(autos);

//Agregar elementos al array con la función .push

autos.push('Audi');
console.log(autos);

//Otras formas de agregar elementos

autos[autos.length] = 'Porche';
console.log(autos);

//Tercer forma de agregar elemento CUIDADO!!!!

autos[6] = 'Renault';//genera un espacio vacio 
console.log(autos);


//Preguntar si es un array, devuelve un booleano
console.log(Array.isArray(autos));
console.log(autos instanceof Array);