


class Persona2:
    def __init__(self,nombre,apellido,edad):#Esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalle(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property #decorador
    def nombre(self): #Metodo Getter
        print('Estamos utilizando el metodo get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre): #Metodo Setter
        print('Estamos utilizando el metodo set')
        self._nombre = nombre

    @property  # decorador
    def apellido(self):  # Metodo Getter
        print('Estamos utilizando el metodo get')
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):  # Metodo Setter
        print('Estamos utilizando el metodo set')
        self._apellido = apellido

    @property  # decorador
    def edad(self):  # Metodo Getter
        print('Estamos utilizando el metodo get')
        return self._edad

    @edad.setter
    def edad(self, edad):  # Metodo Setter
        print('Estamos utilizando el metodo set')
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}') #Metodo Destructor de objetos

persona1 = Persona2('Gabriel', 'Jauregui', 26)
print(persona1.nombre)#LLamamos al metodo getter
print(persona1.apellido)
print(persona1.edad)
persona1.nombre = 'Veronica' #LLamamos el metodo setter
print(persona1.nombre) #Otra vez con el metodo getter
print(persona1.mostrar_detalle()) #llamamos el metodo mostrar detalle

#Atributo read-only (solo lectura) seria la edad porque no tiene el metodo set
#print(persona1.edad)

print(__name__)



