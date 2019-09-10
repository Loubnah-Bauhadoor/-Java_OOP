import java.util.Scanner;
/**
 * 
 */

/**
 * @author Dell
 *
 */
public class labInventory {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mykeyboard = new Scanner(System.in);
		int choice;
		int count;
		int max;
		int num;
		String password;
	
		int size= mykeyboard.nextInt();
		Item [] itemDatabase= new Item [size];


		System.out.println("Welcome");
				
		System.out.println("Enter the amount of item you want to have in the list");
		int number= mykeyboard.nextInt();
				
		System.out.println("Enter your choice");
		choice = mykeyboard.nextInt();
				
		if (choice!= 1 && choice!= 2 &&choice!= 3 &&choice!= 4 &&choice!= 5 &&choice!= 6) {
			System.out.println("please enter a valid choice");
			break;
		}
				
				
		if (choice == 1) {
			do {
				System.out.print("Enter password:");
				password = mykeyboard.next();
						
				if (password != "DIgprog123") {
					max++;
					count++;
							
					System.out.println("Invalid Password");
				}
							
		}
				while(password != "Ditprog123" && count<3);
				System.out.println("1. Enter a new item to the inventory (password required)");
				System.out.println("2. Change information of an existing item (password required)");
				System.out.println("3. Display all the items with the specified category");
				System.out.println("4. Display all items with the specified category");
				System.out.println("5. Number of the items to be re-ordered");
				System.out.println("6. Quit");
					
				choice  = mykeyboard.nextInt();
					
					
			if (password != "Ditprog123" && max ==12) {
			System.out.println("Program detected suspicious activity and is terminating! ");
			break;
		}
				
			while (password == "Ditprog123" && count<3);
				do {
					System.out.println("Enter the new item you want to add in the inventory");
					num=mykeyboard.nextInt();
					
					
				for(int i = 0; i<num; i++) {
					
					System.out.println("Item ID"+ (i+1)+ ':');
					String itemId= mykeyboard.next();
					
					
					System.out.println("name"+ (i+1)+ ':');
					String name= mykeyboard.next();
					
					
					System.out.println("description"+ (i+1)+ ':');
					String description= mykeyboard.next();
					
					System.out.println("category"+ (i+1)+ ':');
					String category= mykeyboard.next();
					
					System.out.println("supplierName"+ (i+1)+ ':');
					String supplierName= mykeyboard.next();
					
					System.out.println("supplierContacts"+ (i+1)+ ':');
					String supplierContacts= mykeyboard.next();
					
					
					System.out.println("price"+ (i+1)+ ':');
					double price= mykeyboard.nextDouble();
					
					System.out.println("quantity"+ (i+1)+ ':');
					int quantity= mykeyboard.nextInt();					
						
				}
				break;
				
				
				String itemId;
				
				
				if (choice==2) {
					do {
						System.out.println("Enter password");
						password= mykeyboard.next();
						
						if (password != "Ditprog123") {
							count++;		
							
							System.out.println("invalid password");
						}
							
					 while (password != "Ditprog123" && count== 3);
						System.out.println("1. Enter a new Item to the inventory (password required)");
						System.out.println("2. Change information of an existing Item (password required)");
						System.out.println("3. Display all the Items with the specified category");
						System.out.println("4. Display all Items to be re-ordered");
						System.out.println("5. Number of Items currently in store");
						System.out.println("6. Quit");
						
						choice = mykeyboard.nextInt();
						
						while (password == "Ditprog123"&& count<3);
						
						System.out.println("Enter the itemId:");
						itemId = mykeyboard.next();
					}
					

			
					else if (choice == 5) {
						System.out.println("Number of items are"+ Item.getCounter());
					}
					
					else if (choice == 6) {
						System.out.println("Thank you for your time.");
						break;
					}
				
		}
	}
}
		
				

