package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	    private List<String> authous = new ArrayList<String>();

	 // CONSTRUCTORS
	    public Book() {
	        super();
	    }

	    public Book(String title) {
	        super(title);
	        
	    }

	    public Book(String title, float cost) {
	         super(title,cost);
	    }

	    public Book(String title, String category, float cost) {
	        super(title, category, cost);
	    }

	// GETTERS & SETTERS
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
	
	// METHOD
	public boolean addAuthor(String author, String string) {
	    // Kiem tra xem author co ton tai trong List hay khong
	    for (String s : authous) {
	        if (s == author) {
	            System.out.println("Those authors existed");
	            return false;
	        }
	    }
	    // Neu khong ton tai thi add vao list
	    System.out.println();
	    this.authous.add(author);
	    return true;
	}
	
	public boolean removeAuthor(String author) {
	    // Tim authou trong List
	    for (String s : authous) {
	        //Nếu tìm thấy thì xoá 
	        if (s == author) {
	            this.authous.remove(author);
	            System.out.println();
	            return true;
	        }
	    }
	    // Neu khong tim thay authour thi thông báo
	    System.out.println("This author is not in the list");
	    return false;
	}
	 public String toString() {
	        return "Book(" + this.id + "): " + this.title + " - " + this.getAuthor() + " - " + this.category + " - "
	                + this.cost + "$";
	    }

	private String getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

}