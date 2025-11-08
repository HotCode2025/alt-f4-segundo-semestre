# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuacion
# cree las siguientes listas (en las que no deben haber repeticion)
# 1 lista de palabras que aparecen en las listas
# 2 lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 lista de palabras que aparecen en ambas listas

# Creamos dos listas
lista1 = ["vino", "uva", "barrica", "botella", "corcho"]
lista2 = ["uva", "botella", "vino", "copa", "etiqueta"]

print("Lista 1:", lista1)
print("Lista 2:", lista2)

# Convertimos las listas en conjuntos para eliminar duplicados
conjunto1 = set(lista1)
conjunto2 = set(lista2)

# 1️⃣ Lista de palabras que aparecen en las listas (unión)
lista_union = list(conjunto1 | conjunto2)
print("\n1. Palabras que aparecen en las listas:", lista_union)

# 2️⃣ Palabras que aparecen en la primera lista, pero no en la segunda
solo_primera = list(conjunto1 - conjunto2)
print("\n2. Palabras solo en la primera lista:", solo_primera)

# 3️⃣ Palabras que aparecen en la segunda lista, pero no en la primera
solo_segunda = list(conjunto2 - conjunto1)
print("\n3. Palabras solo en la segunda lista:", solo_segunda)

# 4️⃣ Palabras que aparecen en ambas listas (intersección)
en_ambas = list(conjunto1 & conjunto2)
print("\n4. Palabras que aparecen en ambas listas:", en_ambas)
