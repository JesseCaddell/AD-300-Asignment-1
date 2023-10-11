import java.util.ArrayList;

public class Box {
    final double width;
    final double height;
    final double depth;

    public Box(double width, double height, double depth) {
        if (width < 0) {
            throw new IllegalArgumentException("Dimension must be greater than 0");
        }
        if (height < 0) {
            throw new IllegalArgumentException("Dimension must be greater than 0");
        }
        if (depth < 0) {
            throw new IllegalArgumentException("Dimension must be greater than 0");
        }
        this.width = width;
        this.height = height;
        this.depth = depth;
        System.out.println("Box materialized... ");
    }

    public double volume(){
        System.out.println(width * height * depth);

        return width * height * depth;
    }

    public ArrayList<String> inventory = new ArrayList<>();

    public boolean addItem(String item) {
        if (inventory.size() <= 10) {
            inventory.add(item);
            return true;
        }else {
            System.out.println("Cannot add " + item + " to the box! Inventory is full!");
            return false;
        }
    }

    public boolean removeItem(String item) {
        if (item != null && inventory.contains(item)) {
            inventory.remove(item);
            return true;
        } else {
            System.out.println("Error: item could not be found in the box!");
            return false;
        }


    }

    public void printItems() {
        for (int index = 0; index < inventory.size(); ++index) {
            System.out.println("You have a " + inventory.get(index) + " in the bag!");
        }

    }



}

