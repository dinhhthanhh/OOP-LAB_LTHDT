package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;


public class CompactDisc extends Disc  implements Playable {
	   private String artist;
	   private List<Track> tracks = new ArrayList<Track>();


    // GETTER
    public String getArtist() {
        return artist;
    }

    // Constructor

	public CompactDisc(String title, float cost) {
		super(cost, title);
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, cost, category);
	}

	public CompactDisc(String title, String category, float cost, String director) {
		super(title, cost, director);
	}

	public CompactDisc(String title, String category, float cost, String director, String string) {
		super(cost, director);
	}

    public CompactDisc(float length, String director, String artist, List<Track> tracks) {
        super(length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, float cost, float length, String director, String artist, List<Track> tracks) {
        super(title, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, float cost, float length, String director, String artist,
            List<Track> tracks) {
        super(title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }



    // Method them track vao CD
    public void addTrack(Track track, Track track2) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("The track is already in the list.");
        }
    }

    // Method xoa track khoi CD
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("The track is not in the list.");
        }
    }

    // Method tinh tong do dai length cua CD
    public float getLength() {
        int totalLength = 0;
        try {
			for (Track track : tracks) {
			    totalLength += track.getLength();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return totalLength;
    }
    @Override
    public String toString() {
       return "CD(" + this.id + "): " + this.title + " - " + this.category + " - " + this.director + " - " + this.artist + " - " + this.getLength() + " - " + this.cost + "$";
   }

    public void play() {
        System.out.println("Artist: " + this.getArtist());
        System.out.println("CD Length: " + this.getLength());
        System.out.println("==============================");
        for (Track track : tracks) {
            track.play();
        }
    }

}
  