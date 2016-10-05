package klondike.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {

		
	private Card card1;

    @Before
    public void initialize() {
        card1 = new Card(Number.EIGHT,Suit.BRILLO,Boolean.FALSE);
        //card2 = new Card(Number.ACE,Suit.CORAZON,Boolean.FALSE);
    }
	
	//@Test
	//public void testSetHidden() {
	//	assertTrue(Boolean.FALSE=card1.setHidden(false));
//	}
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
		assertFalse(card1.isHidden());
	}

	@Test
	public void testToString() {
		 assertEquals("[EIGHT,BRILLO]", card1.toString());
	      
	}

}
