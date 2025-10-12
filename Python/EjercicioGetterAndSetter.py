#Tarea crear tres objetos mas, utilizando los metodos getter and setter
#para modificar, y mostrar los cambios con el metodo mostrar detalles

class Persona:
    def __init__(self, nombre, apellido, edad):
        self.__nombre = nombre      # atributo privado
        self.__apellido = apellido  # atributo privado
        self.__edad = edad          # atributo privado

    # --- Getters ---
    def get_nombre(self):
        return self.__nombre

    def get_apellido(self):
        return self.__apellido

    def get_edad(self):
        return self.__edad

    # --- Setters ---
    def set_nombre(self, nuevo_nombre):
        self.__nombre = nuevo_nombre

    def set_apellido(self, nuevo_apellido):
        self.__apellido = nuevo_apellido

    def set_edad(self, nueva_edad):
        self.__edad = nueva_edad

    # --- Método para mostrar detalles ---
    def mostrar_detalles(self):
        print(f"Nombre: {self.__nombre} {self.__apellido}, Edad: {self.__edad}")


# --- Creación de objetos ---
persona1 = Persona("Gabriel", "Jauregui", 25)
persona2 = Persona("Lucía", "Pérez", 30)
persona3 = Persona("Tomás", "Gómez", 22)
persona4 = Persona("Carla", "Rodríguez", 28)

# --- Mostrar detalles originales ---
print("Detalles originales:")
persona1.mostrar_detalles()
persona2.mostrar_detalles()
persona3.mostrar_detalles()
persona4.mostrar_detalles()

# --- Modificar valores usando setters ---
persona2.set_edad(31)
persona3.set_nombre("Tomás Ezequiel")
persona4.set_apellido("Fernández")

# --- Mostrar los cambios ---
print("\nDetalles modificados:")
persona2.mostrar_detalles()
persona3.mostrar_detalles()
persona4.mostrar_detalles()

