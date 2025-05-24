package poque;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Color extends Jugada{





	@Override
	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		List<String> cartas = new ArrayList<String>();
		
		cartas.add(carta1);cartas.add(carta2);cartas.add(carta3);cartas.add(carta4);cartas.add(carta5);
		
		List<String> valorCartas = cartas.stream().map(carta -> this.getPalo(carta)).collect(Collectors.toList());//.toArray(size -> new String[5]);
		
		return valorCartas.stream().allMatch(valor -> valor.equals(valorCartas.get(0)));

	}
	
	@Override
	protected String tipo() {
		return "Color";
		
	}


}
