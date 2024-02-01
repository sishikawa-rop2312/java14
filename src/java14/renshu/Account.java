package java14.renshu;

public class Account {
	String accountNumber; // 銀行口座
	int balance; // 残高
	
	/* ①文字列表現のメソッド */
	@Override
	public String toString() {
		return "\\" + this.balance + "（口座番号：" + this.accountNumber + "）";
	}
	
	/* ②等価判定のメソッド */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if ( obj instanceof Account) {
			Account a = (Account)obj;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
