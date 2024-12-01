package hust.soict.dsai.aims.media;

public class Disc extends Media {
    protected float length;
    protected String director;

    // Getter and setter
    public float getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    // Construtors
    public Disc(float length, String director) {
        this.length = length;
        this.director = director;
    }

    public Disc(String title, float length, String director) {
        super(title);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, float cost, float length, String director) {
        super(title, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, String category, float cost, float length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

	public void play() {
		// TODO Auto-generated method stub
		
	}

}
