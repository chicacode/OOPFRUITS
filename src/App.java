public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Instance of the class Fruit

        Fruit apple = new Fruit("Apple", "Green", 0.35, true, 1, 5);
        Fruit pineapple = new Fruit("Pineapple", "Yellow", 0.85, true, 3, 1);

        System.out.println("Fruit: " + apple.getName() +" "+ apple.getColor());
        System.out.println("Fruit: " + pineapple.getName() +" "+  pineapple.getColor());
        System.out.println("Fruit   "+ apple.getName() +" new color: "+ apple.setColor("Red"));

    }
}
