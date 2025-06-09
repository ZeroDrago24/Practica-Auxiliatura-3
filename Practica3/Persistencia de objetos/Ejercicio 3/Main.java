// Enunciado:
// 3.- Sea el siguiente diagrama de clases:
// a) Implementar el diagrama de clases.
// b) Implementa buscarCliente(int c) a través del id.
// c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente junto al número de celular.

import java.util.ArrayList;

class Celular {
    String numero;

    public Celular(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Celular: " + numero;
    }
}

class Cliente {
    int id;
    String nombre;
    Celular celular;

    public Cliente(int id, String nombre, Celular celular) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", " + celular;
    }
}

class Empresa {
    ArrayList<Cliente> clientes = new ArrayList<>();

    public void guardarCliente(Cliente c) {
        clientes.add(c);
    }

    public Cliente buscarCliente(int c) {
        for (Cliente cli : clientes) {
            if (cli.id == c) {
                return cli;
            }
        }
        return null;
    }

    public String buscarCelularCliente(int c) {
        for (Cliente cli : clientes) {
            if (cli.id == c) {
                return cli.toString();
            }
        }
        return "Cliente no encontrado.";
    }

    public void mostrar() {
        for (Cliente cli : clientes) {
            System.out.println(cli);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.guardarCliente(new Cliente(1, "Ana", new Celular("78945612")));
        empresa.guardarCliente(new Cliente(2, "Pedro", new Celular("71234567")));
        empresa.guardarCliente(new Cliente(3, "Lucía", new Celular("70112233")));

        empresa.mostrar();

        System.out.println("Buscar cliente con ID 2:");
        System.out.println(empresa.buscarCliente(2));

        System.out.println("Buscar celular de cliente con ID 3:");
        System.out.println(empresa.buscarCelularCliente(3));
    }
}
