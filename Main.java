package Kazi_Umar_A3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {												// main class to test program

	static ArrayList<Book> bookList;							//arrayList to store Books and AudioBooks
	static ArrayList<DVD> dvdList;								//arrayList to store DVDs
	
	static Scanner scanner=new Scanner(System.in);				//creates a scanner object that can be used anywhere
	
	public static void main(String[] args) 						// main method used for shopping user interface
	{
		bookList = new ArrayList<Book>();						//initializes the arrayLists
		dvdList = new ArrayList<DVD>();

        int choice=0;
        
        
        while(choice != 9)									//shopping interface shows while choice is not equal to 9
        {
            System.out.println("\n**Welcome to the Comets Books and DVDs Store (Catalog Section)**"); //outputs the interface

            System.out.println("Choose from the following options:\n1 – Add Book\n2 – Add AudioBook");

            System.out.println("3 – Add DVD\n4 – Remove Book\n5 – Remove DVD\n6 – Display Catalog");     

            System.out.println("9 - Exit store");
         
            try 
            {
            	choice = scanner.nextInt(); 			// gets user input for choice
            	            	
            	switch(choice)							//switch statement on choice
            	{
            	case 1: addBook();						// calls function that lets user add book to arrayList
            		break;
            		
            	case 2: addAudiobook();					// calls function that lets user add Audiobook to arrayList						
            		break;
            		
            	case 3: addDVD();						// calls function that lets user add DVD to arrayList
            		break;
            		
            	case 4: removeBook();					// calls function that lets user remove a book from arrayList
            		break;
            		
            	case 5:	removeDVD();					// calls function that lets user remove a DVD from arrayList
            		break;
            		
            	case 6: displayCatalog();				//displays items selected by user
            		break;
            		
            	case 9: System.out.println("Thank you for shopping today!\n"); // finishes shopping and exits store
            		break;
            		
            	default: throw new Exception(); 		// throws invalid input exception
            		
            	}
            	
            }catch (Exception e)						//catches exception and outputs message to try again if invalid input
            	{
            		System.out.println("Invalid input, please try again");
            	}
        }
        
	}

	public static void addBook() 				//method to add a book to catalog
	{
		scanner.nextLine();						
		System.out.println("Please enter book title: ");	//ask user for title, isbn, author name, and price
		
		String title = scanner.nextLine();
		
		while(title.isEmpty() == true)						//checks if user inputs anything at all
		{
			System.out.println("Title's field can not be empty, please try again");	// if not, tells user to input something
			System.out.println("Please enter book title: ");
			
			title = scanner.nextLine();
		}
		
	    System.out.println("Enter book ISBN: ");

        int isbn = Integer.parseInt(scanner.nextLine());
        	

        System.out.println("Enter author name:");

        String author = scanner.nextLine();
        
        while(author.isEmpty() == true)
		{
			System.out.println("Author's field can not be empty, please try again");
			System.out.println("Please enter book author: ");
			
			author = scanner.nextLine();
		}

        System.out.println("Enter price:");

        double price = Double.parseDouble(scanner.nextLine());
        
        while(price <= 0)									//check for nonnegative user input
        {
        	System.out.println("Price must be positive, please try again");
        	System.out.println("Enter price:");

            price = Double.parseDouble(scanner.nextLine());
        }
        
        Book book=new Book(title, price, isbn, author);
        
        if (bookList.contains(book))						//checks if user is asking for a book thats already in the catalog
        {
        	 System.out.println("Error: The catalog already has the same book");

    	}
		else
		{

          bookList.add(book);

          System.out.println("Book added successfully");
		}
	}
	
	public static void addAudiobook() 									//method to add audiobook
	{
		   scanner.nextLine();							
		   System.out.println("Enter an audio book title: ");		//asks user for title, isbn, author, price, and runtime
		
		   String title = scanner.nextLine();

		   while(title.isEmpty() == true)							//checks for empty input
			{
				System.out.println("Title's field can not be empty, please try again");
				System.out.println("Please enter Audiobook title: ");
				
				title = scanner.nextLine();
			}
		   
           System.out.println("Enter audio book ISBN (ID):");

           int isbn = Integer.parseInt(scanner.nextLine());

           System.out.println("Enter author name:");

           String author=scanner.nextLine();
           
           while(author.isEmpty() == true)									//checks for empty input
   			{
	   			System.out.println("Author's field can not be empty, please try again");
	   			System.out.println("Please enter Audiobook author: ");
	   			
	   			author = scanner.nextLine();
   			}


           System.out.println("Enter price:");

           double price = Double.parseDouble(scanner.nextLine());
           
           while(price <= 0)													//checks for nonnegative price input
           {
           		System.out.println("Price must be positive, please try again");
           		System.out.println("Enter price:");

           		price = Double.parseDouble(scanner.nextLine());
           }

           System.out.println("Enter runningtime:");

           double runningTime = Double.parseDouble(scanner.nextLine());
           
           while(runningTime <= 0)												//checks for nonnegative runningtime input
           {
        	   System.out.println("Audiobook's running time must be a positive number, please try again");
        	   
        	   System.out.println("Enter runningtime:");
        	   
               runningTime = Double.parseDouble(scanner.nextLine());
           }

           AudioBook audioBook=new AudioBook(title, price, isbn, author, runningTime);

           if(bookList.contains(audioBook))							//checks to see if catalog already contains the book
           {

                 System.out.println("Error: The catalog already have the same audio book");

           }
           else
           {
                 bookList.add(audioBook);
                 System.out.println("Audio book added successfully");
           }

     }
	
	public static void addDVD()								//method to add DVD

	{
		scanner.nextLine();									//asks user for title, dvdcode, director, price, and year
		System.out.println("Enter DVD title:");

        String title = scanner.nextLine();
        
        while(title.isEmpty() == true)						//checks for empty input
		{
			System.out.println("Title's field can not be empty, please try again");
			System.out.println("Please enter DVD title: ");
			
			title = scanner.nextLine();
		}
        
        System.out.println("Enter DVDcode:");

        int dvdCode = scanner.nextInt();
        
        scanner.nextLine();
        System.out.println("Enter director's name:");

        String director = scanner.nextLine();
        
        while(director.isEmpty() == true)					//checks for empty input
		{
   			System.out.println("Director's field can not be empty, please try again");
   			System.out.println("Please enter director's name: ");
   		
   			director = scanner.nextLine();
		}

        System.out.println("Enter Year:");

        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter price:");

        double price = Double.parseDouble(scanner.nextLine());
        
        while(price <= 0)							//checks for nonnegative price input
        {
        	System.out.println("Price must be positive, please try again");
        	System.out.println("Enter price:");

            price = Double.parseDouble(scanner.nextLine());
        }

        DVD dvd = new DVD(title, price, director, year, dvdCode);

        if(dvdList.contains(dvd)){									//checks to see if catalog already contains the DVD

              System.out.println("Error: The catalog already have the same DVD");

        }
        else
        {

              dvdList.add(dvd);

              System.out.println("DVD added successfully");

        }
		
	}
	
	public static void removeBook()									//method to remove book from catalog
	{
		scanner.nextLine();
		System.out.println("Please enter the ISBN of the book you want to remove: "); //asks user for isbn of the book
		
		int isbn = scanner.nextInt();
		
		for(Book book: bookList)				//looping through all books in the arrayList
		{
			if (book.getIsbn()== isbn)			// looks for isbn in the list, if found, remove from catalog
			{
				bookList.remove(book);
				System.out.println("Book removed successfully");
			}
			else
			{
				System.out.println("Book doesn't exist in this Catalog");	//otherwise output book doesn't exist in catalog
			}	
		}
	}
	
	public static void removeDVD()					//method to remove DVD from catalog
	{
		scanner.nextLine();
		System.out.println("Please enter the DVD code of the DVD you want to remove: "); //ask user for DVD code of the DVD
		
		int isbn = scanner.nextInt();
		
		for(DVD dvd: dvdList)								//loops through DVD arrayList
		{
			if (dvd.getDvdcode()== isbn)					// if dvdCode found in arrayList, remove from Catalog
			{
				dvdList.remove(dvd);
				System.out.println("DVD removed successfully");
			}
			else
			{
				System.out.println("DVD doesn't exist in this store"); //Otherwise, out that the DVD doesn't exist in catalog
			}	
		}
	}
	
	public static void displayCatalog()		//method to display catalog of items
	{
		System.out.println("Catalog:");
		
        System.out.print("-------");
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Books:");
        
        System.out.print("-------");
        System.out.println("-------------------------------------------------------------------------------------");

        for (Book book : bookList)			//looping through the arrayList for books
        {

              if(! (book instanceof AudioBook)) //if book is not an instance of audiobook
              {

                    System.out.println(book.toString()); // output the details of book

              }
        }
        
        System.out.print("-------");
        System.out.println("-------------------------------------------------------------------------------------");
  
        System.out.println("AudioBooks:");

        System.out.print("-------");
        System.out.println("-------------------------------------------------------------------------------------");

        for (Book book : bookList) 	//looping through arrayList for books
        {

              if(book instanceof AudioBook) //if book is instance of audiobook
              {

                    System.out.println(book.toString()); // output details of audiobook

              }

        }
        
        System.out.print("-------");
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("DVDs:");

        System.out.print("-------");
        System.out.println("-------------------------------------------------------------------------------------");

        for(DVD dvd: dvdList)
        {

              System.out.println(dvd.toString()); //output details of DVD

        }

  }
	
}