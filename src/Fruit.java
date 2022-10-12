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
    public String setColor(String color) {

        return this.color = color;
    }

    // This is the getter method.
    public double getWeight() {

        return this.weight;
    }

    // This is the setter method.
    public double setWeight(double weight) {

        return this.weight = weight;
    }

    // This is the getter method.
    public Boolean getIsTasty() {

        return this.isTasty;
    }

    // This is the setter method.
    public Boolean setIsTasty(Boolean isTasty) {

       return this.isTasty = isTasty;
    }

    // This is the getter method.
    public float getPrice() {

        return this.price;
    }

    // This is the setter method.
    public float setPrice(float price) {

        return this.price = price;
    }

    // This is the getter method.
    public int getQuantity() {

        return this.quantity;
    }

    // This is the setter method.
    public int setQuantity(int quantity) {

       return this.quantity = quantity;
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