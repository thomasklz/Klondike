package klondike.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {

		
	private Card card1;

    @Before
    public void initialize() {
        card1 = new Card(Number.EIGHT,Suit.BRILLO,Boolean.TRUE);
        
    }
	
	@Test
	public void testSetHidden() {
		card1.setHidden(false);
		assertFalse(card1.isHidden());
	}
	@Test
	public void testGetSuit() {
		assertEquals(Suit.BRILLO, card1.getSuit());
	   }

	@Test
	public void testGetNumber() {
		assertEquals(Number.EIGHT, card1.getNumber());
	}

	@Test
	public void testIsHidden() {
		assertTrue(card1.isHidden());
	}

	@Test
	public void testToString() {
		card1.setHidden(true);
		assertTrue(card1.toString().equals("[]"));
	}

}
