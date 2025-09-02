# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

numero = int(input("Ingresa un número positivo: "))
factorial = 1

if numero >= 0:
    for i in range(1, numero + 1):
        factorial *= i
    print(f"El factorial de {numero} es: {factorial}")
else:
    print("Por favor ingresa un número positivo")