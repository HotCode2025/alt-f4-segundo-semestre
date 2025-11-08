# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud

# Pedimos una frase cualquiera (puede contener espacios)
frase = input("Ingrese una frase: ")

# Reemplazamos cada espacio " " por nada "" -> los quitamos
frase_sin_espacios = frase.replace(" ", "")

# len(cadena) devuelve la cantidad de caracteres de la cadena
longitud = len(frase_sin_espacios)

# Mostramos la nueva frase y su longitud
print(f"\nFrase sin espacios: {frase_sin_espacios}")
print(f"Número de caracteres (sin contar espacios): {longitud}")
