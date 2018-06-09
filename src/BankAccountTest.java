
public class BankAccountTest {

	public static void main(String[] args) {
//		BankAccount ba1 = new BankAccount();
//		ba1.UserAccountInfo();
//		ba1.addDeposit("savingsBalance", 300);
		
		BankAccount ba2 = new BankAccount();
		ba2.UserAccountInfo();
		ba2.addDeposit("checkingBalance", 500);
		ba2.UserAccountInfo();
		ba2.withdraw("checkingBalance", 200);
		ba2.UserAccountInfo();
	}

}
