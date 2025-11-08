# Ejercicio 1: llenar una lista
# Llenar una lista con los números del 1 al 50,
# luego mostrar la lista con el bucle for, los elementos deben mostrarse así: 1-2-3-...-50

# Creamos una lista vacía donde iremos guardando los números
lista = []

# range(1, 51) genera 1,2,3,...,50 (el 51 no se incluye)
for i in range(1, 51):
    lista.append(i)  # Agregamos cada número a la lista

# Recorremos la lista e imprimimos cada número en la misma línea separado por '-'
# end="-" evita el salto de línea y agrega un guion al final de cada número impreso
for numero in lista:
    print(numero, end="-")


