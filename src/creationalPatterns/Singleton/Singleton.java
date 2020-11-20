package creationalPatterns.Singleton;

public class Singleton {
    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getSingleInstance();
        SingletonClass singleton2 = SingletonClass.getSingleInstance();
        System.out.println(singleton.hashCode() == singleton2.hashCode());

        NotSingletonClass notSingletonClass = new NotSingletonClass();
        NotSingletonClass notSingletonClass2 = new NotSingletonClass();
        System.out.println(notSingletonClass.hashCode() == notSingletonClass2.hashCode());
    }
}

class SingletonClass {
    private static SingletonClass singleInstance = null;

    private SingletonClass() { }

    public static SingletonClass getSingleInstance() {
        if (singleInstance == null) singleInstance = new SingletonClass();
        return singleInstance;
    }
}

class NotSingletonClass {
    public NotSingletonClass() { }
}

