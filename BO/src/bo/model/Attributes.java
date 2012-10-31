package bo.model;

public class Attributes {
	public int STR;
	public int DEX;
	public int CON;
	public int INT;
	public int WIS;
	public int CHA;
	
	
	public boolean satisfies(Attributes requirement) {
		return 
			STR >= requirement.STR &&
			DEX >= requirement.DEX &&
			CON >= requirement.CON &&
			INT >= requirement.INT &&
			WIS >= requirement.WIS &&
			CHA >= requirement.CHA;
	}
}
