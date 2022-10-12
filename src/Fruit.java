public class Fruit {

    private String name;
    private String color;
    private double weight;
    private Boolean isTasty;
    private float price;
    private int quantity;

    // constructor
    public Fruit(String name, String color, double weight, boolean isTasty, float price, int quantity) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isTasty = isTasty;
        this.price = price;
        this.quantity = quantity;
    }

    // This is the getter method.
    public String getName() {

        return this.name;
    }

    // This is the setter method.
    public void setName(String name) {

        this.name = name;
    }

    // This is the getter method.
    public String getColor() {

        return this.color;
    }

    // This is the setter method.
    public void setColor(String color) {

        this.color = color;
    }

    // This is the getter method.
    public double getWeight() {

        return this.weight;
    }

    // This is the setter method.
    public void setWeight(double weight) {

        this.weight = weight;
    }

    // This is the getter method.
    public Boolean getIsTasty() {

        return this.isTasty;
    }

    // This is the setter method.
    public void setIsTasty(Boolean isTasty) {

        this.isTasty = isTasty;
    }

    // This is the getter method.
    public float getPrice() {

        return this.price;
    }

    // This is the setter method.
    public void setPrice(float price) {

        this.price = price;
    }

    // This is the getter method.
    public int getQuantity() {

        return this.quantity;
    }

    // This is the setter method.
    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public void AddQuantity(int number, float newPrice, double newWeight) {
        this.price += newPrice;
        this.weight += newWeight;
        this.quantity = this.quantity + 1;

    }

    public void removeQuantity(int number, float newPrice, double newWeight) {
        this.price -= newPrice;
        this.weight -= newWeight;
        this.quantity = this.quantity - 1;

    }

}