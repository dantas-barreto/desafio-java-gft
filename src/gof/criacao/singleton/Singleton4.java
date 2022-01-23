package gof.criacao.singleton;

public class Singleton4 {

    private static Singleton4 obj = null;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (obj == null) {
            synchronized (Singleton4.class) {
                if (obj == null) {
                    obj = new Singleton4();
                }
            }
        }
        return obj;
    }

    public String toString() {
        return "Implementação do Singleton com verificação dupla";
    }
}
