from typing import TypeVar, Generic, List

# Definir el tipo genérico T
T = TypeVar('T')

# Enunciado:
# 3. Crea una clase genérica Catalogo<T> que almacene productos o libros.
# a) Agrega métodos para agregar y buscar elemento
class Catalogo(Generic[T]):
    def __init__(self):
        self.lista: List[T] = []

    def agregar(self, elemento: T):
        self.lista.append(elemento)

    def buscar(self, elemento: T) -> bool:
        return elemento in self.lista

    def mostrar(self):
        for elemento in self.lista:
            print(elemento)

# b) Prueba el catálogo con libros
# c) Prueba el catálogo con productos
def main():
    catalogo_libros = Catalogo[str]()
    catalogo_libros.agregar("El Principito")
    catalogo_libros.agregar("Cien años de soledad")

    print("¿Está 'El Principito'? ", catalogo_libros.buscar("El Principito"))
    catalogo_libros.mostrar()

    print()

    catalogo_productos = Catalogo[str]()
    catalogo_productos.agregar("Laptop Lenovo")
    catalogo_productos.agregar("Mouse Logitech")

    print("¿Está 'Mouse Logitech'? ", catalogo_productos.buscar("Mouse Logitech"))
    catalogo_productos.mostrar()

if __name__ == "__main__":
    main()
