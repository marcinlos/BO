package bo.model;

public class Armor {
	
	public enum Type {
		LIGHT,
		MEDIUM,
		HEAVY
	}
	
	public final String name;
	public final Type type;
	public final int bonus;
	public final int maxDex;
	public final int price;
	
	public Armor(String name, Type type, int bonus, int maxDex, 
			int price) {
		this.name = name;
		this.type = type;
		this.bonus = bonus;
		this.maxDex = maxDex;
		this.price = price;
	}
	
}
