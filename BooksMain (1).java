package projectbook;

import java.util.Scanner;

public class BooksMain

{

public static void main( String[] args)
{


	
    BooksList List = new BooksList();

    char selection;
    Scanner input = new Scanner( System.in );
    do
        {
            //display menu
    	    System.out.println("**********************************WELCOME***********************************");
    	    System.out.println("                       HONEY'S ONLINE BOOK STORE MANAGEMENT");
            System.out.println("****************************************************************************");
            System.out.println("Main Menu\n");
            System.out.println("1. Add a book ");
            System.out.println("2. Delete a book ");
            System.out.println("3. Show List ");
            System.out.println("4. Exit");
            System.out.println("****************************************************************************");

            //selection results
            selection = input.next().charAt(0);

            switch(selection){
            case '1':
                BooksList.Addbook();
                break;
            case '2':
                BooksList.Removebook();
                break;
            case '3':
                BooksList.DisplayArray();    
                break;
            case '4':  
                break;
            default:
                System.out.println("Invalid Selection");
        }//end Switch  

        }while( selection != 4);//end do

         }  }//end main
