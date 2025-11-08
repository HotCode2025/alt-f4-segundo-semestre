# Ejercicio 5: Convertidor de Temperaturas
# Realizar dos funciones para convertir grados Celsius a Fahrenheit y viceversa.

# Función 1: Convertir de Celsius a Fahrenheit
def celsius_a_fahrenheit(celsius):
    """
    Convierte una temperatura de grados Celsius a Fahrenheit.
    Fórmula: (°C × 9/5) + 32
    """
    fahrenheit = (celsius * 9 / 5) + 32
    return fahrenheit


# Función 2: Convertir de Fahrenheit a Celsius
def fahrenheit_a_celsius(fahrenheit):
    """
    Convierte una temperatura de grados Fahrenheit a Celsius.
    Fórmula: (°F − 32) × 5/9
    """
    celsius = (fahrenheit - 32) * 5 / 9
    return celsius


# ---------------------- BLOQUE PRINCIPAL ----------------------

print("=== CONVERSOR DE TEMPERATURAS ===")
print("1. Celsius a Fahrenheit")
print("2. Fahrenheit a Celsius")

opcion = input("Seleccione una opción (1 o 2): ")

# Opción 1: Celsius → Fahrenheit
if opcion == "1":
    c = float(input("Ingrese la temperatura en grados Celsius: "))
    f = celsius_a_fahrenheit(c)
    print(f"{c}°C equivalen a {f}°F")

# Opción 2: Fahrenheit → Celsius
elif opcion == "2":
    f = float(input("Ingrese la temperatura en grados Fahrenheit: "))
    c = fahrenheit_a_celsius(f)
    print(f"{f}°F equivalen a {c}°C")

# Opción inválida
else:
    print("Opción no válida. Intente nuevamente.")
