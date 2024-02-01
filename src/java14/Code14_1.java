package java14;

public class Code14_1 {
	public static void main(String[] args) {
		Empty e = new Empty();
		printAnything(e);
		
	}
	public static void printAnything(Object o) {
		// 「System.out.println」はtoString()を利用しているためEmptyクラスのtoString()が実行される
		System.out.println(o);
	}
}
