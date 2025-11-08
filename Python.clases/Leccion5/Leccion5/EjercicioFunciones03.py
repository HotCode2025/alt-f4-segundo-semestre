# Ejercicio 3: Función Recursiva
# Imprimir números de 5 a 1 de manera descendente usando funciones recursivas.
# Puede ser cualquier valor positivo. Si se pasa 5, debe imprimir: 5 4 3 2 1
# Si el número es negativo, no imprime nada.

# Definimos una función recursiva llamada 'imprimir_descendente'
def imprimir_descendente(numero):
    """
    Esta función imprime los números de forma descendente desde el valor dado hasta 1.
    Usa recursividad: la función se llama a sí misma con un valor menor.
    """

    # Caso base: si el número es menor o igual a 0, la función se detiene (no hace nada)
    if numero <= 0:
        return
    else:
        # Imprimimos el número actual
        print(numero)
        # Llamamos nuevamente a la función, restando 1
        imprimir_descendente(numero - 1)


# ---------------------- BLOQUE PRINCIPAL ----------------------

# Pedimos al usuario que ingrese un número positivo
n = int(input("Ingrese un número positivo: "))

# Llamamos a la función con el número ingresado
imprimir_descendente(n)
