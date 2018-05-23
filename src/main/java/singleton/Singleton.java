package singleton;

public class Singleton {

    /* publiczne pole INSTANCE jest już Singletonem,
   ponieważ jest finalne;
     */
    public static final Singleton INSTANCE = new Singleton();

    private Singleton()
    {
        System.out.println("Singleton created");
    }

    public String name;

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
