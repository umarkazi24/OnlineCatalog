package Kazi_Umar_A3;

public class Book extends CatalogItem {			// Book is a subclass of Catalog Item

	private String author;					
	
	private int isbn;
	
	public Book(String title, double price, int isbn, String author)	//constructor to initialize all variables
	{
		super(title, price);								// super operator to use variables from its super class (Catalog Item)
		this.isbn = isbn;									// this operator to use variables from the current class 
		this.author = author;
	}

	
	public boolean equals(Object obj)				// method to check if the two Book objects are the same for  
	{												// when using the arrayList contains() method
		
		if (obj instanceof Book)				// if object passed is an instance of the Book class
		{ 
			Book book = (Book) obj;				// create a new book object 
			
			if (this.isbn == book.isbn)			// and return true if the isbn of the current class equals 
			{									// the isbn of the newly created object				
				return true;
			}
		}
		return false;								//otherwise return false
	}
	
     public int getIsbn()					// method to return isbn number of book

     {
           return isbn;
     }

     public String getAuthor()				// method to return author of book

     {
           return author;
     }
    

     public String toString()					// string method to return all the information of the book such as author, price, etc.
     {
    	 String str = "Title: " + getTitle();
    	 
    	 str+= "\t | Author: " + getAuthor();
    	 
    	 str+= "\t | Price: " + getPrice();
    	 
    	 str+= "\t | ISBN: " + getIsbn();
    	 
    	 return str;
     }


	
}
