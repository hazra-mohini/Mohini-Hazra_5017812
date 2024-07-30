package ObserverPattern;

public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp1 = new WebApp("WebApp1");

        stockMarket.register(mobileApp1);
        stockMarket.register(mobileApp2);
        stockMarket.register(webApp1);

        stockMarket.setStockPrice("AAPL: 150.00");
        stockMarket.setStockPrice("GOOGL: 2800.00");

        stockMarket.deregister(mobileApp2);

        stockMarket.setStockPrice("AMZN: 3400.00");
    }
}
