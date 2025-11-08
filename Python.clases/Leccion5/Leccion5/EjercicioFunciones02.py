# Ejercicio 02: Función con *args para multiplicar
# Crear una función para multiplicar los valores recibidos de tipo numérico,
# utilizando argumentos variables *args como parámetro de la función
# y regresar como resultado la multiplicación de todos los valores pasados como argumento.

# Definimos una función llamada 'multiplicar' que puede recibir muchos valores numéricos
def multiplicar(*args):
    """
    La función 'multiplicar' recibe múltiples números gracias a *args.
    *args los guarda en una tupla.
    Ejemplo: multiplicar(2, 3, 4) → args = (2, 3, 4)
    """

    # Inicializamos una variable acumuladora con 1 (no con 0, porque si multiplicamos por 0 da siempre 0)
    total = 1

    # Recorremos cada número dentro de los argumentos recibidos
    for numero in args:
        total *= numero  # Multiplicamos el acumulado por el número actual

    # Retornamos el resultado final de la multiplicación
    return total


# ---------------------- BLOQUE PRINCIPAL DEL PROGRAMA ----------------------

# Llamamos a la función pasando varios valores
resultado = multiplicar(2, 4, 3)

# Mostramos el resultado por pantalla
print("El resultado de multiplicar los valores es:", resultado)
