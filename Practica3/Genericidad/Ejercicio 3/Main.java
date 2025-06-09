// Enunciado:
// 3. Crea una clase genérica Catalogo<T> que almacene productos o libros.
// a) Agrega métodos para agregar y buscar elemento
// b) Prueba el catálogo con libros
// c) Prueba el catálogo con productos

import java.util.ArrayList;

class Catalogo<T> {
    private ArrayList<T> lista = new ArrayList<>();

    public void agregar(T elemento) {
        lista.add(elemento);
    }

    public boolean buscar(T elemento) {
        return lista.contains(elemento);
    }

    public void mostrar() {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Catalogo<String> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar("El Principito");
        catalogoLibros.agregar("Cien años de soledad");

        System.out.println("¿Está 'El Principito'? " + catalogoLibros.buscar("El Principito"));
        catalogoLibros.mostrar();

        Catalogo<String> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar("Laptop Lenovo");
        catalogoProductos.agregar("Mouse Logitech");

        System.out.println("¿Está 'Mouse Logitech'? " + catalogoProductos.buscar("Mouse Logitech"));
        catalogoProductos.mostrar();
    }
}
