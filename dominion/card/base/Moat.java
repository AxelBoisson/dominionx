package dominion.card.base;
import java.util.*;

import dominion.*;
import dominion.card.*;

/**
 * Carte Douves (Moat)
 * 
 * +2 Cartes.
 * Lorsqu’un adversaire joue une carte Attaque, vous pouvez dévoiler cette carte de votre main. 
 * Dans ce cas, l’Attaque n’a pas d’effet sur vous.
 */
public class Moat extends ReactionCard {
	
	public Moat (){
		super("Douves",2);
	}
	
	public String toString() {
		return super.toString() + "+2 Cartes.\n" + 
				"Lorsqu’un adversaire joue une carte Attaque, vous pouvez dévoiler cette carte de votre main. \n"
				+ " Dans ce cas, l’Attaque n’a pas d’effet sur vous.";
	}

	
	public void play(Player p) {
		p.drawCard();
		p.drawCard();
		
	}
	
	
}