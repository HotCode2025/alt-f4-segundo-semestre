# Ejercicio 7: Juego adivina el número
# Realizar un juego donde el usuario debe adivinar un número entre 1 y 100

import random  # Módulo para generar números aleatorios

# Generamos el número secreto en el rango [1, 100]
numero_secreto = random.randint(1, 100)

intentos = 0  # Contador de intentos del usuario

print("🎲 Adivina el número (entre 1 y 100)")

# Bucle hasta que el usuario adivine
while True:
    intento = int(input("Ingresa tu número: "))
    intentos += 1  # Aumentamos el contador cada vez que se intenta

    if intento < numero_secreto:
        print("El número es mayor 🔺")  # Pista
    elif intento > numero_secreto:
        print("El número es menor 🔻")  # Pista
    else:
        # Acertó: salimos del bucle con break
        print(f"🎉 ¡Adivinaste! El número era {numero_secreto}")
        print(f"Intentos realizados: {intentos}")
        break

