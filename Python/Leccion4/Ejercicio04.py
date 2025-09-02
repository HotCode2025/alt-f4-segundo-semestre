# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro
# de un rango, por ejemplo:
# suma de números pares del 2 al 30
# suma = 240

# Definimos el rango
inicio = 2
fin = 30
suma = 0

print(f"Suma de números pares del {inicio} al {fin}")

# Recorremos el rango y sumamos solo los números pares
for numero in range(inicio, fin + 1):
    if numero % 2 == 0:
        suma += numero

print(f"suma = {suma}")