# Ejercicio 11: Agenda telefónica
# Hacer un programa que simule una agenda de contactos.
# Crear un diccionario donde la clave sea el nombre del usuario y el valor sea el teléfono.

agenda = {}

while True:
    print("\n- AGENDA -")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

    opcion = input("Elige una opción: ")

    if opcion == "1":
        nombre = input("Nombre del contacto: ")
        telefono = input("Teléfono: ")
        agenda[nombre] = telefono
        print(f"Contacto {nombre} agregado correctamente.")

    elif opcion == "2":
        nombre = input("Nombre del contacto a borrar: ")
        if nombre in agenda:
            del agenda[nombre]
            print(f"Contacto {nombre} eliminado.")
        else:
            print("El contacto no existe en la agenda.")

    elif opcion == "3":
        if agenda:
            print("\n--- Contactos en la agenda ---")
            for nombre, telefono in agenda.items():
                print(f"{nombre}: {telefono}")
        else:
            print("La agenda está vacía.")

    elif opcion == "4":
        print("Saliendo de la agenda...")
        break

    else:
        print("Opción no válida. Intenta nuevamente.")