# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro de un rango

# Pedimos límites del rango (ambos incluidos)
inicio = int(input("Ingrese el número inicial del rango: "))
fin = int(input("Ingrese el número final del rango: "))

suma = 0  # Acumulador para ir sumando solo pares

# Recorremos desde inicio hasta fin (sumamos 1 porque el final es inclusivo)
for i in range(inicio, fin + 1):
    if i % 2 == 0:  # Si el residuo de dividir por 2 es 0, es par
        suma += i   # Acumulamos

# Mostramos el total
print(f"La suma de los números pares entre {inicio} y {fin} es: {suma}")

