package ObserverPattern;

public interface Observer {
    void update(String stockPrice);
}

class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockPrice) {
        System.out.println(name + " received stock price update: " + stockPrice);
    }
}

class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockPrice) {
        System.out.println(name + " received stock price update: " + stockPrice);
    }
}
