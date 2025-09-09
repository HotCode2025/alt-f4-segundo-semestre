# Ejercicio 02: Función con *args para multiplicar

def multiplicar(*args):
    resultado = 1
    for num in args:
        resultado *= num
    return resultado

print("Multiplicación 1:", multiplicar(2, 3, 4))
print("Multiplicación 2:", multiplicar(5, 10))
print("Multiplicación 3:", multiplicar(1, 2, 3, 4, 5))