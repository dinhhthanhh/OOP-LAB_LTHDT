package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private int length;
    private String title;

    // Constructor with parameters
    public Track(int length, String title) {
        this.title = title;
        this.length = length;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for length
    public int getLength() {
        return length;
    }

	public int getLength1() {
		// TODO Auto-generated method stub
		return 0;
	}

    @Override
    public void play() {
       System.out.println("Playing DVD: " + this.getTitle());
       System.out.println("DVD length: " + this.getLength());
    }
    @Override
    public boolean equals(Object o) {
        Track track = (Track) o;
        return this.title.equals(track.title) && this.length == track.length;
    }

}
