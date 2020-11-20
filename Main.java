package ui;
import java.util.Scanner;
import model.Shop;

public class Main {
    Scanner sc;
	Shop myShop;
	
	Main(){
        sc = new Scanner(System.in);
		
    }
    
	public static void main(String[] args) {
		
		System.out.println("Welcome to the aplication");
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Main menu, please pick an option\n" +
				"(1)  \n" +
				"(2)  \n"+
				"(3)  \n"+
				"(4)  \n" +  
				"(0) To leave the application"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			break;
		case 2:
			break;
	
		case 3:
			
			break;

		case 4:
			
			break;
		
		default:
			System.out.println("Error, wrong option");
		
		}
	

	}

}