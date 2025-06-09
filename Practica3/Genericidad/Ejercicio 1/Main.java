// Enunciado:
// 1. Crea una clase genérica Caja<T> para guardar algún tipo de objeto
// a) Agrega métodos guardar() y obtener()
// b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
// c) Muestra el contenido de las cajas

class Caja<T> {
    private T objeto;

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T obtener() {
        return objeto;
    }
}

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola mundo!");

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(2025);

        System.out.println("Contenido de cajaTexto: " + cajaTexto.obtener());
        System.out.println("Contenido de cajaNumero: " + cajaNumero.obtener());
    }
}
