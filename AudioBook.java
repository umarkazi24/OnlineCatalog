package Kazi_Umar_A3;

public class AudioBook extends Book{			// audiobook class is a subclass of Book
	private double runningTime;
	
	public AudioBook(String title, double price, int isbn, String author, double runningTime) //constructor to initialize variables
	{

        super(title, price, isbn, author);	    //super operator using the variables from its superclass (Book)
        
        this.runningTime = runningTime;			// this operator using variables from the current class

	}

 
	public double getPrice()				    // overrides method from its super class and gets price of 
	{										    // audiobook which costs 10% less than regular book
		
        return super.getPrice() * 0.9;

	}

 
	public double getRunningTime()				// method returning audiobook's running time
	{
        return runningTime;
	}

 
	public String toString()					//method returning a string of all the details of the Book + runningtime
	{		
        String str = super.toString() + " \t | Running time : "+runningTime; //super operator lets it use details from Book
        return str;											
	}
	
}
