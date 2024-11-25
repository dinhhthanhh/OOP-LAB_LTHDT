package lab02;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class TestDigitalVideoDisc {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Animation", 19.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 24.95f);

        System.out.println("DVD 1 ID: " + dvd1.getId());
        System.out.println("DVD 2 ID: " + dvd2.getId());
        System.out.println("DVD 3 ID: " + dvd3.getId());

        System.out.println("Total DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
    }
}
