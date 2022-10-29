package practiceprogram;
import java.util.Scanner;
public class Practice5 {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		String Username = "Marvin";
		String Password = "Gwapoko";
		boolean Start = true;
		boolean Choosing = true;
		
		int Choice_Product, qty, AddtoCart, CheckOut_Product;
		String[][] cart = new String [5][5];
		String[] Fruit_Product = {"Apple", "Mango", "Orange", "Santol"};
		int[] Fruit_Price = {60, 80, 40, 50};
		int[] Fruit_Stocks = {200, 100, 300, 90};
		
		
		String enteredUsername;
		String enteredPassword;
		
		System.out.println("*********** Welcom to M and M Fruit Basket **********");
		int attempt = 3;
		while(Start) {
			if(attempt == 0){
				Start = false;
				break;
			}
			System.out.print("Enter you Username: ");
			enteredUsername = Scan.next();
			System.out.print("Enter you Password: ");
			enteredPassword = Scan.next();
			
			
			if(!enteredUsername.equals(Username) || !enteredPassword.equals(Password)){
				System.out.print("Invalid Account !!!\n");
				break;
			}
			System.out.println("Choose a Product");
			
			Choice:
				while(Choosing) {
					for(int kung = 0;kung < Fruit_Product.length;kung++) {
						System.out.print("["+kung+"]" + Fruit_Product[kung] + " ");
					}
					System.out.print("Your Choice: ");
					Choice_Product = Scan.nextInt();
					
					if(Choice_Product > Fruit_Product.length) {
						System.out.print("Sorry Product not Found\n");
						continue Choice;
					}
					System.out.print("\nFruit Product: " + Fruit_Product[Choice_Product]);
					System.out.print("\nFruit Price: " + Fruit_Price[Choice_Product]);
					System.out.print("\nFruit Stocks: " + Fruit_Stocks[Choice_Product]);
					
					System.out.print("\nEnter Quantity: ");
					qty = Scan.nextInt();
					System.out.print("Total Amount: " + "Php" + (qty * Fruit_Price[Choice_Product]));
					System.out.print("\nYou want to Add to Cart? [1]Yes [2]No: ");
					AddtoCart = Scan.nextInt();
					
					if(AddtoCart == 1 ) {
						System.out.println("The Fruit was Added to your Cart ! ! !");
						Fruit_Stocks[Choice_Product] = Fruit_Stocks[Choice_Product] - qty;
					}
					System.out.println("Do you to Check Out? [1]Yes [2]No");
					CheckOut_Product = Scan.nextInt();
					if(CheckOut_Product == 1) {
						System.out.print("The Product was CheckOut ! ! !");
						Start = false;
						break;
					}
			
					
					
				}
			
		}

	}

}
