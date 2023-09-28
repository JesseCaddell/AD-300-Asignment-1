import java.util.ArrayList;

public class Box {
    final double width;
    final double height;
    final double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        System.out.println("Box materialized... ");
    }

    public void volume(){
        System.out.println(width * height * depth);

    }

    public ArrayList<String> inventory = new ArrayList<>();

    public void addItem(String item) {
        if (inventory.size() <= 10) {
            inventory.add(item);
        }
    }

    public void removeItem(String item) {
        inventory.remove(item);
    }

    public void printItems() {
        for (int index = 0; index < inventory.size(); ++index) {
            System.out.println("You have a " + inventory.get(index) + " in the bag!");
        }

    }



}

