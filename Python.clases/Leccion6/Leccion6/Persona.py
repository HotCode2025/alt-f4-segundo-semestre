class Persona: # Creamos una clase
    def __init__(self,nombre,apellido, dni,edad, *args, **kwargs): # Se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.dni = dni #Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
    def mostrar_detalle(self): #self es igual a this
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.dni} {self.edad}, La direccion es: {self.args}, los datos importantes son: {self.kwargs}')

persona1 = Persona('Gabriel', 'Jauregui', 41907844,'26') #Necesitamos enviar argumentos
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

persona2 = Persona('Rocio', 'Velarde', 30321456,'25')
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

persona1.nombre = 'Veronica'
persona1.apellido = 'Jauregui'
persona1.edad = 20
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

#Los atributos son: caracteristicas
#Los metodos son: es el comportamiento que van a tener los objetos(acciones)
persona1.mostrar_detalle() #La referencia se pasa de manera automatica
persona2.mostrar_detalle()

#Persona.mostrar_detalle() Debemos pasarle una referencia para el self o dara error
persona1.telefono = '2622308188'
print(f'Este es el telefono de: {persona1.nombre} {persona1.telefono}')#Hemos creado un atributo de un objeto

#print(persona2.telefono)el objeto persona2 no tiene este atributo,error

persona3 = Persona('Rogelio','Romero',35789456,'22', 'Telefono','2611444557', 'Calle Lopez', 823, 'Manzana', 77, 'Casa',18, Altura=1.83, Peso=105, CFavorito='Azul', Auto='Citroen', Modelo=2021)
persona4 = Persona('Gabriel','Jauregui',41907844,'26', 'Telefono','2622308188', 'Calle Correa', 1767, 'Manzana', 1, 'Casa',10, Altura=1.65, Peso=70, CFavorito='Azul', Auto='Fiat Punto', Modelo=2008)
persona3.mostrar_detalle()
persona4.mostrar_detalle()
#print(persona3.dni) Esto no se debe utilizar(esta encapsulado),esto dice que desconocemos python
#persona3.__nombre Esta totalmente encapsulado

