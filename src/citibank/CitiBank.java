package citibank;

import java.util.Scanner;

public class CitiBank {
	public static void main(String[] args) {
		BankService bank = new BankServiceImpl();
		Scanner scan = new Scanner(System.in);
		String option = "";
		do {
			System.out.println("Select one option");
			System.out.println("1: Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: Check Bank Balance");
			option = scan.next();
			switch(option) {
			case "1": {
				System.out.println("Enter amount to be deposited");
				double amount = scan.nextDouble();
				try {
					bank.deposit(amount);
				}catch(InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
				bank.balanceEnquiry();
				break;
			}
			case "2" :{
				System.out.println("Enter amount to be withdrawn");
				double amount = scan.nextDouble();
				double withdrawamount = 0;
				try {
					withdrawamount = bank.withdraw(amount);
				}catch(InvalidAmountException e) {
					System.out.println(e.getMessage());
				}catch(InsufficientFundsException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Withdraw Amount : "+ withdrawamount);
				bank.balanceEnquiry();
				break;
			}
			case "3":{
				bank.balanceEnquiry();
				break;
			}
			default: System.out.println("Invalid Option");
		}
		System.out.println("Do u want to continue: (yes/no)");
		option = scan.next();
		}while(option.equalsIgnoreCase("yes"));
		System.out.println("Program Ends");
		scan.close();
	}
}
