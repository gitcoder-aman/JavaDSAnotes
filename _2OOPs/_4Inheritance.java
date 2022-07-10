package _2OOPs;

public class _4Inheritance {

	public static void main(String[] args) {
		Samsung s10 = new Samsung();
		s10.playGames();
		
		MobilePhone obj = new MobilePhone();
		obj.playGames();
		obj.playGames(4);

	}

}

class MobilePhone {
	boolean hasHeadphoneJack;
	String os;
	int price;
	int dimension;
	
	// Compile Time Polymorphism
	void playGames() {
		System.out.println("Samsung Play Games1");
	}
	void playGames(int x) {
		for(int i = 0; i < x; i++) {
		System.out.println("Playing games "+ i);
	}
  }
}
class Samsung extends MobilePhone {
	
	@Override
	void playGames() {
		System.out.println("Samsung Plays Games");
	}
	
} 
class Apple extends MobilePhone {
	
}
