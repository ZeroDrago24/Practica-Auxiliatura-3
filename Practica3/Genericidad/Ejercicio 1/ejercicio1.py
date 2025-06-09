from typing import TypeVar, Generic

# Definir el tipo genérico T
T = TypeVar('T')

# Enunciado:
# 1. Crea una clase genérica Caja<T> para guardar algún tipo de objeto
# a) Agrega métodos guardar() y obtener()
class Caja(Generic[T]):
    def __init__(self):
        self.objeto: T = None

    def guardar(self, objeto: T):
        self.objeto = objeto

    def obtener(self) -> T:
        return self.objeto

# b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
# c) Muestra el contenido de las cajas
def main():
    caja_texto = Caja[str]()
    caja_texto.guardar("Hola mundo!")

    caja_numero = Caja[int]()
    caja_numero.guardar(2025)

    print("Contenido de caja_texto:", caja_texto.obtener())
    print("Contenido de caja_numero:", caja_numero.obtener())

if __name__ == "__main__":
    main()
