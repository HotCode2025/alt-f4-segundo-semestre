# Ejercicio 2: Modificar los elementos de una lista
# Llenar una lista con los números del 1 al 10,
# luego modificar los elementos multiplicándolos por un valor ingresado por el usuario.

# Lista vacía para almacenar los números iniciales
lista = []

# Llenamos con 1..10
for i in range(1, 11):
    lista.append(i)

# Pedimos el multiplicador al usuario y lo convertimos a entero
valor = int(input("Ingrese un valor para multiplicar los elementos: "))

# Recorremos la lista por índice para poder sobrescribir cada posición
for i in range(len(lista)):
    lista[i] *= valor  # lista[i] = lista[i] * valor

# Mostramos el resultado final de la lista ya modificada
print("Lista modificada:", lista)
