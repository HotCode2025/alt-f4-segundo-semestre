#Ejercicio 2: Modificar los elementos de una lista
#llenar una lista con los números del 1 al 10
#luego modificar los elementos multiplicandolos por un valor ingresado por el usuario

numeros2 = list(range(1, 11))

multiplicador = int(input('Ingresar un número para multiplicar los números de lista: '))

for i, numero in enumerate(numeros2):
    numeros2[i]  = numero * multiplicador

print('La nueva lista es :', numeros2)