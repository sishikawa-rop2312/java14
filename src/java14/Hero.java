package java14;

public class Hero {
	String name;
	int hp;
	static int money;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("1");
			return true;
		}

		if (obj instanceof Hero) {
			System.out.println("2");
			Hero h = (Hero) obj;
			if (this.name.equals(h.name)) {
				System.out.println("3");
				return true;
			}
		}

		return false;
	}

	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}
}
