package sem_6.sem6_singleton;

public class Singleton {

    private static Singleton instance =null;//instanta unica

   synchronized public static Singleton returnInstance() { //getInstance mai des intalnit
        if (instance == null) {
            instance =new Singleton();
        }
        return instance;
    }

    private Singleton() {//constructor privat
    }
}
