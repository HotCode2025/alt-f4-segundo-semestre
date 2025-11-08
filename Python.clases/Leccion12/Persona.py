class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other): # Other significa = otro
        return f'{self.nombre} {other.nombre}'

    def __sub__(self, other):
        return self.edad - other.edad

persona1 = Persona('Gabriel', 30)
persona2 = Persona('Jauregui', 4)

#persona1.__add__(persona2) sintaxis interna y automatica
print(persona1 + persona2)
print(persona1 - persona2)
