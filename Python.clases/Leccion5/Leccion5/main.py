#Comenzamos con Funciones
from pickle import PROTO


#Definimos una funcion
def mi_funcion(): #Para identificar a la funcion utilizamos parentesis
    print('Saludos a todos los alumnos de la Tecnicatura')

mi_funcion()# Estamos llamando a la funcion
mi_funcion() # se puede llamar a una funcion N cantidad de veces

#Desempaquetado de listas o list unpacking
def show(name, lastName):
    print(name+' '+lastName)
person = ['Ariel', 'Betancud']
show(person[0], person[1]) #Pasamos uno por uno los datos de la lista a la funcion
show(*person) # Esto es lo mismo que lo anterior pero la pasamos todo junto
person2 = ('Osvaldo', 'Giordanini')
show(*person2)
person3 = {'lastName':'Lucero', 'name':'Natalia'}
show(**person3)

numbers = [1,2,3,4,5]
for n in numbers:
    print(n)
else:
    print('Esto se termino')

# list comprehension, lista de comprension
names = ['Paolo', 'Rodrigo', 'Lupe', 'Pepe']
alongP = [p for p in names if p[0] == 'P'] #Esto regresa una nueva lista
print(alongP)

bottleC = [{'name': 'Quilmes', 'country': 'Arg'},
           {'name': 'Corona', 'country': 'Mx'},
           {'name': 'Stella Artois', 'country': 'Belgium'},
           ]
Arg = [b for b in bottleC if b ['country'] == 'Arg']
print(Arg)
print(bottleC)

#Paso de argumentos (Funciones)
def mi_funcion2(name, lastName):
    print('Saludos a todos los que ven a traves del canal de YouTube')
    print(f'Nombre: {name}, Apellido: {lastName}')
mi_funcion2('Jorge', 'Lucero')
mi_funcion2('Gabriel', 'Jauregui')
mi_funcion2('Nicolas', 'Viotto')

#La palabra return en funciones
#Creamos una funcion para sumar
def sumar(a,b):
    return a + b
resultado = sumar(78, 22)
print(f'El resultado de la suma es: {resultado}')
#print(f'El resultado de la suma es: {sumar(55, 45)}') otra forma de usar la funcion suma

def sumar2(a = 0, b = 0): #Le damos un valor por defauld
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')

# Argumentos, Variebles en funciones
def listaNombres(*nombres): #Normalmente se utiliza: *args
    for nombre in nombres: #se va a convertir en una tupla
        print(nombre)
listaNombres('Gabriel', 'Nicolas', 'Lautaro', 'Rocio', 'Maria')
listaNombres('Vero', 'Rosana', 'Facundo', 'Cesar')

def listaTerminos(**kwargs): #lo mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in kwargs.items(): #Kwargs significa: key word argument
        print(f'{llave} : {valor}')

listaTerminos()#No recibe nada,nada se va a mostrar
listaTerminos(IDE= 'integrated Develoment Enviromet', PK= 'Primaruy Key')
listaTerminos(Nombre= 'Leonel Messi')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
#desplegarNombres(10) No es un objeto iterable
desplegarNombres((10, 11)) #La convertimos a una TUPLA, en un solo elemento no olvidar la coma
desplegarNombres([22,55]) #La convertimos a una LISTA

#Funciones Recursivas
def factorial(numero):
    if numero == 1: #Caso base
        return 1
    else:
        return numero * factorial(numero-1) #caso recursivo

resultado = factorial(5) # lo hacemos en codigo duro
print(f'El factorial del numero 5 es: {resultado}')






