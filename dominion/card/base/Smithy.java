package dominion.card.base;
import java.util.*;
import dominion.*;
import dominion.card.*;

/**
 * Carte Forgeron (Smithy)
 * 
 * +3 Cartes.
 */
public class Smithy extends ActionCard {
	
	public Smithy() {
		super("Forgeron",4);
	}
	
	public String toString() {
		return super.toString() + "+3 Cartes.";
	}
	
	public void play(Player p) {
		Card c;
		for(int i = 0; i<3;i++) {
			c = p.drawCard();
			p.setDiscard(c);
		}
	}
	
}