package scartchPad;
class Aa{
	void print(){
		System.out.println("A");
	}
}

class Bb extends Aa {
	void print(){
		System.out.println("B");
	}
}

public class MOtest {
	public static void main(String[] args) {
		Aa ab = new Bb();
		ab.print();
	}

}
