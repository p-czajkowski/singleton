package singleton;

public class Singleton2 {

    /* prywatny konstruktor, uniemożliwia tworzenia instancji tej klasy,
     poprzez wywoływanie konstruktora domyślnego.*/

    private Singleton2() {
        System.out.println("Second way of creating a Singleton");
    }

    /*
     prywatne pole statyczne, aby była możliwość wywołania tej jednej instancji klasy
      na początku posiada wartość null
      */
    private static Singleton2 instance = null;


    /*publiczna metoda
        'synchornized' potrzebne do aplikacji wielowątkowej
     */

    public static synchronized Singleton2 getInstance(){
        // jeśli instancja klasy wynosi null,
        if(instance == null) {
            // to tworzony jest ten jedyny obiekt.
            instance = new Singleton2();
        }
        // jeżeli już był stworzony, to tylko zwracamy instancję tej klasy.
        return instance;
    }

    /*@param name tylko aby sprawdzić czy powstaje faktycznie jeden egzemplarz danej klasy
     */
    public String name;

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
