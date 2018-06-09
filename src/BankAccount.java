import java.util.Random;
import java.util.ArrayList;

public class BankAccount {
//	class attributes
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
//	create static variable to access them for every class
	public static int countAccount = 0;
	public static int totalAmount = 0;
		
//	constructor
	public BankAccount() {
		countAccount ++;
		this.accountNumber = Long.toString(createBankAccountNumber());
//		this.checkingBalance = 0;
//		this.savingsBalance = 0;
	} 
	
	public BankAccount(int checking, int savings) {
		countAccount ++;
		this.accountNumber = Long.toString(createBankAccountNumber());
		this.checkingBalance = checking;
		this.savingsBalance = savings;
		totalAmount += savings;
		totalAmount += checking;
	}
	
//	create Bank Account with a random number with 10 digits
//	use the data type long because int can only hold 7 digits
	private long createBankAccountNumber(){
		long randomNum = (long)((Math.random()*90000000)+10000000);
		return randomNum;
	}
	
//	getter method for the user saving account
	public void getSavings() {
		this.savingsBalance = savingsBalance;
	}
	
//	getter method for the user checking account
	public void getChecking() {
		this.checkingBalance = checkingBalance;
	}
	
// add deposit to savings or checkings
	public void addDeposit(String reason, int someAmount) {
		if(reason.equals("savingsBalance")) {
			this.savingsBalance += someAmount;
			System.out.println("The amount " + someAmount + " is successfully added to your saving Account.");
		}
		else {
			this.checkingBalance += someAmount;
			System.out.println("The amount " + someAmount + " is successfully added to your checking Account.");
		}
		totalAmount += someAmount;
		System.out.println("TOTAL AMOUNT " + totalAmount);
	}
	
//	withdraw from one balance. If insufficient fund don't withdraw able
	public void withdraw(String accountName, int amount) {
		System.out.println("in here");
		if(accountName.equals("savingsBalance")) {
			if(this.savingsBalance < amount) {
				System.out.println("Sorry you have to less money to pay this bill");
			}
			else {
				this.savingsBalance -= amount;
				System.out.println("Bill successfully paid");
			}
		}
		if(accountName.equals("checkingBalance")) {
			System.out.println("in here2");
			if(this.checkingBalance < amount) {
				System.out.print("Sorry you have to less money on you're checking Account");
			}
			else {
				this.checkingBalance -= amount;
				System.out.print("Bill successfully paid with your checking Account");
			}
		}
	}
	
//	getter method for the user's checking account balance
//	print the BankAccount number. Notice the private method which is called in a public method!
	public void UserAccountInfo(){
		System.out.print("That's your Account Number: " + this.createBankAccountNumber());
		System.out.print("\nThose are you're savings: " + this.savingsBalance);
		System.out.print("\nThose are you're checkings: " + this.checkingBalance);
		System.out.print("\nMoney on your account after payed bill: " + this.checkingBalance);
		System.out.print("\nHow many Accounts exist: "+ countAccount + "\n");
	}
	
}
