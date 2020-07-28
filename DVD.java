package Kazi_Umar_A3;

public class DVD extends CatalogItem {			// DVD class is a subclass of Catalog Item

	private String director;
	
	private int year;
	
	private int dvdCode;
	
	 
	public DVD(String title, double price, String director, int year, int dvdCode) // constructor to initialize variables
	{
		super(title, price);
		this.director = director;
		this.dvdCode = dvdCode;
		this.year = year;
	}
	
	public String getDirector() 						// method to get name of director
	{
		return director;
	}
	
	public int getDvdcode() 					// method to get dvd code
	{
		return dvdCode;
	}
	
	public int getYear() 					// method to get release year
	{
		return year;
	}
	
	   public boolean equals(Object obj) {		// method to check if two dvd objects are the same

           if (obj instanceof DVD) {

                 DVD dvd = (DVD) obj;

                 if (this.dvdCode == dvd.dvdCode) {

                       return true;

                 }

           }

           return false;

     }
	   
	   public String toString() {							//method returning string about the details of the DVD 
		   													//such as title, director, price, etc.
           String str = "Title: " + getTitle();

           str += "\t | Director: " + getDirector();

           str += "\t | Price: " + getPrice();

           str += "\t | Year: " + getYear();

           str += "\t | Dvdcode: " + getDvdcode();
           
           return str;
     }
	
}
