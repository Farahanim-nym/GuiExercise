package Program;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		//array
		String[] pass= {"Daily pass","Weekly pass","Monthly pass","Top Up"};
		
		double price=0;
		double current=0;
		double value=0;
		//input
		System.out.println("--------------------------------------");
		System.out.print("Enter your first name : ");
		String firstname=obj.next();
		System.out.print("Enter your last name : ");
		String lastname=obj.next();
		System.out.print("Enter your identity card number : ");
		String ic=obj.next();
		System.out.print("Enter your phone number : ");
		String hp=obj.next();
		System.out.print("Enter your balance : ");
		double balance=obj.nextDouble();
		System.out.println("--------------------------------------");
		
		System.out.println("Can I help you? Press 1");
		System.out.println(" Press 1 to continue");
		System.out.println("Press 2 to exit ");
		int c=obj.nextInt();
		while(c==1) {
			
		
		
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
			for(int i=0;i<pass.length;i++) {
				System.out.println(i+pass[i]);
			}
			System.out.println("************************************");
			System.out.println();
			//input number pass
			System.out.println("Enter the number of the packages you want");
			int want=obj.nextInt();
			//if choose daily press 0
			if(want==0) {
				System.out.println();
				System.out.println("Daily pass.");
				System.out.println(" 2 GB 1 day: RM 3");
				System.out.println("To confirm press 1");
				int press=obj.nextInt();
				if(press==1) {
					System.out.println();
					if(balance>=3) {
					System.out.println("You have buy daily internet passes!");
					 price=3;
					}
				    else
				    	System.out.println("You have insufficient balance!Please top up ");
				}
				else {
					System.out.println("You have canceled your purchase. ");
					 price=0;
					
				}
			}
			////if choose weekly press 1
			else if(want==1) {
				System.out.println();
				System.out.println("Weekly pass.");
				System.out.println(" 3 GB 7 days: RM 10");
				System.out.println("To confirm press 1");
				int press1=obj.nextInt();
				if(press1==1) {
					System.out.println();
					if(balance>=10) {
					System.out.println("You have buy weekly internet passes!");
					 price=10;
					}
				    else
				    	System.out.println("You have insufficient balance!Please top up ");
			
				}
				else {
					System.out.println("You have canceled your purchase. ");
					price=0;
		}
			}
		    ////if choose monthly press 2
		    else if(want==2) {
		    	System.out.println();
			    System.out.println("Monthly pass.");
			    System.out.println(" 10 GB 30 days: RM 30");
			    System.out.println("To confirm press 1");
			    int press2=obj.nextInt();
			    if(press2==1) {
				    System.out.println();
				    if(balance>=30) {
				    System.out.println("You have buy monthly internet passes!");
				     price=10;
				    }
				    else {
				    	System.out.println("You have insufficient balance!Please top up ");
			}}
				    else {
					    System.out.println("You have canceled your purchase. ");
					      price=0;
					
				
		    }
		    }
			else if(want==3) {
				 System.out.println();
				 System.out.println("Top Up");
				 System.out.println(".");
				 int count=0;
				 do {
					 System.out.println("Enter the value you want to top up (RM 10-100");
					 System.out.print("RM");
					  value=obj.nextDouble();
					 
					 System.out.println("Press 0 to check current balance");
					 int exit=obj.nextInt();
					 if(exit==0) {
						 count=1;
					 }
				 }while(count==0);
			    	
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
		current=balance-price+value;
		System.out.println("Current balance\t\t: "+current);
		System.out.println("Thank You for using Hotlink !");
		System.out.println("********************************");
		System.out.println("Can I help you? Press 1");
		System.out.println(" Press 1 to continue");
		System.out.println("Press 2 to exit ");
		 c=obj.nextInt();
	}
		System.out.println("You have canceled your purchase. ");

}
}


	


