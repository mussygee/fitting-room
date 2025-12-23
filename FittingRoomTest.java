package shopping;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stacks.StackOverflowException;
import stacks.StackUnderflowException;

import static org.junit.jupiter.api.Assertions.*;

class FittingRoomTest {

    @Test
    @DisplayName("Trying on clothes: Red Dress then Blue Jacket")
    void tryOnClothes() {
        // TODO: create fitting room, try on "Red Dress", then "Blue Jacket"
        // assert currentOutfit() is correct
        FittingRoom room = new FittingRoom(1);
        room.tryOn("Red Dress");
        assertEquals("Red Dress", room.currentOutfit(),
                "Top should be 'Red Dress' after first try-on");
        room.tryOn("Blue Jacket");
        assertEquals("Blue Jacket", room.currentOutfit(),
                "Top should be 'Blue Jacket' after first try-on");
    }

    @Test
    @DisplayName("Taking off clothes: Sneakers, Jeans, T-shirt")
    void takeOffClothes() {
        // TODO: push three items
        // takeOff should return "T-shirt"
        // currentOutfit should be "Jeans"
        FittingRoom room = new FittingRoom(2);
        room.tryOn("Sneakers");
        room.tryOn("Jeans");
        room.tryOn("T-shirt");

        assertEquals("T-shirt", room.takeOff(), "takeOff should remove " +
                "and return the most recent item");
        assertEquals("Jeans", room.currentOutfit(), "After taking " +
                "off 'T-shirt', top should be 'Jeans'");
    }

    @Test
    @DisplayName("Overflow test: exceeding capacity throws exception")
    void overflowTest() {
        // TODO: create fitting room with capacity = 3
        // add 4 items and expect StackOverflowException
        FittingRoom room = new FittingRoom(3, 3);
        room.tryOn("Shirt");
        room.tryOn("Jeans");
        room.tryOn("Shoes");

        assertThrows(StackOverflowException.class, () -> room.tryOn("Pants"),
                "Adding a 4th item to capacity - 3 room should throw stackOverflowException");

    }

    @Test
    @DisplayName("Underflow test: removing from empty room throws exception")
    void underflowTest() {
        // TODO: create empty fitting room
        // call takeOff and expect StackUnderflowException
        FittingRoom room = new FittingRoom(4);
        assertThrows(StackUnderflowException.class, room::takeOff,
                "Taking off from an empty room should throw stackOverflowException");


    }

    @Test
    @DisplayName("Empty fitting room check: isEmpty true initially and after removing all")
    void emptyRoomCheck() {
        // TODO: check isEmpty before and after removing all items
        FittingRoom room = new FittingRoom(5);
        assertTrue(room.isEmpty(), "Room starts empty");
        room.tryOn("Shirt");
        room.tryOn("Jeans");
        assertFalse(room.isEmpty(), "Room should not be empty after adding items");

        room.takeOff();
        room.takeOff();
        assertTrue(room.isEmpty(), "Room should be empty after removing items");
    }
}

