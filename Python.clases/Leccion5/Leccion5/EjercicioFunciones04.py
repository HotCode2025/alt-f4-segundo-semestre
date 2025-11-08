# Ejercicio 4: Calculadora de Impuestos
# Crear una función para calcular el total de un pago incluyendo un impuesto aplicado.
# Fórmula: total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)

# Definimos la función 'calcular_total'
def calcular_total(pago_sin_impuesto, impuesto):
    """
    Calcula el monto total de un pago sumando el impuesto al precio base.
    Parámetros:
      - pago_sin_impuesto: valor base (sin IVA)
      - impuesto: porcentaje del IVA
    """

    # Calculamos el monto total aplicando la fórmula
    total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
    return total


# ---------------------- BLOQUE PRINCIPAL ----------------------

# Pedimos los valores al usuario
pago_base = float(input("Ingrese el pago sin impuesto: "))
iva = float(input("Ingrese el porcentaje de impuesto (por ejemplo 21): "))

# Llamamos a la función y guardamos el resultado
pago_con_impuesto = calcular_total(pago_base, iva)

# Mostramos el resultado final
print(f"El pago total incluyendo el {iva}% de impuesto es: {pago_con_impuesto}")
