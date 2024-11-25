package hust.soict.dsai.aims.Aims;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {
        // Tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo các DVD mới
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f); 
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
                "Science Fiction", "George Lucas", 87, 24.95f); 
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Jungle Book",
                "Animation", 21.95f);

        // Thêm từng DVD một
        System.out.println("Adding DVDs individually...");
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);

        // Thêm nhiều DVD cùng lúc bằng varargs
        System.out.println("\nAdding DVDs using varargs...");
        anOrder.addDigitalVideoDisc(dvd3, dvd4);

        // Thêm 2 DVD cùng lúc bằng phương thức mới
        System.out.println("\nAdding 2 DVDs at once...");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Cinderella", "Animation", 17.95f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Snow White", "Animation", 15.95f);
        anOrder.addDigitalVideoDisc(dvd5, dvd6);

        // In tổng chi phí của giỏ hàng
        System.out.println("\nTotal Cost: " + anOrder.totalCost());
    }
}
