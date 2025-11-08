class Monitor:

    contador_monitores = 0
    def __init__(self, marca, tamano):
        Monitor.contador_monitores += 1
        self._id_monitor = Monitor.contador_monitores
        self._marca = marca
        self._tamano = tamano

    def __str__(self):
        return f'Id: {self._id_monitor}, Marca: {self._marca}, Tamano: {self._tamano}'

if __name__ == '__main__':
    monitor1 = Monitor('HP', '15 Pulgadas')
    print(monitor1)
    monitor2 = Monitor('Samsung', '32 Pulgadas')
    print(monitor2)

        