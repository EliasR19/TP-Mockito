package poque;

import java.util.ArrayList;
import java.util.List;


public class PokerStatus {
	
	List<Jugada> jugadasValidas = new ArrayList<Jugada>();
	
	public PokerStatus() {
		jugadasValidas.add(new Poquer());
		jugadasValidas.add(new Color());
		jugadasValidas.add(new Trio());
	}
	
	// Se supone que no hay cartas repetidas, ni no validas.
	
//	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
//		List<String> cartas = new ArrayList<String>();
//		cartas.add(carta1);cartas.add(carta2);cartas.add(carta3);cartas.add(carta4);cartas.add(carta5);
//		
//		List<String> valorCartas = cartas.stream().map(carta -> this.getNumero(carta)).collect(Collectors.toList());//.toArray(size -> new String[5]);
//		
//		for(int x = 0; x <cartas.size(); x++) {
//			List<String> valorCopia = new ArrayList<String>(valorCartas);
//			valorCopia.remove(x);
//			if(valorCopia.stream().allMatch(valor -> valor.equals(valorCartas.get(0)))) {
//				return "Poquer";
//			}
//		}
	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {		
		for(Jugada jugada : jugadasValidas) {
			if(jugada.verificar(carta1,carta2,carta3,carta4,carta5)) {
				return jugada.tipo();
			}
		}
		
		return "Nada";
	}


}
