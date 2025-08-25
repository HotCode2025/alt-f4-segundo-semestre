# Clase 3 - Segundo Semestre
# Ejercicio con diccionario para agregar 5 jugadores más de la selección Argentina

seleccionArgentina = {
    23: {'Nombre': 'Emiliano Martínez', 'Edad': 32, 'Altura': 1.95, 'Precio': '20 Millones', 'Posición': 'Arquero'},
    13: {'Nombre': 'Cristian Romero', 'Edad': 27, 'Altura': 1.85, 'Precio': '50 Millones', 'Posición': 'Defensor'},
    7: {'Nombre': 'Rodrigo De Paul', 'Edad': 31, 'Altura': 1.80, 'Precio': '25 Millones', 'Posición': 'Mediocampista'},
    10: {'Nombre': 'Lionel Messi','Edad': 38, 'Altura': 1.70, 'Precio': '18 Millones', 'Posición': 'Delantero'},
    3: {'Nombre': 'Nicolas Tagliafico', 'Edad': 32, 'Altura': 1.72, 'Precio': '6 Millones', 'Posición': 'Defensor'},
    24: {'Nombre': 'Nahuel Molina', 'Edad': 27, 'Altura': 1.78, 'Precio': '20 Millones', 'Posición': 'Defensor'},
    26: {'Nombre': 'Juan Foyth', 'Edad': 27, 'Altura': 1.87, 'Precio': '15 Millones', 'Posición': 'Defensor'},
    14: {'Nombre': 'Alexis Mac Allister','Edad': 26, 'Altura': 1.75, 'Precio': '100 Millones', 'Posición': 'Mediocampista'},
    18: {'Nombre': 'Exequiel Palacios', 'Edad': 26, 'Altura': 1.75, 'Precio': '40 Millones', 'Posición': 'Mediocampista'},
    9: {'Nombre': 'Julián Álvarez', 'Edad': 25, 'Altura': 1.70, 'Precio': '90 Millones', 'Posición': 'Delantero'},
}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)

print('Tenemos cargados en el diccionario la cantidad de jugadores: ', end='')
print(len(seleccionArgentina))    