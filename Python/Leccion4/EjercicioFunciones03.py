# Ejercicio 03: Función Recursiva
# Imprimir números de n a 1 de manera descendente usando funciones recursivas

def imprimir_descendente(n):
    if n <= 0:  # Caso base: si es 0 o negativo, no imprime nada
        return
    print(n)
    imprimir_descendente(n - 1)  # Llamada recursiva

imprimir_descendente(5)