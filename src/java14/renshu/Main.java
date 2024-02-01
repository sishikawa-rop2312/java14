package java14.renshu;

public class Main {

	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		
		Account a2 = new Account();
		a2.accountNumber = " 4649";
		a2.balance = 1592;
		
		System.out.println(a);
		System.out.println(a.equals(a2));
	}

}
