# Ejercicio 8: Menú interactivo - Cajero automático

# Estado inicial de la cuenta
saldo = 1000.0  # Usamos float por si hay decimales

# Bucle del menú principal: se repite hasta elegir 'Salir'
while True:
    print("\n===== MENÚ CAJERO AUTOMÁTICO =====")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")

    opcion = input("Elija una opción: ")

    if opcion == "1":
        # Depositar: sumamos al saldo
        ingreso = float(input("Ingrese la cantidad de dinero a depositar: "))
        saldo += ingreso
        print(f"💰 Dinero ingresado correctamente. Nuevo saldo: ${saldo:.2f}")

    elif opcion == "2":
        # Retirar: verificamos fondos suficientes
        retiro = float(input("Ingrese la cantidad a retirar: "))
        if retiro <= saldo:
            saldo -= retiro
            print(f"💸 Retiro exitoso. Saldo restante: ${saldo:.2f}")
        else:
            print("⚠️ Fondos insuficientes.")

    elif opcion == "3":
        # Consultar saldo
        print(f"Tu saldo actual es: ${saldo:.2f}")

    elif opcion == "4":
        # Salir del programa
        print("👋 Gracias por usar el cajero. ¡Hasta luego!")
        break

    else:
        # Opción inválida
        print("Opción inválida. Intente de nuevo.")
