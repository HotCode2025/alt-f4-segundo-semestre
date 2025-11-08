//while
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log('Fin del ciclo while');

//do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log('Fin del ciclo do while');

//for
for(let contando = 0; contando < 3; contando++){
    console.log(contando);
}
console.log('Fin del ciclo for');

//Palabra reservada break
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando);//Muestra los números pares
        break;//Termina el ciclo al encontrar el primer número par
    }
}
console.log('Termina el ciclo al encontrar el primer número par');    


//La palabra reservada continue
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue;//Salta la iteración si el número es impar
    }
    console.log(contando);//Muestra los números pares   
}
console.log('Termina el ciclo');

//Etiquetas labels y continue
inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue inicio;//Salta la iteración si el número es impar
    }
    console.log(contando);//Muestra los números pares
}
console.log('Termina el ciclo');

//Etiquetas labels y break
fin:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        break fin;//Termina el ciclo al encontrar el primer número par
    }
    console.log(contando);//Muestra los números impares
}   
console.log('Termina el ciclo al encontrar el primer número par');
