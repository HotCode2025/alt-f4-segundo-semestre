#Ejercicio 1: crear una clase llamada Rectangulo, debe tener 2 atributos: altura, base
#Metodo calcular el area utilizando la formula area= base * altura
#Los datos base y altura deben ser ingresados por el usuario y los objetos deben ser tres

class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        area = self.base * self.altura
        return area

base_ingresada = float(input("Ingrese el valor para la base: "))
altura_ingresada = float(input("Ingrese el valor para la altura: "))

mi_rectangulo = Rectangulo(base_ingresada, altura_ingresada)
area_calculada = mi_rectangulo.calcular_area()
print(f"El area calculada es: {area_calculada}")
