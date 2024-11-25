package hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
    // Attribute: List of DVDs available in the store
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("DVD added to store: " + dvd.toString());
    }

    // Method to remove a DVD from the store by ID
    public void removeDVD(int id) {
        boolean found = false;
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).getId() == id) {
                System.out.println("DVD removed from store: " + itemsInStore.get(i).toString());
                itemsInStore.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found for ID: " + id);
        }
    }

    // Method to display all DVDs in the store
    public void printStore() {
        System.out.println("***********************STORE***********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("No DVDs in the store.");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
            }
        }
        System.out.println("***************************************************");
    }
}
