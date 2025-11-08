# Clase 15 - Sobrecarga de Operadores

# Básicamente, la sobrecarga de un operador significa que un mismo operador 
# puede comportarse de diferentes formas.

# Por ejemplo, el operador de suma (+)
# El operador de suma es un buen ejemplo de la sobrecarga de operadores.

# Este operador se puede comportar de maneras distintas dependiendo si está 
# trabajando con tipos string, con tipos enteros o, por ejemplo, con tipos lista.

# Así que dependiendo del tipo con el que esté trabajando, 
# es el tipo de resultado que vamos a obtener.

# Por lo tanto, un mismo operador puede trabajar de distintas formas.
# Esto se conoce como sobrecarga de operadores.


# ==== Ejemplos ====

# Caso 1
a = 2
b = 3
print(a + b)   # Resultado: 5 (suma de enteros)

# Caso 2
a = 'Hola '
b = 'Mundo'
print(a + b)   # Resultado: 'Hola Mundo' (concatenación de cadenas)


# En ese segundo caso, en lugar de obtener una suma, obtenemos una concatenación 
# de tipos string o tipos cadena, y entonces con eso estamos obteniendo 
# la sobrecarga del operador.

# Si tenemos tipos numéricos, se comporta de una forma, 
# y si tenemos tipos string, se comporta de otra forma.


# ==== Ejemplo con listas ====
a = [3, 4, 5]
b = [6, 7, 8, 9]
print(a + b)   # Resultado: [3, 4, 5, 6, 7, 8, 9] (unión de listas)

# Se va a comportar de manera diferente, obtenemos la unión de las dos listas, 
# creando una sola.

# Es el mismo operador, pero dependiendo del tipo de dato con el que estemos 
# trabajando va a ser el resultado.


# ==== Sobrecarga con clases ====
# Ahora la pregunta es si esto mismo lo podemos hacer con clases en Python.
# Y la respuesta es que sí, pero tenemos que agregar la sobrecarga de un método 
# dependiendo del operador que queramos sobrecargar.

# Por ejemplo, esta es la lista de métodos según el operador que queramos sobrecargar.
# Todos están definidos en la clase 'object'.


# ==== Operadores Aritméticos y sus métodos mágicos ====
# Operador     Magic Method
# +            __add__(self, other)
# -            __sub__(self, other)
# *            __mul__(self, other)
# /            __truediv__(self, other)
# //           __floordiv__(self, other)
# %            __mod__(self, other)
# **           __pow__(self, other)


# ==== Operadores de Comparación (lógicos) ====
# <            __lt__(self, other)
# >            __gt__(self, other)
# <=           __le__(self, other)
# >=           __ge__(self, other)
# ==           __eq__(self, other)
# !=           __ne__(self, other)


# Entonces tenemos que sobreescribir el método respectivo definido en la clase Object.
# En ese caso, si queremos sobrecargar la suma, entonces tenemos que sobreescribir 
# el método de __add__.

# Todos son métodos de tipo "dunder" (double underscore).
# Esto quiere decir que están definidos en la clase Object.

# Si queremos sobrecargar el operador de resta, entonces tenemos que sobreescribir 
# el método de __sub__.


# ==== Diferencia entre Sobrecarga y Sobreescritura ====
# Ahora, la sobrecarga y la sobreescritura son dos conceptos diferentes.

# Recordemos que la sobrecarga de un operador significa que se puede comportar 
# de maneras distintas dependiendo de los operandos con los cuales esté trabajando,
# y la sobreescritura tiene que ver con herencia.

# Así que en este caso estaríamos sobreescribiendo un método definido 
# en una clase padre. Son conceptos muy distintos:
# - Sobrecarga de operadores.
# - Sobreescritura de métodos.


# ==== Operadores de asignación (compuestos) ====
# Operador     Magic Method
# -=           __isub__(self, other)
# +=           __iadd__(self, other)
# *=           __imul__(self, other)
# /=           __idiv__(self, other)
# //=          __ifloordiv__(self, other)
# %=           __imod__(self, other)
# **=          __ipow__(self, other)

# Aquí están todas estas tablas con todos los operadores que podemos sobrecargar.

# Por ejemplo, tenemos también más operadores, como pueden ser los operadores 
# de menor que, mayor que, menor igual, mayor igual, etc.


# ==== Operadores unarios ====
# Con los cuales solamente trabajamos con un solo operando.

# Operador     Magic Method
# -            __neg__(self, other)
# +            __pos__(self, other)
# ~            __invert__(self, other)

# Así que les vamos a entregar esta tabla en caso de que necesiten 
# sobrecargar alguno de estos operadores.

# Ya saben cuál es el método que tienen que sobreescribir de la clase Object.
