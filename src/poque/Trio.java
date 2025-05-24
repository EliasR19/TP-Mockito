package poque;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trio extends Jugada{



	@Override
	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> cartas = new ArrayList<String>();
		
		cartas.add(carta1);cartas.add(carta2);cartas.add(carta3);cartas.add(carta4);cartas.add(carta5);
		
		List<String> valorCartas = cartas.stream().map(carta -> this.getNumero(carta)).collect(Collectors.toList());//.toArray(size -> new String[5]);
		
		for(int x = 0; x <cartas.size(); x++) {
			List<String> valorCopia = new ArrayList<String>();
			String cartaActual = valorCartas.get(x);
			String temp = valorCartas.get(x);
			valorCartas.remove(x);
			valorCartas.addFirst(temp);
			
			
			valorCopia.add(temp);
			for(int n = 1; n < cartas.size() ; n++) {
				if(cartaActual.equals(valorCartas.get(n))) {
					valorCopia.add(cartaActual);
				}
			}
			//System.out.println(valorCopia);
			
			if(valorCopia.size() == 3 && valorCopia.stream().allMatch(valor -> valor.equals(valorCartas.get(0)))) {
				return true;
			}
		}

		return false;
	}
	
	@Override
	protected String tipo() {
		return "Trio";
		
	}


}
