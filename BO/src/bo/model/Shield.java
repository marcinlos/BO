package bo.model;

public class Shield {

	public enum Type {
		NORMAL,
		TOWER
	}
	
	public final String name;
	public final Type type;
	public final int bonus;
	
	public Shield(String name, Type type, int bonus) {
		this.name = name;
		this.type = type;
		this.bonus = bonus;
	}
	
}
