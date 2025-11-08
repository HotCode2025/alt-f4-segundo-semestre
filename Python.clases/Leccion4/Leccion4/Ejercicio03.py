# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista.
# Cuando el usuario introduzca el número 0, el programa dejará de insertar.
# Por último, mostrar los números ordenados de menor a mayor.

# Lista donde guardaremos los números que ingrese el usuario
lista = []

# Bucle infinito que se corta con 'break' cuando el usuario ingresa 0
while True:
    numero = int(input("Ingrese un número (0 para terminar): "))
    if numero == 0:        # Condición de parada
        break
    lista.append(numero)   # Guardamos el número en la lista

# Ordenamos la lista de menor a mayor
lista.sort()

# Mostramos el contenido ya ordenado
print("Números ordenados de menor a mayor:", lista)


