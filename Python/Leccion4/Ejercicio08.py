# Ejercicio 8: Menu interactivo - Cajero automatico
# Hacer un programa que simule un cajero automatico con un saldo
# Inicial de 1000$ y tendra el siguiente menu de opciones:
# 1. Ingresar dinero en la cuenta
# 2. Retirar dinero en la cuenta
# 3. Mostrar dinero disponible
# 4. Salir

saldo = 1000

while True:
	print("\n--- Cajero Automático ---")
	print("1. Ingresar dinero en la cuenta")
	print("2. Retirar dinero en la cuenta")
	print("3. Mostrar dinero disponible")
	print("4. Salir")
	opcion = input("Seleccione una opción (1-4): ")

	if opcion == "1":
		monto = float(input("Ingrese el monto a depositar: $"))
		saldo += monto
		print(f"Dinero ingresado correctamente. Saldo actual: ${saldo}")
	elif opcion == "2":
		monto = float(input("Ingrese el monto a retirar: $"))
		if monto > saldo:
			print("Fondos insuficientes.")
		else:
			saldo -= monto
			print(f"Dinero retirado correctamente. Saldo actual: ${saldo}")
	elif opcion == "3":
		print(f"Dinero disponible: ${saldo}")
	elif opcion == "4":
		print("Gracias por usar el cajero automático!")
		break
	else:
		print("Opción inválida. Intente nuevamente.")





