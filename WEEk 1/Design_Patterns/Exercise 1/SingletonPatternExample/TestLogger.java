package SingletonPatternExample;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Both are the same instance");
        } else {
            System.out.println("They are different instance");
        }
    }
}
