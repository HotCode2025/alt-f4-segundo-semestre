# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado,
# luego meter los caracteres en una lista sin repetir caracteres

cadena = input("Ingresa una cadena: ")

lista_sin_repetidos = list(set(cadena))

print("Lista sin repetir caracteres:", lista_sin_repetidos)