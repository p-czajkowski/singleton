import singleton.Singleton;
import singleton.Singleton2;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();


        singleton1.name = "Singleton 1";
        // referencja z osatniego obiektu, powinna przesłonić poprzedni.
        singleton2.name = "Singleton 2";

        System.out.println(singleton1);
        System.out.println(singleton1.name);


        s1.name = "obiekt Singleton 1";
        s2.name = "obiekt Singleton 2";

        System.out.println(s1);
        System.out.println(s1.name);

    }
}
