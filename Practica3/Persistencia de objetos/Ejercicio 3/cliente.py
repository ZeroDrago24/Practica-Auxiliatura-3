# Enunciado:
# 3.- Sea el siguiente diagrama de clases:
# a) Implementar el diagrama de clases.
# b) Implementa buscarCliente(int c) a través del id.
# c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente junto al número de celular.

class Celular:
    def __init__(self, numero: str):
        self.numero = numero

    def __str__(self):
        return f"Celular: {self.numero}"

class Cliente:
    def __init__(self, id: int, nombre: str, celular: Celular):
        self.id = id
        self.nombre = nombre
        self.celular = celular

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, {self.celular}"

class Empresa:
    def __init__(self):
        self.clientes = []

    def guardarCliente(self, cliente: Cliente):
        self.clientes.append(cliente)

    def buscarCliente(self, c: int):
        for cli in self.clientes:
            if cli.id == c:
                return cli
        return None

    def buscarCelularCliente(self, c: int):
        for cli in self.clientes:
            if cli.id == c:
                return str(cli)
        return "Cliente no encontrado."

    def mostrar(self):
        for cli in self.clientes:
            print(cli)

def main():
    empresa = Empresa()
    empresa.guardarCliente(Cliente(1, "Ana", Celular("78945612")))
    empresa.guardarCliente(Cliente(2, "Pedro", Celular("71234567")))
    empresa.guardarCliente(Cliente(3, "Lucía", Celular("70112233")))

    empresa.mostrar()

    print("\nBuscar cliente con ID 2:")
    print(empresa.buscarCliente(2))

    print("\nBuscar celular de cliente con ID 3:")
    print(empresa.buscarCelularCliente(3))

if __name__ == "__main__":
    main()
