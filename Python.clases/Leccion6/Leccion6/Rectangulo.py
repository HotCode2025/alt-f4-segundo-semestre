# Creamos una clase llamada Rectangulo
class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo sera calcular area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por el usuario
    y los objetos deben ser tres
    """

    # Método constructor: se ejecuta automáticamente al crear un objeto
    def __init__(self, base, altura):
        # Guardamos los valores de base y altura dentro del objeto
        self.base = base
        self.altura = altura

    # Método para calcular el área del rectángulo
    def calcular_area(self):
        # Fórmula del área: base * altura
        area = self.base * self.altura
        # Devolvemos el resultado
        return area


# ---------------------- BLOQUE PRINCIPAL ----------------------

# Pedimos al usuario que ingrese los datos del rectángulo
base = float(input("Ingrese la base del rectángulo: "))
altura = float(input("Ingrese la altura del rectángulo: "))

rect1 = Rectangulo(base, altura)

# Mostramos los resultados en pantalla
print(f"El area del rectangulo es: {rect1.calcular_area()}")


