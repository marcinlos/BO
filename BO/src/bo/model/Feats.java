package bo.model;

import java.util.Collection;
import java.util.HashSet;

public class Feats implements BonusSource {

	Collection<Feat> feats = new HashSet<Feat>();
	
	@Override
	public Bonus getBonus() {
		// TODO Auto-generated method stub
		return null;
	}

}
