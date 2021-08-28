package uz.jaxadev.taxi.springboot;


import java.util.concurrent.atomic.AtomicInteger;

public class Order {

    private static final AtomicInteger autoIncrementID = new AtomicInteger(0);

    int id;

    String startPoint;

    String endPoint;

    String price;

    public Order(String startPoint, String endPoint, String price) {
        this.id = autoIncrementID.incrementAndGet();
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
