# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación
# elimine los elementos repetidos, por último mostrar la lista.

# Creamos una lista
lista = [1, 2, 3, 2, 4, 1, 5, 3, 6, 2]
print("Lista original:", lista)

# Eliminamos duplicados usando métodos de listas
lista_sin_duplicados = []
for elemento in lista:
    if elemento not in lista_sin_duplicados:
        lista_sin_duplicados.append(elemento)

print("Lista sin duplicados:", lista_sin_duplicados)