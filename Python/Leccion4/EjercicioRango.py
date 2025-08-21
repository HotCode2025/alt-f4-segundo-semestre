# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3
# Ejemplo de ejecución: 0,3,6,9
# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3
print("Ejercicio 1: Rango de 0 a 10")
for i in range(0, 11):
	if i % 3 == 0:
		print(i)

# Ejercicio 2: Crear un rango de números de 2 a 6 a imprimirlos
# Ejemplo de ejecución: 2,3,4,5,6
# Ejercicio 2: Crear un rango de números de 2 a 6 a imprimirlos
print("Ejercicio 2: Rango de 2 a 6")
for i in range(2, 7):
	print(i)

# Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1
# Ejemplo de ejecución: 3,5,7,9
# Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1
print("Ejercicio 3: Rango de 3 a 10, incremento de 2 en 2")
for i in range(3, 10, 2):
	print(i)
