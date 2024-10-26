package lab02;

public class Aims {

    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f); 
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
                "Science Fiction", "George Lucas", 87, 24.95f); 
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // Print total cost of the items in the cart 
        System.out.println("Total Cost before removal: " + anOrder.totalCost());

        // Remove a DVD and print the total cost to check if it was removed
        System.out.println("Removing 'Star Wars'...");
        anOrder.removeDigitalVideoDisc(dvd2);

        // Print total cost after removal
        System.out.println("Total Cost after removal: " + anOrder.totalCost());

        // Try to remove a DVD that is not in the cart
        System.out.println("Trying to remove 'Star Wars' again...");
        anOrder.removeDigitalVideoDisc(dvd2); // Should show a message indicating it was not found
    }
}
