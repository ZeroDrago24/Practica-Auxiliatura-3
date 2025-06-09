// Enunciado:
// 5. Crea una clase genérica Pila<T>
// a) Implementa un método para apilar
// b) Implementa un método para desapilar
// c) Prueba la pila con diferentes tipos de datos
// d) Muestra los datos de la pila

import java.util.Stack;

class Pila<T> {
    private Stack<T> pila = new Stack<>();

    public void apilar(T elemento) {
        pila.push(elemento);
    }

    public T desapilar() {
        if (!pila.isEmpty())
            return pila.pop();
        else
            return null;
    }

    public void mostrar() {
        for (T elemento : pila) {
            System.out.println(elemento);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pila<String> pilaTextos = new Pila<>();
        pilaTextos.apilar("Hola");
        pilaTextos.apilar("Mundo");
        pilaTextos.mostrar();
        System.out.println("Desapilado: " + pilaTextos.desapilar());

        Pila<Integer> pilaNumeros = new Pila<>();
        pilaNumeros.apilar(1);
        pilaNumeros.apilar(2);
        pilaNumeros.mostrar();
        System.out.println("Desapilado: " + pilaNumeros.desapilar());
    }
}
