# Ejercicio 01: Crear una función para sumar los valores recibidos de tipo numérico,
# utilizando argumentos variables *args como parámetro de la función
# y devolver como resultado la suma de todos los valores pasados como argumentos.

# Definimos una función llamada 'sumar' que puede recibir una cantidad variable de valores numéricos
def sumar(*args):
    """
    La función 'sumar' usa *args para aceptar múltiples números.
    *args convierte todos los valores que pasemos en una tupla.
    Ejemplo: sumar(2, 3, 4) → args = (2, 3, 4)
    """

    # Inicializamos una variable para acumular la suma
    total = 0

    # Recorremos cada número que se haya pasado a la función
    for numero in args:
        total += numero  # Se va sumando cada valor al total

    # Retornamos la suma total
    return total


# ---------------------- BLOQUE PRINCIPAL DEL PROGRAMA ----------------------

# Llamamos a la función 'sumar' pasando varios números como argumentos
resultado = sumar(5, 10, 15, 20)

# Mostramos el resultado por pantalla
print("La suma total de los valores ingresados es:", resultado)
