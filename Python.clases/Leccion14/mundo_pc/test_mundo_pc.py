from mundo_pc.computadora import Computadora
from mundo_pc.monitor import Monitor
from mundo_pc.orden import Orden
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

teclado1 = Teclado('HP', 'USB')
monitor1 = Monitor('HP', '15 Pulgadas')
raton1 = Raton('HP' ,'USB' )
computadora1 = Computadora('HP', monitor1, teclado1, raton1)

teclado2 = Teclado('Apple', 'USB')
monitor2 = Monitor('Apple', '32 Pulgadas')
raton2 = Raton('Apple', 'Bluetooth')
computadora2 = Computadora('Apple', monitor2, teclado2, raton2)

teclado3 = Teclado('Samsung', 'USB')
monitor3 = Monitor('Samsung', '23 Pulgadas')
raton3 = Raton('Samsung' ,'USB' )
computadora3 = Computadora('Samsung', monitor3, teclado3, raton3)

teclado4 = Teclado('Dell', 'USB')
monitor4 = Monitor('Dell', '42 Pulgadas')
raton4 = Raton('Dell', 'Bluetooth')
computadora4 = Computadora('Dell', monitor4, teclado4, raton4)

teclado5 = Teclado('Lenovo', 'USB')
monitor5 = Monitor('Lenovo', '32 Pulgadas')
raton5 = Raton('Lenovo', 'Bluetooth')
computadora5 = Computadora('Lenovo', monitor5, teclado5, raton5)

computadora6 = Computadora('Acer', monitor3,teclado2,raton3)
computadora7 = Computadora('HP', monitor5,teclado4,raton1)

computadoras1 = [computadora1, computadora2, computadora7, computadora4]
orden1 = Orden(computadoras1)
orden1.agregar_computadora(computadora3)
print(orden1)

computadoras2 = [computadora3, computadora5, computadora6]
orden2 = Orden(computadoras2)
orden2.agregar_computadora(computadora1)
print(orden2)



