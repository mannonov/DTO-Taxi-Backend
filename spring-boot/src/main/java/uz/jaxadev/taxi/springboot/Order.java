package uz.jaxadev.taxi.springboot;

public class Order {

    String startPoint;

    String endPoint;

    String price;

    public Order(String startPoint, String endPoint, String price) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.price = price;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public String getPrice() {
        return price;
    }
}
