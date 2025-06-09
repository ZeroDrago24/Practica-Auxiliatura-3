from typing import TypeVar, Generic, List, Optional

# Definir tipo genérico T
T = TypeVar('T')

# Enunciado:
# 5. Crea una clase genérica Pila<T>
# a) Implementa un método para apilar
# b) Implementa un método para desapilar
# c) Prueba la pila con diferentes tipos de datos
# d) Muestra los datos de la pila

class Pila(Generic[T]):
    def __init__(self):
        self.pila: List[T] = []

    def apilar(self, elemento: T):
        self.pila.append(elemento)

    def desapilar(self) -> Optional[T]:
        if self.pila:
            return self.pila.pop()
        else:
            return None

    def mostrar(self):
        for elemento in self.pila:
            print(elemento)

# c) Prueba la pila con diferentes tipos de datos
def main():
    pila_textos = Pila[str]()
    pila_textos.apilar("Hola")
    pila_textos.apilar("Mundo")
    pila_textos.mostrar()
    print("Desapilado:", pila_textos.desapilar())

    print()

    pila_numeros = Pila[int]()
    pila_numeros.apilar(1)
    pila_numeros.apilar(2)
    pila_numeros.mostrar()
    print("Desapilado:", pila_numeros.desapilar())

if __name__ == "__main__":
    main()
