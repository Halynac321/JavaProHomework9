//Thread-safe version
public class MySingleton2 {
    private static MySingleton2 INSTANCE = null;

    //to prevent users to create their own instance
    private MySingleton2() {}

    public synchronized static MySingleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingleton2();
                }
            }
        }
        return INSTANCE;
    }
}
