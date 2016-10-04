package klondike.controller;

import klondike.models.StackCard;
import klondike.models.StackDeck;
import klondike.utils.IO;

public class DiscardToDeckController {

	private StackDeck deck;
	private StackCard discard;
	private IO io;

	public DiscardToDeckController(StackCard discard, StackDeck deck) {
		this.discard = discard;
		this.deck = deck;
		io = new IO();
	}

	public void execute() {
		if (discard.getStackCard().isEmpty()) {
			while (discard.getStackCard().size() != 0) {
				deck.getStackCard().push(discard.getStackCard().pop());
			}
		} else {
			io.writeln("El descarte a�n tiene cartas");
		}
	}
}

