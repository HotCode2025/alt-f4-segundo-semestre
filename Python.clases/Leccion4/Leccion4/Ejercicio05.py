# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

# El factorial de n (n!) es 1*2*3*...*n. Por convenio, 0! = 1.
num = int(input("Ingrese un número entero (>= 0): "))

# Validamos que no sea negativo
if num < 0:
    print("No se puede calcular el factorial de un número negativo.")
else:
    factorial = 1   # Identidad multiplicativa: empezar en 1
    # Multiplicamos todos los enteros desde 1 hasta num
    for i in range(1, num + 1):
        factorial *= i
    print(f"El factorial de {num} es: {factorial}")

