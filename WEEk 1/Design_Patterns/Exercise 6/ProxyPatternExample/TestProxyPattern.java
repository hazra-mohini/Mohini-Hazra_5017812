package ProxyPatternExample;

public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from remote server and displayed
        image1.display();

        // Image will be displayed from cache (no loading from server)
        image1.display();

        // Image will be loaded from remote server and displayed
        image2.display();

        // Image will be displayed from cache (no loading from server)
        image2.display();
    }
}
