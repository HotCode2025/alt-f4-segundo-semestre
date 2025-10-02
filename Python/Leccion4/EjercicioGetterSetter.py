class Persona2:
    def __init__(self, nombre, apellido, edad, telefono, peso, estatura):
        self._nombre = nombre  #el guion bajo me indica que esta encapsulado
        self._apellido = apellido
        self._edad = edad
        self._telefono = telefono
        self._peso = peso
        self._estatura = estatura

        def mostrar_detalle():
            print(f'Los datos a mostar son  los siguientes: {self._nombre}, {self._apellido}, {self._edad}, {self._telefono}, {self._peso}, {self._estatura}')

        @property  #decorador
        def nombre():  #metodo getter
            return self._nombre

        @nombre.setter
        def nombre():
            self._nombre = nombre

        @property
        def apellido():
            return self._apellido

        @apellido.setter
        def apellido():
            self._apellido = apellido

        @property
        def edad():
            return self._edad

        @edad.setter
        def edad():
            self._edad = edad
        @property
        def telefono():
            return self._telefono
        @telefono.setter
        def telefono():
            self._telefono = telefono

        @property
        def peso():
            return self._peso
        @peso.setter
        def peso():
            self._peso = peso

        @property
        def estatura():
            return self._estatura
        @estatura.setter
        def estatura():
            self._estatura = estatura



persona1 = Persona2('Ariel', 'Betancud', 41, 4469854, 78, 1.74)
print(persona1._nombre)  #llamamos al metodo getter
print(persona1._apellido)
print(persona1._edad)
persona1._nombre = 'Juan Pedro'#llamamos al metodo setter
print(persona1._telefono)
print(persona1._peso)
print(persona1._estatura)