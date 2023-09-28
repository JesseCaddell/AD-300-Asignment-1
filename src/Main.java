public class Main {
    public static void main(String[] args) {

        Box box = new Box(10, 12, 15);
        box.addItem("Lint");
        box.addItem("Raygun");
        box.addItem("Coffee Mug");
        box.printItems();
        box.volume();
    }
}