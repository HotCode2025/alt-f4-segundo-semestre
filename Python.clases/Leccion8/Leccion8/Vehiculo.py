"""
Definir una clase padre llamada Vehiculo y dos clases hijas llamadas
Auto y Bicicleta, las cuales heredan de la clase padre Vehiculo.
La clase padre debe tener los siguientes atributos y métodos:

Vehiculo (clase padre)
- Atributos (color, ruedas)
- Métodos (__init__(color, ruedas) y __str__())

Auto (clase hija de Vehiculo)
- Atributos (velocidad (km/hr))
- Métodos (__init__(color, ruedas, velocidad) y __str__())

Bicicleta (clase hija de Vehiculo)
- Atributos (tipo (urbana/montaña/etc.))
- Métodos (__init__(color, ruedas, tipo) y __str__())

Crear un objeto de cada clase
"""

# Clase padre
class Vehiculo:

    def __init__(self, color, ruedas):
        # Atributos encapsulados (privados por convención con "_")
        self._color = color
        self._ruedas = ruedas

    def __str__(self):
        # Devuelve una representación legible del objeto
        return f'Vehículo [Color: {self._color}, Ruedas: {self._ruedas}]'


# Clase hija Auto (hereda de Vehiculo)
class Auto(Vehiculo):


    def __init__(self, color, ruedas, velocidad):
        # Se llama al constructor de la clase padre
        super().__init__(color, ruedas)
        # Nuevo atributo específico de Auto
        self._velocidad = velocidad

    def __str__(self):
        # Devuelve los datos del Auto, incluyendo los del padre
        return f'Auto [Velocidad: {self._velocidad} km/h] | {super().__str__()}'


# Clase hija Bicicleta (hereda de Vehiculo)
class Bicicleta(Vehiculo):


    def __init__(self, color, ruedas, tipo):
        # Se llama al constructor del padre para inicializar color y ruedas
        super().__init__(color, ruedas)
        # Nuevo atributo específico de Bicicleta
        self._tipo = tipo

    def __str__(self):
        # Devuelve los datos de la Bicicleta, incluyendo los del padre
        return f'Bicicleta [Tipo: {self._tipo}] | {super().__str__()}'


# ------------------- BLOQUE PRINCIPAL -------------------
# Crear un objeto de cada clase y mostrar sus datos

# Objeto de la clase padre
vehiculo1 = Vehiculo("Rojo", 4)
print("1️⃣ Objeto de clase Vehiculo:")
print(vehiculo1)
print()

# Objeto de la clase hija Auto
auto1 = Auto("Azul", 4, 180)
print("2️⃣ Objeto de clase Auto (hereda de Vehiculo):")
print(auto1)
print()

# Objeto de la clase hija Bicicleta
bici1 = Bicicleta("Negro", 2, "Montaña")
print("3️⃣ Objeto de clase Bicicleta (hereda de Vehiculo):")
print(bici1)
