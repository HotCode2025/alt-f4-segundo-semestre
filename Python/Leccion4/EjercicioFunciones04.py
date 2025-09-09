# Ejercicio 04: Calculadora de Impuestos

def calcular_pago_con_impuesto(pago_sin_impuesto, impuesto):
    return pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)

pago = float(input("Proporcione el pago sin impuesto: "))
impuesto = float(input("Proporcione el monto del impuesto (%): "))

pago_total = calcular_pago_con_impuesto(pago, impuesto)
print(f"Pago con impuesto: {pago_total}")