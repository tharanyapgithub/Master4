package projectbook;
import java.awt.print.Book;
import java.util.*;


public class BooksList {

private static final String obj1 = null;

public static void Addbook()
{
Scanner input = new Scanner( System.in );
ArrayList<Books> book = new ArrayList<Books>(200);
   System.out.println("\n--------------");
   System.out.println("Please enter Book Name: ");
   String bname = input.nextLine(); //reads name
   

   System.out.println("Please enter Author Name: ");
   String aname = input.nextLine(); //reads name
 

   System.out.println("enter price: ");
   int p = input.nextInt();   //read price
   

   System.out.println("Enter quantity: ");
   int q = input.nextInt(); //reads name
   

   System.out.println("Discount: ");
   int d= input.nextInt(); //reads name
   
   book.add(new Books( bname, aname, p,q,d));
   
}

public static void Removebook() {
ArrayList<BooksList> book = new ArrayList<BooksList>(20);
   Scanner input = new Scanner( System.in );

   System.out.println("\n--------------");
   System.out.println("Please enter Name of Book you wish you remove");
   String  name = input.nextLine();
   remove(book );
   
}

private static void remove(ArrayList<BooksList> book) {
	System.out.println("Deleted Successfully. " );
	
}

static void DisplayArray() {
	
	try {
	System.out.println("Book Name         : "+Books.getAllBname());
	System.out.println("Name of the Author: "+Books.getAllAname());
	System.out.println("Book Price        : "+Books.getAllP());
	System.out.println("Book Quantity     : "+Books.getAllQ());
	System.out.println("Book Discount:    : "+Books.getAllD());
	System.out.println("****************************************************************************");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
}





