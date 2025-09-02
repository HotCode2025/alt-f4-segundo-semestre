# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuación
# cree las siguientes listas (en las que no deben haber repetición)
# 1 Lista de palabras que aparecen en las listas
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aparecen en ambas listas

# Creamos las dos listas
lista1 = ['casa', 'perro', 'gato', 'auto', 'mesa']
lista2 = ['gato', 'silla', 'auto', 'planta', 'libro']

print("Lista 1:", lista1)
print("Lista 2:", lista2)

# 1. Lista de palabras que aparecen en las listas
union = []
for palabra in lista1:
    if palabra not in union:
        union.append(palabra)
for palabra in lista2:
    if palabra not in union:
        union.append(palabra)
print("1. Palabras que aparecen en las listas:", union)

# 2. Lista de palabras que aparecen en la primera lista, pero no en la segunda
solo_lista1 = []
for palabra in lista1:
    if palabra not in lista2 and palabra not in solo_lista1:
        solo_lista1.append(palabra)
print("2. Palabras solo en lista 1:", solo_lista1)

# 3. Lista de palabras que aparecen en la segunda lista, pero no en la primera
solo_lista2 = []
for palabra in lista2:
    if palabra not in lista1 and palabra not in solo_lista2:
        solo_lista2.append(palabra)
print("3. Palabras solo en lista 2:", solo_lista2)

# 4. Lista de palabras que aparecen en ambas listas
interseccion = []
for palabra in lista1:
    if palabra in lista2 and palabra not in interseccion:
        interseccion.append(palabra)
print("4. Palabras que aparecen en ambas listas:", interseccion)