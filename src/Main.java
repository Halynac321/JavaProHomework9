public class Main {
    public static void main(String[] args) {

        System.out.println("Testing Singleton design paten:");

        MySingleton x = MySingleton.getInstance();
        MySingleton y = MySingleton.getInstance();
        MySingleton z = MySingleton.getInstance();

        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());
    }
}