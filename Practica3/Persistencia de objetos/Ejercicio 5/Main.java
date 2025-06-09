// Enunciado:
// 5.- Sea el siguiente diagrama de clases:
// a) Crear, leer y mostrar un Archivo de Farmacias
// b) Mostrar los medicamentos para la tos, de la Sucursal numero X
// c) Mostrar el número de sucursal y su dirección que tienen el medicamento “Golpex”

import java.util.ArrayList;

class Medicamento {
    String nombre;
    String tipo;

    public Medicamento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String toString() {
        return "Medicamento: " + nombre + ", Tipo: " + tipo;
    }
}

class Sucursal {
    int numero;
    String direccion;
    ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public Sucursal(int numero, String direccion) {
        this.numero = numero;
        this.direccion = direccion;
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public void mostrarMedicamentosParaLaTos() {
        for (Medicamento m : medicamentos) {
            if (m.tipo.equalsIgnoreCase("Tos")) {
                System.out.println(m);
            }
        }
    }

    public boolean contieneMedicamento(String nombre) {
        for (Medicamento m : medicamentos) {
            if (m.nombre.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Sucursal N°: " + numero + ", Dirección: " + direccion;
    }
}

class Farmacia {
    ArrayList<Sucursal> sucursales = new ArrayList<>();

    public void agregarSucursal(Sucursal s) {
        sucursales.add(s);
    }

    public void mostrarArchivo() {
        for (Sucursal s : sucursales) {
            System.out.println(s);
            for (Medicamento m : s.medicamentos) {
                System.out.println("  " + m);
            }
        }
    }

    public void mostrarMedicamentosTosSucursal(int numSucursal) {
        for (Sucursal s : sucursales) {
            if (s.numero == numSucursal) {
                System.out.println("Medicamentos para la tos en " + s + ":");
                s.mostrarMedicamentosParaLaTos();
            }
        }
    }

    public void buscarSucursalesConMedicamento(String nombreMedicamento) {
        for (Sucursal s : sucursales) {
            if (s.contieneMedicamento(nombreMedicamento)) {
                System.out.println("Encontrado en " + s);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();

        Sucursal s1 = new Sucursal(1, "Av. Villazón #123");
        s1.agregarMedicamento(new Medicamento("Golpex", "Tos"));
        s1.agregarMedicamento(new Medicamento("Paracetamol", "Fiebre"));

        Sucursal s2 = new Sucursal(2, "Calle Murillo #456");
        s2.agregarMedicamento(new Medicamento("Ibuprofeno", "Dolor"));
        s2.agregarMedicamento(new Medicamento("Golpex", "Tos"));

        farmacia.agregarSucursal(s1);
        farmacia.agregarSucursal(s2);

        // Mostrar archivo
        farmacia.mostrarArchivo();

        // Mostrar medicamentos para la tos en sucursal 1
        farmacia.mostrarMedicamentosTosSucursal(1);

        // Mostrar sucursales que tienen el medicamento "Golpex"
        farmacia.buscarSucursalesConMedicamento("Golpex");
    }
}
