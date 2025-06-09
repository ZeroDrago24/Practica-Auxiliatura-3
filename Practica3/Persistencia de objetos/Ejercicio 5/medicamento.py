# Enunciado:
# 5.- Sea el siguiente diagrama de clases:
# a) Crear, leer y mostrar un Archivo de Farmacias
# b) Mostrar los medicamentos para la tos, de la Sucursal numero X
# c) Mostrar el número de sucursal y su dirección que tienen el medicamento “Golpex”

class Medicamento:
    def __init__(self, nombre: str, tipo: str):
        self.nombre = nombre
        self.tipo = tipo

    def __str__(self):
        return f"Medicamento: {self.nombre}, Tipo: {self.tipo}"

class Sucursal:
    def __init__(self, numero: int, direccion: str):
        self.numero = numero
        self.direccion = direccion
        self.medicamentos = []

    def agregarMedicamento(self, medicamento: Medicamento):
        self.medicamentos.append(medicamento)

    def mostrarMedicamentosParaLaTos(self):
        for medicamento in self.medicamentos:
            if medicamento.tipo.lower() == "tos":
                print(medicamento)

    def contieneMedicamento(self, nombre: str) -> bool:
        for medicamento in self.medicamentos:
            if medicamento.nombre.lower() == nombre.lower():
                return True
        return False

    def __str__(self):
        return f"Sucursal N°: {self.numero}, Dirección: {self.direccion}"

class Farmacia:
    def __init__(self):
        self.sucursales = []

    def agregarSucursal(self, sucursal: Sucursal):
        self.sucursales.append(sucursal)

    def mostrarArchivo(self):
        for sucursal in self.sucursales:
            print(sucursal)
            for medicamento in sucursal.medicamentos:
                print("  " + str(medicamento))

    def mostrarMedicamentosTosSucursal(self, numSucursal: int):
        for sucursal in self.sucursales:
            if sucursal.numero == numSucursal:
                print(f"Medicamentos para la tos en {sucursal}:")
                sucursal.mostrarMedicamentosParaLaTos()

    def buscarSucursalesConMedicamento(self, nombreMedicamento: str):
        for sucursal in self.sucursales:
            if sucursal.contieneMedicamento(nombreMedicamento):
                print(f"Encontrado en {sucursal}")

def main():
    farmacia = Farmacia()

    s1 = Sucursal(1, "Av. Villazón #123")
    s1.agregarMedicamento(Medicamento("Golpex", "Tos"))
    s1.agregarMedicamento(Medicamento("Paracetamol", "Fiebre"))

    s2 = Sucursal(2, "Calle Murillo #456")
    s2.agregarMedicamento(Medicamento("Ibuprofeno", "Dolor"))
    s2.agregarMedicamento(Medicamento("Golpex", "Tos"))

    farmacia.agregarSucursal(s1)
    farmacia.agregarSucursal(s2)

    # Mostrar archivo
    farmacia.mostrarArchivo()

    print()

    # Mostrar medicamentos para la tos en sucursal 1
    farmacia.mostrarMedicamentosTosSucursal(1)

    print()

    # Mostrar sucursales que tienen el medicamento "Golpex"
    farmacia.buscarSucursalesConMedicamento("Golpex")

if __name__ == "__main__":
    main()
