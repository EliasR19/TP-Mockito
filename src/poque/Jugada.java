package poque;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Jugada {
	
	
	public abstract boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5);
	
	
	protected List<String> getNumerosMano(List<String> cartas){
		
		return cartas.stream().map(carta -> this.getNumero(carta)).collect(Collectors.toList());
	}
	
	
	protected List<String> getPalosMano(List<String> cartas){
		return cartas.stream().map(carta -> this.getPalo(carta)).collect(Collectors.toList());
	}
	
	protected String getPalo(String c) {
		return c.length() == 2 ? c.substring(1) : c.substring(2);
	}

	protected String getNumero(String c) {
		return c.length() == 2 ? c.substring(0,1) : c.substring(0, 2);
	}

	protected abstract String tipo();
}
