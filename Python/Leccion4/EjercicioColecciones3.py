# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
# Nombre: Aragorn
# Clase: Guerrero  
# Raza: Dunadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

# Creamos una lista con diccionarios para cada personaje
personajes = [
    {
        'Nombre': 'Aragorn',
        'Clase': 'Guerrero', 
        'Raza': 'Dunadan del norte'
    },
    {
        'Nombre': 'Gandalf',
        'Clase': 'Mago',
        'Raza': 'Istar'
    },
    {
        'Nombre': 'Legolas',
        'Clase': 'Arquero',
        'Raza': 'Elfo Sindar'
    }
]

# Mostramos los personajes
for personaje in personajes:
    print(f"Nombre: {personaje['Nombre']}")
    print(f"Clase: {personaje['Clase']}")
    print(f"Raza: {personaje['Raza']}")
    print() # Línea en blanco