# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un Programa donde tenga una lista y que a continuacion
# Elimine los elementos repetidos, por ultimo mostrar la lista.

# Creamos una lista con elementos repetidos
lista = [3, 5, 2, 3, 8, 5, 10, 2, 3]

print("Lista original:", lista)

# Eliminamos los elementos duplicados usando 'set'
lista_sin_duplicados = list(set(lista))

print("Lista sin duplicados:", lista_sin_duplicados)
