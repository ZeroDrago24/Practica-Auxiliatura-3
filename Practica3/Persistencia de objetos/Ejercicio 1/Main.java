// Enunciado:
// 1. Sea el siguiente diagrama de clases:
// a) Implementa el método guardarEmpleado(Empleado e) para almacenar empleados.
// b) Implementa buscaEmpleado(String n) a través del nombre.
// c) Implementa mayorSalario(float sueldo), que devuelva el primer empleado con sueldo mayor al ingresado.

import java.util.ArrayList;

class Empleado {
    String nombre;
    float salario;

    public Empleado(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Salario: " + salario;
    }
}

class Empresa {
    ArrayList<Empleado> empleados = new ArrayList<>();

    public void guardarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public Empleado buscaEmpleado(String n) {
        for (Empleado e : empleados) {
            if (e.nombre.equalsIgnoreCase(n)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        for (Empleado e : empleados) {
            if (e.salario > sueldo) {
                return e;
            }
        }
        return null;
    }

    public void mostrar() {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.guardarEmpleado(new Empleado("Carlos", 3000));
        empresa.guardarEmpleado(new Empleado("María", 4500));
        empresa.guardarEmpleado(new Empleado("Luis", 2500));

        empresa.mostrar();

        System.out.println("Buscando a María: " + empresa.buscaEmpleado("María"));
        System.out.println("Empleado con sueldo mayor a 2800: " + empresa.mayorSalario(2800));
    }
}
