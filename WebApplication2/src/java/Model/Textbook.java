package model;
import java.util.Date;



public class Textbook {
    
	private int isbn;
	private String title;
	private String author;
	private int year;
	private String publiser;
	private int price;
	private boolean image;
	private String status;
	private int noOfCopies;
	private String date;
	
	public Textbook() {
		
	}

    public Textbook(int isbn, String title, String author, int year, String publiser, int price, boolean image, String status, int noOfCopies, String date) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publiser = publiser;
        this.price = price;
        this.image = image;
        this.status = status;
        this.noOfCopies = noOfCopies;
        this.date = date;
    }
	
		
	
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPubliser() {
        return publiser;
    }

    public void setPubliser(String publiser) {
        this.publiser = publiser;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isImage() {
        return image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
	


	

}
