package hust.soict.dsai.aims.cart.Cart;

import hust.soict.dsai.aims.Aims.*;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Media> itemsOrdered = new ArrayList<Media>();

    // CONSTRUCTORS
    public Cart() {
    }

    // METHOD

    //Add 1 item vào cart
    public void addItem(Media currentMedia) {
        //item = rỗng thì không thể add
        if (currentMedia == null) {
            System.out.println("Add to cart fail");
            return;
        }
        //item khác rỗng thì add
        itemsOrdered.add(currentMedia);
        System.out.println("Items added to cart!!!");
    }

    //Thêm nhiều item vào cart
    public void addItem(Media... items) {
        //Thêm từng item vào cart 
        for (Media item : items) {
            itemsOrdered.add(item);
            System.out.println("New Item added to store");
            System.out.println("Number of items in cart: " + itemsOrdered.size());
        }
    }

    // Xoá 1 item khỏi cart 
    public void removeItem(Media item) {
        itemsOrdered.remove(item);
        System.out.println("Item removed from cart!!!");
    }

    public float totalCost() {
        float total = 0;
        for (Media item : itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }

    public void printCart() {
        System.out.println("\n******************* CART *******************\n");
        System.out.println("Ordered Items: ");
        for (Media item : itemsOrdered) {
            System.out.println(item.toString());
        }
        System.out.println("Total Cost: " + this.totalCost());
        System.out.println("--------------------------------");
    }

    public Media searchByTitle(String title) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getTitle().equals(title)) {
                System.out.println(itemsOrdered.get(i).toString());
                return itemsOrdered.get(i);
            }
        }
        System.out.println("No match found!");
        return null;
    }

	public void filterById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void filterByTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	public void sortByTitle() {
		// TODO Auto-generated method stub
		
	}

	public void sortByCost() {
		// TODO Auto-generated method stub
		
	}

	  public void clearCart() {
	        itemsOrdered.clear();
	        System.out.println("Cart is cleared");
	    }

}
