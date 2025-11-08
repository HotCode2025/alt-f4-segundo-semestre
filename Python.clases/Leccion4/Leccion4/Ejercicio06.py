# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10.

# Pedimos el número base de la tabla
num = int(input("Ingrese un número para su tabla de multiplicar: "))

tabla = []  # Lista donde guardamos los resultados

# i toma valores 1..10 y vamos agregando num*i a la lista
for i in range(1, 11):
    tabla.append(num * i)

# Mostramos la tabla completa dentro de la lista
print(f"\nTabla del {num} hasta el 10:", tabla)

# (Opcional) Mostrarla en formato lindo, una línea por resultado:
# for i, resultado in enumerate(tabla, start=1):
#     print(f"{num} x {i} = {resultado}")

