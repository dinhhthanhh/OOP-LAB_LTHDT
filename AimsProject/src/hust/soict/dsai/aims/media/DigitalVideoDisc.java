package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{  
    private String director;

    public DigitalVideoDisc(float length, String director, String director2) {
        super(length, director);
        director = director2;
    }

    public DigitalVideoDisc(String title, float length, String director, String director2) {
        super(title, length, director);
        director = director2;
    }

    public DigitalVideoDisc(String title, String director2, float length, String director, float cost) {
        super(title, cost, length, director);
        director = director2;
    }

    public DigitalVideoDisc(String title, String category, float cost, float length, String director,
            String director2) {
        super(title, category, cost, length, director);
        director = director2;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public float getCost() {
        return this.cost;
    }

    public String getDirector() {
        return this.director;
    }

    public float getLength() {
        return this.length;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "DVD(" + this.id + "): " + this.title + " - " + this.category + " - " + this.director + " - "
                + this.length + " - " + this.cost + "$";
    }

    public void setTitle(String title){
        this.title = title;
    }

	@Override
	public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
       System.out.println("DVD Length: " + this.getLength());
    }
}