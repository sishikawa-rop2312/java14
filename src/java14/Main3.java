package java14;

public class Main3 {
	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);

		Hero h1 = new Hero();
		Hero h2 = new Hero();
		
		Hero.money = 100;
		System.out.println(Hero.money);
		System.out.println(h1.money);
		System.out.println(h2.money);
		
		h1.money = 300;
		System.out.println(Hero.money);
		System.out.println(h1.money);
		System.out.println(h2.money);
	}
}
