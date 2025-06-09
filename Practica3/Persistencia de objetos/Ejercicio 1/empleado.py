# Enunciado:
# 1. Sea el siguiente diagrama de clases:
# a) Implementa el método guardarEmpleado(Empleado e) para almacenar empleados.
# b) Implementa buscaEmpleado(String n) a través del nombre.
# c) Implementa mayorSalario(float sueldo), que devuelva el primer empleado con sueldo mayor al ingresado.

class Empleado:
    def __init__(self, nombre: str, salario: float):
        self.nombre = nombre
        self.salario = salario

    def __str__(self):
        return f"Nombre: {self.nombre}, Salario: {self.salario}"

class Empresa:
    def __init__(self):
        self.empleados = []

    def guardarEmpleado(self, e: Empleado):
        self.empleados.append(e)

    def buscaEmpleado(self, n: str):
        for e in self.empleados:
            if e.nombre.lower() == n.lower():
                return e
        return None

    def mayorSalario(self, sueldo: float):
        for e in self.empleados:
            if e.salario > sueldo:
                return e
        return None

    def mostrar(self):
        for e in self.empleados:
            print(e)

def main():
    empresa = Empresa()
    empresa.guardarEmpleado(Empleado("Carlos", 3000))
    empresa.guardarEmpleado(Empleado("María", 4500))
    empresa.guardarEmpleado(Empleado("Luis", 2500))

    empresa.mostrar()

    print("Buscando a María:", empresa.buscaEmpleado("María"))
    print("Empleado con sueldo mayor a 2800:", empresa.mayorSalario(2800))

if __name__ == "__main__":
    main()
