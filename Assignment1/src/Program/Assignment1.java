package Program;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		double price=0;
		
		//input
		System.out.print("Enter your first name : ");
		String firstname=obj.next();
		System.out.print("Enter your last name : ");
		String lastname=obj.next();
		System.out.print("Enter your identity card number : ");
		String ic=obj.next();
		System.out.print("Enter your phone number : ");
		String hp=obj.next();
		System.out.println();
		
		//Start system 
		System.out.println("Welcome to Hotlink centre!");
		System.out.println("You can buy your internet packages here.");
		System.out.println("Press button 1 to continue your purchase.");
		int button=obj.nextInt();
		
		if(button==1) {
			//menu
			System.out.println();
			System.out.println("***********INTERNET PASSES**********");
			System.out.println("1) Daily pass.");
			System.out.println("2) Weekly pass.");
			System.out.println("3) Monthly pass.");
			System.out.println("************************************");
			System.out.println();
			//input number pass
			System.out.println("Enter the number of the packages you want");
			int want=obj.nextInt();
			//if choose daily press 1
			if(want==1) {
				System.out.println();
				System.out.println("1) Daily pass.");
				System.out.println(" 2 GB 1 day: RM 3");
				System.out.println("To confirm press 1");
				int press=obj.nextInt();
				if(press==1) {
					System.out.println();
					System.out.println("You have buy daily internet passes!");
					 price=3;
				}
				else {
					System.out.println("You have canceled your purchase. ");
					 price=0;
					
				}
			}
			////if choose weekly press 2
			else if(want==2) {
				System.out.println();
				System.out.println("2) Weekly pass.");
				System.out.println(" 3 GB 7 days: RM 10");
				System.out.println("To confirm press 1");
				int press1=obj.nextInt();
				if(press1==1) {
					System.out.println();
					System.out.println("You have buy weekly internet passes!");
					 price=10;
				}
				else {
					System.out.println("You have canceled your purchase. ");
					price=0;
		}
		}
		    ////if choose monthly press 3
		    else if(want==3) {
		    	System.out.println();
			    System.out.println("2) Monthly pass.");
			    System.out.println(" 10 GB 30 days: RM 30");
			    System.out.println("To confirm press 1");
			    int press2=obj.nextInt();
			    if(press2==1) {
				    System.out.println();
				    System.out.println("You have buy monthly internet passes!");
				     price=10;
			}
			    else {
				    System.out.println("You have canceled your purchase. ");
				      price=0;
				
			}
		    }
		    
		    }
		else {
			System.out.println();
	    	System.out.println("You have canceled your purchase. ");
		}
		System.out.println();
		System.out.println("Name\t\t\t: "+firstname+" " +lastname);
		System.out.println("Identity card no.   \t: "+ic);
		System.out.println("Phone no. \t\t: "+hp);
		System.out.println("Total purchase  \t:RM "+price);
		System.out.println("Thank You for using Hotlink !");

	}

}
