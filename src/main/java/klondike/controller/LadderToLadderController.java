package klondike.controller;

import java.util.ArrayList;

import klondike.models.StackCard;
import klondike.models.StackLadder;
import klondike.utils.IO;

public class LadderToLadderController {
	
	private ArrayList<StackLadder> ladders;
	private IO io;
	
	public LadderToLadderController(ArrayList<StackLadder> ladders){
		this.ladders = ladders;
		io = new IO();
	}
	
	public void execute(){
		int fromLadder = io.readInt("De que Escalera? [1-7]:");
		int howManyCards = io.readInt("Cuantas Cartas?:");
		int toLadder = io.readInt("A que Escalera? [1-7]:");
		StackLadder from = ladders.get(fromLadder - 1);
		StackLadder to = ladders.get(toLadder - 1);
		int valueFromLadder = from.getStackCard().lastElement().getNumber().getCardValue() - howManyCards;
		int valueToLadder = to.getStackCard().lastElement().getNumber().getCardValue();
		if (valueFromLadder == valueToLadder+1) {
			StackCard stackCard = new StackCard();
			for (int i = 0; i < howManyCards; i++) {
				stackCard.getStackCard().push(ladders.get(fromLadder - 1).getStackCard().pop());
			}
			while (stackCard.getStackCard().size() != 0) {
				ladders.get(toLadder - 1).getStackCard().push(stackCard.getStackCard().pop());
			}
		} else {
			io.writeln("Selección no válida");
		}
	}
}
