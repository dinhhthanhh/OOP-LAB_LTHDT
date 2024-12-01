package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();

        // Create new DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
                "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", 
                "Animation", 18.99f);

        // Test addDVD method
        System.out.println("Adding DVDs to the store...");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display the store's contents
        System.out.println("\nStore after adding DVDs:");
        store.printStore();

        // Test removeDVD method
        System.out.println("\nRemoving DVD with ID 2...");
        store.removeDVD(2);

        // Display the store's contents after removal
        System.out.println("\nStore after removing DVD with ID 2:");
        store.printStore();

        // Test removing a non-existing DVD
        System.out.println("\nRemoving DVD with non-existing ID 5...");
        store.removeDVD(5);
    }
}
