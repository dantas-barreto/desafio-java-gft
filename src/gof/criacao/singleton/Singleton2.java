package gof.criacao.singleton;

public class Singleton2 {

    private static Singleton2 obj;

    private Singleton2() {
    }

    // Somente uma thread consegue executar este método por vez.
    public static synchronized Singleton2 getInstance() {
        if (obj == null) {
            obj = new Singleton2();
        }
        return obj;
    }

    public String toString() {
        return "Implementação do Singleton sincronizado";
    }
}
