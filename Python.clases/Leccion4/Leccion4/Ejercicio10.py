# Ejercicio 10: No repetir caracteres
#Hacer un Programa que pida una cadena por teclado, luego
#meter los caracteres en una lista sin repetir caracteres

# Pedimos al usuario que ingrese una cadena de texto
cadena = input("Ingrese una cadena de texto: ")

# Creamos una lista vacía para guardar los caracteres únicos
lista_sin_repetir = []

# Recorremos cada carácter de la cadena
for caracter in cadena:
    # Si el carácter no está en la lista, lo agregamos
    if caracter not in lista_sin_repetir:
        lista_sin_repetir.append(caracter)

# Mostramos el resultado
print("Lista sin caracteres repetidos:", lista_sin_repetir)
