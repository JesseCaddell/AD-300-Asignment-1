import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void constructor() {
        //creating new box and testing with positive dimensions to make sure it is created correctly.
        Box testBox = new Box(12.5, 5.2, 30.4);
        assertEquals(12.5, testBox.width);
        assertEquals(5.2, testBox.height);
        assertEquals(30.4, testBox.depth);

        //Testing for negatives
        assertThrows(IllegalArgumentException.class,
                () ->new Box(-12.5, 5.2, 30.4));
        assertThrows(IllegalArgumentException.class,
                () ->new Box(12.5, -5.2, 30.4));
        assertThrows(IllegalArgumentException.class,
                () ->new Box(12.5, 5.2, -30.4));
    }


    @Test
    void volume() {
        //testing to make sure volume calculates correctly with a margin of error of 0.001
        var testBox = new Box(10.2,12.7,3.3);
        assertEquals(427.482, testBox.volume(), 0.001);
    }

    @Test
    void addItem() {
        var testBox = new Box(1,1,1);

        //Test adding an item to the inventory
        boolean added = testBox.addItem("item1");
        assertTrue(added);

        //Test adding when the inventory is full
        for (int index = 1; index <= 10; index++) {
            added = testBox.addItem("item" + index);
            assertTrue(added);
        }

        //Testing for adding one more when inventory is full
        added = testBox.addItem("item11");
        assertFalse(added);


    }

    @Test
    void removeItem() {
        var testBox = new Box(1,1,1);

        //Testing removing an item that exists
        testBox.addItem("item1");
        boolean removed = testBox.removeItem("item1");
        assertTrue(removed);

        //Testing removing an item that doesn't exist
        removed = testBox.removeItem("item3");
        assertFalse(removed);
    }



}