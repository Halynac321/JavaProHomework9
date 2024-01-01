public class MySingleton {

    private static MySingleton INSTANCE = null;

    //to prevent users to create their own instance
    private MySingleton() {}

    public static MySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingleton();
                }
            }
        }
        return INSTANCE;
    }

}