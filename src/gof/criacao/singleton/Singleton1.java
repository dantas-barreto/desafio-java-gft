package gof.criacao.singleton;

public class Singleton1 {

    private static Singleton1 obj;

    // O construtor privado obriga a utilização do método
    // getInstance() para criar o Objeto.
    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (obj == null) {
            obj = new Singleton1();
        }
        return obj;
    }

    public String toString() {
        return "Implementação Clássica do Singleton";
    }
}
