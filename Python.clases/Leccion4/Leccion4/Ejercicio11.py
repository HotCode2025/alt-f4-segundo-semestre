# Ejercicio 11: Agenda Telefónica
# Hacer un programa que simule una agenda de contactos. crear un
#diccionario donde la clave sea el nombre del usuario y el valor
#sea el telefono, el programa tendra el siguiente menu de opciones:
# 1.Nuevo contacto
# 2.Borrar contacto
# 3.Ver contacto existentes
# 4.Salir

# Creamos un diccionario vacío para guardar los contactos
agenda = {}

# Iniciamos un bucle para mostrar el menú hasta que el usuario elija salir
while True:
    print("\n=== AGENDA TELEFÓNICA ===")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

    opcion = input("Elija una opción (1-4): ")

    # Opción 1: Agregar contacto
    if opcion == "1":
        nombre = input("Ingrese el nombre del contacto: ")
        telefono = input("Ingrese el número de teléfono: ")
        agenda[nombre] = telefono  # Guardamos el contacto en el diccionario
        print(f"Contacto '{nombre}' agregado correctamente.")

    # Opción 2: Borrar contacto
    elif opcion == "2":
        nombre = input("Ingrese el nombre del contacto a borrar: ")
        if nombre in agenda:
            del agenda[nombre]
            print(f"Contacto '{nombre}' eliminado.")
        else:
            print("El contacto no existe.")

    # Opción 3: Ver contactos existentes
    elif opcion == "3":
        if len(agenda) == 0:
            print("No hay contactos guardados.")
        else:
            print("\n--- Contactos ---")
            for nombre, telefono in agenda.items():
                print(f"{nombre}: {telefono}")

    # Opción 4: Salir
    elif opcion == "4":
        print("Saliendo de la agenda...")
        break

    # Si el usuario elige una opción inválida
    else:
        print("Opción no válida, intente nuevamente.")
