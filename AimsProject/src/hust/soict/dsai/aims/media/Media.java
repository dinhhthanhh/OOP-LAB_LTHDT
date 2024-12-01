package hust.soict.dsai.aims.media;

public class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

	// Constructors
	public Media() {
    		    }

	public Media(String title) {
    	        this.title = title;
    		    }

	public Media(String title, float cost) {
    	       this(title);
    	        this.cost = cost;
    	    }

	public Media(String title, String category, float cost) {
    		        this(title, cost);
    		        this.category = category;
    	    }

	// Getters $ Setters
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
	public boolean equals(Object o) {
        Media Media = (Media) o;
        return this.title.equals(Media.title);
    }


}
