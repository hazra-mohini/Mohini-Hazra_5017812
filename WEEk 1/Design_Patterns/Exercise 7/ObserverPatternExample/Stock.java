package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface Stock {
    void register(Observer o);

    void deregister(Observer o);

    void notifyObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockPrice;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void deregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
