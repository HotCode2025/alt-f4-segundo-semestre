//while

let contador = 0;
while(contador < 3){
    console.log(contador);
    contador ++;

}
console.log("fin del ciclo while");


//Do while

let conteo = 0;
do{
    console.log(conteo);
    conteo ++;
}while(conteo < 3);

console.log("Fin del ciclo do while");


//Ciclo For

for(let contando = 0; contando < 3; contando ++){
    console.log(contando);
}
console.log("Fin del ciclo For");

//Palabra reservada break

for(let contando = 0; contando <= 10; contando ++){
    if(contando % 2 == 0){
        console.log(contando);
        break; //muestra solo el primer numero par, porque encuentra el primer numero par y ya no sigue ejecutando
    }
}
console.log("Termina el ciclo al encontrar los pares");

//Palabra Reservada continue

for(let contando = 0; contando <= 10; contando ++){
    if(contando % 2 !== 0){
        continue; //ir a la siguiente iteracion e ignora todo los pares
    }
    console.log(contando);
}
console.log("Termina el ciclo ");

//Etiquetas labels nos permite identificar una parte del codigo y no son recomendadas en programacion
//sirven para identificar una parte espesifica del codigo

inicio: 
for(let contando = 0; contando <= 10; contando ++){
    if(contando % 2 !== 0){
        break inicio; //
    }
    console.log(contando);
}
console.log("Termina el ciclo ");