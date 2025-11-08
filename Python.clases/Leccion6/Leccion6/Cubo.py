# Creamos una clase llamada Cubo
class Cubo:
    """
    Crear la clase cubo con los atributos,ancho, alto y profundidad,con
    el metodo calcular_volumen que tendra la formula:
    volumen = ancho * altura * profundidad
    que el usuario ingrese los valores
    """

    # Método constructor: inicializa los atributos del cubo
    def __init__(self, ancho, alto, profundidad):
        # Guardamos los valores dentro del objeto
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    # Método para calcular el volumen del cubo
    def calcular_volumen(self):
        # Fórmula del volumen: ancho * alto * profundidad
        volumen = self.ancho * self.alto * self.profundidad
        # Devolvemos el resultado
        return volumen


# ---------------------- BLOQUE PRINCIPAL ----------------------

# Pedimos los valores al usuario
ancho = float(input("Ingrese el ancho del cubo: "))
alto = float(input("Ingrese el alto del cubo: "))
profundidad = float(input("Ingrese la profundidad del cubo: "))

# Creamos un objeto de tipo Cubo con los valores ingresados
cubo1 = Cubo(ancho, alto, profundidad)

# Mostramos el volumen calculado
print(f"\nEl volumen del cubo es: {cubo1.calcular_volumen()}")
