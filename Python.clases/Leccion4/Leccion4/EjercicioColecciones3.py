# Ejercicio 3: Agregar personajes a una lista
# Escriba un Programa donde cree una lista con los siguientes personajes del senor de los anillos

# Creamos una lista vacía para guardar los personajes
personajes = []

# Agregamos los personajes como diccionarios
personajes.append({"Nombre": "Aragorn", "Clase": "Guerrero", "Raza": "Dúnadan del norte"})
personajes.append({"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"})
personajes.append({"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sîndar"})

# Mostramos los personajes
print("Lista de personajes del Señor de los Anillos:\n")

for personaje in personajes:
    print(f"Nombre: {personaje['Nombre']}")
    print(f"Clase: {personaje['Clase']}")
    print(f"Raza: {personaje['Raza']}\n")
