# Ejercicio 01: Función con *args para sumar valores

def sumar(*args):
    return sum(args)

resultado1 = sumar(1, 2, 3, 4, 5)
resultado2 = sumar(10, 20, 30)

print("Suma 1:", resultado1)
print("Suma 2:", resultado2)
