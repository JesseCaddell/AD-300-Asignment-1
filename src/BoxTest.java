import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void constructor() {
        Box testBox = new Box(12.5, 5.2, 30.4); //creating new box and testing to make sure it is created correctly.
        assertEquals(12.5, testBox.width); // this is important because if the box is not correct all of the following functions will not work correctly.
        assertEquals(5.2, testBox.height);
        assertEquals(30.4, testBox.depth);

//        assertThrows(IllegalArgumentException.class,
//                () ->new Box(null, 5.2, 30.4));
//        assertThrows(IllegalArgumentException.class,
//                () ->new Box(12.5, null, 30.4));
//        assertThrows(IllegalArgumentException.class,
//                () ->new Box(12.5, 5.2, null));
    }

    @Test
    void volume() {
        var testBox = new Box(10.2,12.7,3.3); //testing to make sure volume calculates correctly. Doubles are tricky..
        assertEquals(427.48199999999997, testBox.volume());
    }

    @Test
    void addItem() {
    }

    @Test
    void removeItem() {
    }
}