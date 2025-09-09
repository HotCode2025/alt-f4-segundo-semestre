# Ejercicio 05: Convertidor de temperaturas

def celsius_a_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_a_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

c = float(input("Ingrese temperatura en Celsius: "))
print(f"{c}°C son {celsius_a_fahrenheit(c):.2f}°F")

f = float(input("Ingrese temperatura en Fahrenheit: "))
print(f"{f}°F son {fahrenheit_a_celsius(f):.2f}°C")