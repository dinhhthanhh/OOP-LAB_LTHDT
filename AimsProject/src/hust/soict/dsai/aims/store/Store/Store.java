package hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.Media;

public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();

    public Store() {
    }

    //Them 1 item vao List
    public void addItem(Media item) {
        // Item = rỗng thì không thể thêm
        if (item == null) {
            System.out.println("Add to store fail");
            return;
        }
        // Item tồn tại trong Store thì cũng không thể thêm
        if (itemsInStore.contains(item)) {
            System.out.println("Item is already in store!!!");
            return;
        }

        // không trong 2 TH trên thì có thể thêm
        itemsInStore.add(item);
        System.out.println("New Item added to store");
    }

    //Thêm nhiều item vào store
    public void addItem(Media... medias) {
        //Kiêm tra trùng và thêm từng item vào List
        for (Media media : medias) {
            if (itemsInStore.contains(media)) {
                System.out.println("Item is already in store!!!");
                continue;
            }
            itemsInStore.add(media);
            System.out.println("New Item added to store");
        }
    }

    //Xoá item
    public void removeItem(Media item) {
        //Kiểm tra tồn tại hay không
        if (!itemsInStore.contains(item)) {
            System.out.println("This Item is not in store!!!");
            return;
        }
        itemsInStore.remove(item);
        System.out.println("Item removed from store");
    }

    public void printStore() {
        System.out.println("\n******************* STORE *******************\n");
        System.out.println("Store Items: ");
        for (Media item : itemsInStore) {
            System.out.println(item.toString());
        }
        System.out.println("                   ~ END ~");
    }

    public Media searchByTitle(String title) {
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).getTitle().equals(title)) {
                System.out.println(itemsInStore.get(i).toString());
                return itemsInStore.get(i);
            }
        }
        System.out.println("No match found!");
        return null;
    }
}

