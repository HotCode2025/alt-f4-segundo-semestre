# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) # Definimos la tupla
# Crear una lista que solo incluya los números menores a 5
lista = []
for elemento in tupla:
	if elemento < 5:
		lista.append(elemento)
print(lista) # e imprima por consola [1, 3, 2]
