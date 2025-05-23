package poque;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PokerStatus {

	
	// Se supone que no hay cartas repetidas, ni no validas.
	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> cartas = new ArrayList<String>();
		cartas.add(carta1);cartas.add(carta2);cartas.add(carta3);cartas.add(carta4);cartas.add(carta5);
		
		List<String> valorCartas = cartas.stream().map(carta -> this.getNumero(carta)).collect(Collectors.toList());//.toArray(size -> new String[5]);
		
		for(int x = 0; x <cartas.size(); x++) {
			List<String> valorCopia = new ArrayList<String>(valorCartas);
			valorCopia.remove(x);
			if(valorCopia.stream().allMatch(valor -> valor.equals(valorCartas.get(0)))) {
				return true;
			}
		}

		
		return false;
	}

	private String getPalo(String c) {
		return c.length() == 2 ? c.substring(1,1) : c.substring(2);
		
	}

	public String getNumero(String c) {
		return c.length() == 2 ? c.substring(0,1) : c.substring(0, 2);
	}
}
