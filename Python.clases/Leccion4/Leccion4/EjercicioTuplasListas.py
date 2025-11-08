import math # Importamos la clase math para hacer uso de la funcion sqrt(raiz cuadrada)

# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) #Definimos tupla
#crear una lista que solo incluya los numeros menores a 5
# e imprimir por consola [1, 3, 2]

lista = [] #Definimos fla lista
#Filtramos los elementos menores a 5 de la tupla
for elementos in tupla:
    if elementos <5:
        lista.append(elementos)
print(lista)

# -----------------------------------------------
# EJEMPLO: filtrar pares y transformarlos (x2)
# -----------------------------------------------

# 1) Dada una tupla de números (inmutable)
tupla = (11, 4, 6, 3, 10, 5, 2, 8)

# 2) Objetivo:
#    Crear una lista con los números PARES de la tupla,
#    pero guardarlos multiplicados por 2, en el mismo orden.

pares_por_dos = []  # 3) Creamos una lista vacía donde acumularemos resultados

# 4) Recorremos la tupla elemento por elemento
for numero in tupla:
    print(f"Revisando: {numero}")            # a) debug: vemos el elemento actual
    es_par = (numero % 2 == 0)               # b) condición: ¿el número es par?
    print(f"  ¿Es par? {es_par}")

    if es_par:                               # c) si es par...
        transformado = numero * 2            #    ...lo transformamos (x2)
        print(f"  Lo multiplico por 2 -> {transformado}")
        pares_por_dos.append(transformado)   # d) y lo agregamos a la lista
        print(f"  Lista provisoria: {pares_por_dos}")
    else:
        print("  Es impar -> lo salto")      # e) si no, lo ignoramos

# 5) Al terminar el bucle mostramos el resultado final
print("Resultado final:", pares_por_dos)     # Esperado: [8, 12, 20, 4, 16]

#Ejercicio de matematicas
#Para sacar la raiz cuadrada de un numero positivo

numero = int(input('Digite un numero positivo'))
while numero < 0:
    print('Error -> Deberia ser un numero positivo')
    numero = int(input('Digite un numero positivo: '))
print(f'\nSu raiz cuadrada es: {math.sqrt(numero):.2f}')
