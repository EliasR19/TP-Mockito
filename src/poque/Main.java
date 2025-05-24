package poque;

public class Main {

	public static void main(String[] args) {
		PokerStatus pok = new PokerStatus();
		
		
		System.out.println(pok.verificar("2T", "2D", "1D", "JD", "9D"));
		
		
		Jugada trio = new Trio();
		
		System.out.println(trio.verificar("2T", "QD", "2D", "3C", "2D"));
	}

}
