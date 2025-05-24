package poquer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import poque.*;

public class PokerStatusTest {
	
	PokerStatus poker;
	String carta1, carta2, carta3,carta4, carta5;
	
	@BeforeEach
	public void setUp() {
		
		poker = new PokerStatus();
		
		
	}
	
//	@Test
//	public void esPoquer() {
//		carta1 ="JC";
//		carta2 ="JP";
//		carta3 ="JT";
//		carta4 ="JD";
//		carta5 ="10D";
//		
//		assertTrue(poker.verificar(carta1, carta2, carta3, carta4, carta5));
//		
//	}
//	
//	
//	@Test
//	public void noEsPoque() {
//		carta1 ="10P";
//		carta2 ="1C";
//		carta3 ="JT";
//		carta4 ="KP";
//		carta5 ="5D";
//		
//		assertFalse(poker.verificar(carta1, carta2, carta3, carta4, carta5));
//		
//	}
//	
//	@Test
//	public void casiPoquer() {
//		carta1 ="1P";
//		carta2 ="1C";
//		carta3 ="1T";
//		carta4 ="KP";
//		carta5 ="5D";
//		
//		assertFalse(poker.verificar(carta1, carta2, carta3, carta4, carta5));
//	}
//	
	
	@Test
	public void esPoquer() {
		carta1 ="JC";
		carta2 ="JP";
		carta3 ="JT";
		carta4 ="JD";
		carta5 ="10D";
		
		assertEquals("Poquer", poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	
	@Test
	public void noEsPoque() {
		carta1 ="10P";
		carta2 ="1C";
		carta3 ="JT";
		carta4 ="KP";
		carta5 ="5D";
		
		assertEquals("Nada", poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	public void esColor() {
		carta1 ="1P";
		carta2 ="10P";
		carta3 ="KP";
		carta4 ="3P";
		carta5 ="8P";
		
		assertEquals("Color", poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	public void noEsColor() {
		carta1 ="1D";
		carta2 ="10P";
		carta3 ="KT";
		carta4 ="3P";
		carta5 ="8D";
		
		assertEquals("Nada", poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	public void esTrio() {
		carta1 ="1P";
		carta2 ="1D";
		carta3 ="1T";
		carta4 ="3P";
		carta5 ="8D";
		
		assertEquals("Trio", poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	public void noEsTrio() {
		carta1 ="1D";
		carta2 ="10P";
		carta3 ="KT";
		carta4 ="3P";
		carta5 ="8D";
		
		assertEquals("Nada", poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
}
