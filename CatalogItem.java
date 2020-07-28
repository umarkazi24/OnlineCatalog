package Kazi_Umar_A3;

public abstract class CatalogItem {		//abstract super class for all items
	
	private String title;				
		
	private double price;
	
	public CatalogItem(String title, double price)	// constructor to initialize all variables
	{
		this.title = title;							// this operator is a reference to current catalog item class

		this.price = price;
	}
	public String getTitle()
    {
           return title;				// method to return title (will be used by all subclasses for all items)
    }

    public double getPrice()
    {
            return price;				// method to return price (will be used by all subclasses for all items)
    }
	
}
