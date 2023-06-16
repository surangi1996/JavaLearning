package designPatterns;

public class Singleton {
    /**
     * Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object
     * and saves it in a static field. All following calls to this method return the cached object.
     */
    private static Singleton instance;

    /**
     * Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
     */
    private Singleton(){

    }

    public void method(){
        System.out.println("hi");
    }

    public static Singleton getInstance(){
        if (instance != null){
            return instance;
        }
        /**
         * to make it thread safe we can synchronized then it wont make more than one objects
         */
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }


    }

}

