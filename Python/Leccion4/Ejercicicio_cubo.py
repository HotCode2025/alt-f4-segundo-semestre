#Ejercicio Cubo: crear la clase cubo con los atributos: ancho, alto y profundidad
#con un metodo calular_volumen con la formula
#volumen = ancho * altura * profundiad
#el usuario debe ingresar los valores

class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        volumen = self.ancho * self.alto * self.profundidad
        return volumen

ancho_ingresado = float(input("Ingrese ancho del cubo: "))
alto_ingresado = float(input("Ingrese alto del cubo: "))
profundidad_ingresado = float(input("Ingrese profundida del cubo: "))

mi_cubo = Cubo(ancho_ingresado, alto_ingresado, profundidad_ingresado)
volumen_calculado = mi_cubo.calcular_volumen()
print(f"El volumen calculado es: {volumen_calculado}")

